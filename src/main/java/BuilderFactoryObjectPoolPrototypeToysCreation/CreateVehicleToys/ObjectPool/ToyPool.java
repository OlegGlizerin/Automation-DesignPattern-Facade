package BuilderFactoryObjectPoolPrototypeToysCreation.CreateVehicleToys.ObjectPool;

import BuilderFactoryObjectPoolPrototypeToysCreation.ToysProducts.AbstractToyWrapper.EToysWrappers;
import BuilderFactoryObjectPoolPrototypeToysCreation.CreateVehicleToys.Builder.BuilderToyBox;
import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.IVehicle;

import java.util.*;


import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toMap;


/**
 * Object pool design pattern to mange the PooledToyObjects, if somone asked for Bike, he will get it, but if he bring it back, that means some one else can take it instead.
 * Each object has its expiration time set for example to 10 seconds, if no one using it for 10 seconds it will be removed from the object pool.
 * expTime used to avoid objects explosion in the heap.
 */
public class ToyPool {
    private static long expTime = 10000;//10 seconds
    public static HashMap<PooledToyObject, Long> availableMap = new HashMap<PooledToyObject, Long>();
    public static HashMap<PooledToyObject, Long> inUseMap = new HashMap<PooledToyObject, Long>();


    /**
     * Get new or existing object from the object pool
     * @param vehicle , checking if this param exists in the object pool
     * @return
     */
    public synchronized static PooledToyObject getObject(IVehicle vehicle) {
        long now = System.currentTimeMillis();

        if (!availableMap.isEmpty()) {
            for (Map.Entry<PooledToyObject, Long> entry : availableMap.entrySet()) {
                if (now - entry.getValue() > expTime) { //object has expired
                    popElement(availableMap);
                } else {
                    PooledToyObject pooledToyObject = popElement(availableMap, entry.getKey());
                    push(inUseMap, pooledToyObject, now);
                    return pooledToyObject;
                }
            }
        }
        // either no PooledToyObject is available or each has expired, so return a new one
        return createPooledObject(vehicle, now);
    }

    /**
     * Init the new pooledToyObject because there is no available one.
     * @param vehicle - toy vehicle to add to pooled items
     * @param now - now time of the system
     * @return return PooledToyObject that newely create by the builder design pattern (line 44), the toy created with bag wrapper
     */
    private synchronized static PooledToyObject createPooledObject(IVehicle vehicle, long now) {
        BuilderToyBox builderToyBox = new BuilderToyBox.ToysBuilder(vehicle).wrapper(EToysWrappers.BAG).build();
        PooledToyObject pooledToyObject = new PooledToyObject();
        pooledToyObject.setToy(builderToyBox);
        push(inUseMap, pooledToyObject, now);
        return pooledToyObject;
    }

    /**
     * push  pooledToyObject to the map
     * @param map
     * @param pooledToyObject
     * @param now
     */
    private synchronized static void push(HashMap<PooledToyObject, Long> map,
                                          PooledToyObject pooledToyObject, long now) {
        map.put(pooledToyObject, now);
    }

    /**
     * release pooledToyObject
     * @param pooledToyObject
     */
    public static void releaseObject(PooledToyObject pooledToyObject) {
        cleanUp(pooledToyObject);
        availableMap.put(pooledToyObject, System.currentTimeMillis());
        inUseMap.remove(pooledToyObject);
    }

    /**
     * delete pooledToyObject
     * @param map
     * @return
     */
    private static PooledToyObject popElement(HashMap<PooledToyObject, Long> map) {
        Map.Entry<PooledToyObject, Long> entry = map.entrySet().iterator().next();
        PooledToyObject key= entry.getKey();
        //Long value=entry.getValue();
        map.remove(entry.getKey());
        return key;
    }

    private static PooledToyObject popElement(HashMap<PooledToyObject, Long> map, PooledToyObject key) {
        map.remove(key);
        return key;
    }


    public static void cleanUp(PooledToyObject pooledToyObject) {
        pooledToyObject.setToy(null);
    }
}
