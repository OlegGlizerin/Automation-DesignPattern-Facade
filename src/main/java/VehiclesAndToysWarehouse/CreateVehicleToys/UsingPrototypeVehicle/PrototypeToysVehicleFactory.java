package VehiclesAndToysWarehouse.CreateVehicleToys.UsingPrototypeVehicle;

import VehiclesProductionLine.Vehicles.IVehicle;
import VehiclesProductionLine.Vehicles.Models.EVehicleType;

import java.util.HashMap;
import java.util.Map;

public class PrototypeToysVehicleFactory {
    private static Map<EVehicleType , IVehicle> prototypes = new HashMap<EVehicleType , IVehicle>();

    /**
     * Shallow copy of the Object Vehicles, that means 2 clones of the same object would be changed even if the change will occur on only 1 of them.
     * @param vehicleType - BIKE, PRIVATE, JEEP, TRUCK.
     * @return vehicle object with shallow copy.
     * @throws CloneNotSupportedException (will throw it only if the object doesn't implemented the Clonable interface
     */
    public static IVehicle getClone(EVehicleType vehicleType) throws CloneNotSupportedException {
        return (prototypes.get(vehicleType)).clone();
    }

    public static boolean contains(IVehicle vehicle) {
        return prototypes.containsKey(vehicle.getVehicleType());
    }

    public static void remove(IVehicle vehicle) {
        prototypes.remove(vehicle);
    }

    public static void add(IVehicle vehicle) {
        prototypes.put(vehicle.getVehicleType(),vehicle);
    }

    public static Map<EVehicleType, IVehicle> getPrototypes() {
        return prototypes;
    }
}
