package VehiclesCityEnterprises.Concrete;

import VehiclesProductionLine.Vehicles.IVehicle;
import VehiclesProductionLine.Vehicles.Models.EVehicleType;

import java.util.HashSet;

public class HerzliaEnterprise implements IEnterprise {

    private static final HashSet<IVehicle> vehicles = new HashSet<IVehicle>();

    /**
     * This is a specific enterprise located at Herzlia
     * @param vehicle - a vehicle we want to build
     */
    @Override
    public void buildVehicle(IVehicle vehicle) {
        vehicle.construct();
        add(vehicle);
    }


    private void add(IVehicle vehicle) {
        if(!vehicles.contains(vehicle)){
            vehicles.add(vehicle);
        }
    }

    public IVehicle getVehicle(EVehicleType vehicleType) {
        IVehicle vehicle = null;
        HashSet<IVehicle> iterateSet = vehicles;

        while((vehicle = iterateSet.iterator().next()) != null) {
            if(vehicle.getClass().getSimpleName().toUpperCase().equals(vehicleType.toString())) {
                return vehicle;
            }
            iterateSet.remove(vehicle);
        }
    return  null;
    }
}
