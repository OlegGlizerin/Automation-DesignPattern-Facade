package FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.FacadeAdapterDecoratorVehicleMaker.AdapterDBInteraction.DBManagers;

import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.FacadeAdapterDecoratorVehicleMaker.AdapterDBInteraction.IDBMongo;

public class DBMongoManager implements IDBMongo {
    @Override
    public void storeToMongo() {
        System.out.println("Store to Mongo DB.");
    }

    @Override
    public void getData() {
        System.out.println("get some data from mongo.");
    }
}
