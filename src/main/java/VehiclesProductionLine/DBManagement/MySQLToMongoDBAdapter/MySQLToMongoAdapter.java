package VehiclesProductionLine.DBManagement.MySQLToMongoDBAdapter;

import VehiclesProductionLine.DBManagement.IDBMongo;
import VehiclesProductionLine.DBManagement.IDBMySQL;

public class MySQLToMongoAdapter implements IDBMongo {
    private IDBMySQL idbMySQL = null;

    public MySQLToMongoAdapter(IDBMySQL idbMySQL) {
        this.idbMySQL = idbMySQL;
    }

    @Override
    public void storeToMongo() {
        
    }
}
