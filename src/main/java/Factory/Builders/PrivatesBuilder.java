package Factory.Builders;

import ProductionLine.Car.Car;
import ProductionLine.Car.CarModels.Honda.HondaPrivateModel;
import ProductionLine.Car.CarModels.Mazda.MazdaPrivateModel;

public class PrivatesBuilder extends CarBuilder{

    @Override
    public Car buildCar(String carModel) {
        if(carModel.equals("HONDA")) {
            return new HondaPrivateModel();
        }
        else if(carModel.equals("MAZDA")) {
            return new MazdaPrivateModel();
        }
        return null;
    }


}
