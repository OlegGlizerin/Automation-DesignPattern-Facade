package VehiclesCityFactories.FactoryProxys;

import VehiclesCityFactories.HerzliaFactory;
import VehiclesCityFactories.IFactory;
import VehiclesProductionLine.VehicleSkeleton.VehicleModels.EModels;
import VehiclesProductionLine.VehicleSkeleton.IVehicle;

public class HerzliaFacotryProxy implements IFactory {
    private HerzliaFactory herzliaFactory = null;

    /**
     * Lets supose that to instantiate the factory is very expensive(as in the real world), so I'm using here the Proxy Pattern:
     * It holds the reference to the factory as a private member and instantiate it only once! and only when needed! How cool is that :)
     * If we look at this logicaly, it makes sense, supose we want instantiate The Factory only once and use it, so Proxy Pattern fits here perfectly,
     * We now can instantiate some FactoryProxy and build as many cars as we want.
     * @param car - is the car we want to build
     */
    @Override
    public void buildCar(IVehicle car) {
        if(herzliaFactory == null) {
            herzliaFactory = new HerzliaFactory();
        }
        herzliaFactory.buildCar(car);
    }

    @Override
    public IVehicle getCar(EModels model) {
        return herzliaFactory.getCar(model);
    }
}
