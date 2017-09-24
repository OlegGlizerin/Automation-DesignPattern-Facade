package VehiclesProductionLine.DBManagement.DBManagers;

import VehiclesProductionLine.DBManagement.IDBMySQL;

public class DBMySQLManager implements IDBMySQL{
    @Override
    public void storeToMySQL() {
        System.out.println("Store to MySQL DB.");
    }
}
