package Factory.Builders;

import ProductionLine.Car.Car;

public class CarBuilder {


    public Car buildCar(Car car) {
        return car.constructCar();
    }
}
