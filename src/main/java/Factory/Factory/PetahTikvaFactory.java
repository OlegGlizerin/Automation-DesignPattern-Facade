package Factory.Factory;


import ProductionLine.Car.CarModels.EModels;
import ProductionLine.Car.ICar;

import java.util.ArrayList;

public class PetahTikvaFactory implements IFactory {

    private ArrayList<ICar> cars = new ArrayList<ICar>();

    /**
     * This is a specific factory located at PetahTikva
     * @param car - a car we want to build
     */
    @Override
    public void buildCar(ICar car) {
        car.construct();
        add(car);
    }


    private void add(ICar car) {
        this.cars.add(car);
    }

    public ICar getCar(EModels model) {
        for(ICar car: cars) {
            if(car.getCarModel().toString().equals(model.toString())) {
                return car;
            }
        }
        return null;
    }
}
