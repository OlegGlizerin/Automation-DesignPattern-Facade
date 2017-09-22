package Factory.Factory.FactoryProxys;

import Factory.Factory.IFactory;
import Factory.Factory.PetahTikvaFactory;
import ProductionLine.Car.CarModels.EModels;
import ProductionLine.Car.ICar;

public class PetahTikvaFactoryProxy implements IFactory {
    private PetahTikvaFactory petahTikvaFactory = null;


    /**
     * Lets supose that to instantiate the factory is very expensive(as in the real world), so I'm using here the Proxy Pattern:
     * It holds the reference to the factory as a private member and instantiate it only once! and only when needed! How cool is that :)
     * If we look at this logicaly, it makes sense, supose we want instantiate The Factory only once and use it, so Proxy Pattern fits here perfectly,
     * We now can instantiate some FactoryProxy and build as many cars as we want.
     * @param car - is the car we want to build
     */
    @Override
    public void buildCar(ICar car) {
        if(petahTikvaFactory == null) {
            petahTikvaFactory = new PetahTikvaFactory();
        }
        petahTikvaFactory.buildCar(car);
    }

    @Override
    public ICar getCar(EModels model) {
        return petahTikvaFactory.getCar(model);
    }
}
