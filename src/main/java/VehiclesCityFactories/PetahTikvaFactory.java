package VehiclesCityFactories;


import VehiclesProductionLine.VehicleSkeleton.VehicleModels.EModels;
import VehiclesProductionLine.VehicleSkeleton.IVehicle;

import java.util.ArrayList;

public class PetahTikvaFactory implements IFactory {

    private ArrayList<IVehicle> cars = new ArrayList<IVehicle>();

    /**
     * This is a specific factory located at PetahTikva
     * @param car - a car we want to build
     */
    @Override
    public void buildCar(IVehicle car) {
        car.construct();
        add(car);
    }


    private void add(IVehicle car) {
        this.cars.add(car);
    }

    public IVehicle getCar(EModels model) {
        for(IVehicle car: cars) {
            if(car.getCarModel().toString().equals(model.toString())) {
                return car;
            }
        }
        return null;
    }
}
