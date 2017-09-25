package VehiclesCityFactories;

import VehiclesProductionLine.VehicleStructure.IVehicle;
import VehiclesProductionLine.VehicleStructure.VehicleModels.EVehicleType;

import java.util.HashMap;

public class HerzliaFactory implements IFactory {

    private static final HashMap<EVehicleType, IVehicle> vehicles = new HashMap();

    /**
     * This is a specific factory located at Herzlia
     * @param vehicle - a vehicle we want to build
     */
    @Override
    public void buildVehicle(IVehicle vehicle) {
        vehicle.construct();
        add(vehicle);
    }


    private void add(IVehicle vehicle) {
        if(!this.vehicles.containsKey(vehicle.getVehicleType())) {
            this.vehicles.put(EVehicleType.getByType(vehicle.getVehicleType().name()), vehicle);
        }
    }

    public IVehicle getVehicle(EVehicleType vehicleType) {
        for(IVehicle vehicle: vehicles.values()) {
            if(vehicle.getVehicleType().equals(vehicleType)) {
                return vehicle;
            }
        }
        return null;
    }
}
