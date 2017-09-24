package VehiclesCityFactories;

import VehiclesProductionLine.VehicleStructure.VehicleModels.EModels;
import VehiclesProductionLine.VehicleStructure.IVehicle;

import java.util.ArrayList;

public class HerzliaFactory implements IFactory {

    private ArrayList<IVehicle> vehicles = new ArrayList<IVehicle>();

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
        this.vehicles.add(vehicle);
    }

    public IVehicle getVehicle(EModels model) {
        for(IVehicle vehicle: vehicles) {
            if(vehicle.getVehicleModel().toString().equals(model.toString())) {
                return vehicle;
            }
        }
        return null;
    }
}
