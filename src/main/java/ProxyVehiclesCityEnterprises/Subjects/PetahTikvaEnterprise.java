package ProxyVehiclesCityEnterprises.Subjects;


import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.IVehicle;
import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.EVehicleType;

import java.util.HashMap;

public class PetahTikvaEnterprise implements IEnterprise {

    private static final HashMap<EVehicleType, IVehicle> vehicles = new HashMap();

    /**
     * This is a specific enterprise located at PetahTikva
     * @param vehicle - a vehicle we want to build
     */
    @Override
    public void buildVehicle(IVehicle vehicle) {
        vehicle.construct();
        add(vehicle);
    }


    private void add(IVehicle vehicle) {
        if(!this.vehicles.containsKey(vehicle.getClass().getSimpleName())) {
            this.vehicles.put(EVehicleType.getByType(vehicle.getVehicleType().name().toUpperCase()), vehicle);
        }
    }

    public IVehicle getVehicle(EVehicleType vehicleType) {
        for(IVehicle vehicle: vehicles.values()) {
            if(vehicle.getClass().getSimpleName().equals(vehicleType)) {
                return vehicle;
            }
        }
        return null;
    }
}
