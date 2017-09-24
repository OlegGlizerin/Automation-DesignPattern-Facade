package VehiclesProductionLine.DBManagement.DBManagers;

import VehiclesProductionLine.DBManagement.IDBMongo;

public class DBMongoManager implements IDBMongo {
    @Override
    public void storeToMongo() {
        System.out.println("Store to Mongo DB.");
    }
}
