package Factory.Builders;

import ProductionLine.Car.Car;
import ProductionLine.Car.CarModels.Honda.HondaTruckModel;
import ProductionLine.Car.CarModels.Mazda.MazdaTruckModel;


public class TrucksBuilder extends CarBuilder {
    @Override
    public Car buildCar(String carModel) {
        if(carModel.equals("HONDA")) {
            return new HondaTruckModel();
        }
        else if(carModel.equals("MAZDA")) {
            return new MazdaTruckModel();
        }

        return null;
    }
}
