package Factory.Factory;

import ProductionLine.Car.CarModels.EModels;
import ProductionLine.Car.ICar;


/**
 * The Factory Interface.
 */
public interface IFactory {
    void buildCar(ICar car);
    ICar getCar(EModels model);
}
