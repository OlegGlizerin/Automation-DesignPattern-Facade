package VehiclesProductionLine.DBManagement.DBManagers;

import VehiclesProductionLine.DBManagement.IDBMySQL;

public class DBMySQLManager implements IDBMySQL{
    @Override
    public void storeToMySQL() {
        System.out.println("Store to MySQL DB.");
    }

    @Override
    public void getData() {
        System.out.println("get some data from mysql.");
    }
}
