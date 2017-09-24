package VehiclesCityFactories.FactoryProxys;

import VehiclesCityFactories.IFactory;
import VehiclesCityFactories.PetahTikvaFactory;
import VehiclesProductionLine.VehicleStructure.VehicleModels.EModels;
import VehiclesProductionLine.VehicleStructure.IVehicle;

public class PetahTikvaFactoryProxy implements IFactory {
    private PetahTikvaFactory petahTikvaFactory = null;


    /**
     * Lets supose that to instantiate the factory is very expensive(as in the real world), so I'm using here the Proxy Pattern:
     * It holds the reference to the factory as a private member and instantiate it only once! and only when needed! How cool is that :)
     * If we look at this logicaly, it makes sense, supose we want instantiate The Factory only once and use it, so Proxy Pattern fits here perfectly,
     * We now can instantiate some FactoryProxy and build as many vehicles as we want.
     * @param vehicle - is the vehicle we want to build
     */
    @Override
    public void buildVehicle(IVehicle vehicle) {
        if(petahTikvaFactory == null) {
            petahTikvaFactory = new PetahTikvaFactory();
        }
        petahTikvaFactory.buildVehicle(vehicle);
    }

    @Override
    public IVehicle getVehicle(EModels model) {
        return petahTikvaFactory.getVehicle(model);
    }
}
