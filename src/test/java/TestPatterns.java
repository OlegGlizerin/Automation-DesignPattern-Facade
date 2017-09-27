import VehiclesAndToysWarehouse.CreateVehicleToys.UsingToysObjectPool.PooledToyObject;
import VehiclesAndToysWarehouse.CreateVehicleToys.UsingToysObjectPool.ToyPool;
import VehiclesCityEnterprises.Proxys.HerzliaEnterpriseProxy;
import VehiclesProductionLine.Vehicles.IVehicle;
import VehiclesProductionLine.Vehicles.Models.EVehicleType;
import VehiclesProductionLine.Vehicles.Models.Types.Bikes.Bike;
import VehiclesProductionLine.Vehicles.Models.EVehicleModel;
import VehiclesProductionLine.Vehicles.Models.Types.Trucks.Truck;
import org.testng.annotations.Test;


/**
 * Let's say the client want to build a vehicle,
 * so we give him the VehicleMaker that easy can make a good vehicle with it's identical abilities.
 * Structural patterns used (Adapter,Facade,Decorator,Proxy,FlyWeight,Bridge,Composite) , also creational pattern used (Builder,Prototype,Abstract Factory) .
 */
public class TestPatterns {

   @Test
    public void carBuildTest() throws ClassNotFoundException, IllegalAccessException, InstantiationException, CloneNotSupportedException {
       HerzliaEnterpriseProxy herzliaEnterpriseProxy = new HerzliaEnterpriseProxy();
      herzliaEnterpriseProxy.buildVehicle(new Bike(EVehicleModel.HONDA));
      herzliaEnterpriseProxy.buildVehicle(new Bike(EVehicleModel.HONDA));
      herzliaEnterpriseProxy.buildVehicle(new Bike(EVehicleModel.MAZDA));
      herzliaEnterpriseProxy.buildVehicle(new Bike(EVehicleModel.MAZDA));
      herzliaEnterpriseProxy.buildVehicle(new Bike(EVehicleModel.HONDA));
      herzliaEnterpriseProxy.buildVehicle(new Truck(EVehicleModel.HONDA));
      herzliaEnterpriseProxy.buildVehicle(new Truck(EVehicleModel.HONDA));



       IVehicle vehicle = herzliaEnterpriseProxy.getVehicle(EVehicleType.BIKE);
//       HerzliaWarehouse herzliaWarehouse = new HerzliaWarehouse(new USAExporter());
//       herzliaWarehouse.sellCar(vehicle);
//
//       vehicle = herzliaEnterpriseProxy.getVehicle(EVehicleType.TRUCK);
//       herzliaWarehouse.sellCar(vehicle);

//       IVehicle vehicle1 = herzliaWarehouse.getClone(EVehicleType.BIKE);



//       herzliaWarehouse.buildToyWithBuilder(vehicle);
//
//       herzliaWarehouse.buildToyWithFactory(vehicle);

           PooledToyObject pooledToyObject = ToyPool.getObject(vehicle);
           PooledToyObject pooledToyObject2 = ToyPool.getObject(vehicle);
//           pooledToyObject.getToy().showProducts();
//           pooledToyObject.getToy().showCost();
           ToyPool.releaseObject(pooledToyObject);
//           ToyPool.cleanUp(pooledToyObject);


    }
}
