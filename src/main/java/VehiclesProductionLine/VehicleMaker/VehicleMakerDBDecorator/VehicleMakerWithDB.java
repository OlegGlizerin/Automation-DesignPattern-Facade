package VehiclesProductionLine.VehicleMaker.VehicleMakerDBDecorator;

import VehiclesProductionLine.DBManagement.DBManagers.DBMySQLManager;
import VehiclesProductionLine.DBManagement.IDBMongo;
import VehiclesProductionLine.DBManagement.MySQLToMongoDBAdapter.MySQLToMongoAdapter;
import VehiclesProductionLine.VehicleMaker.VehicleMakerDecorator;
import VehiclesProductionLine.VehicleMaker.IMaker;

public class VehicleMakerWithDB extends VehicleMakerDecorator {
    private IDBMongo mySQLToMongoAdapter = null;

    /**
     * Composite design pattern used to build body of the vehicle, first I initiate the IComponent items, add them to the body, and when we want to build
     * the body, it builds all the items that the body holds.
     */
    public VehicleMakerWithDB(IMaker maker) {
        super(maker);
        mySQLToMongoAdapter = new MySQLToMongoAdapter(new DBMySQLManager());
    }


    /**
     * Facade pattern used here - lets assume it was to complex for the client to build a wheels, content and engine by himself.
     * So in this case, the solution is
     * to create a facade class that allows to run all this functionality at one function - buildVehicle(), using the body.make()
     */
    @Override
    public void buildVehicle() {
        maker.buildVehicle();
        saveToDB();//decorated method
    }

    /**
     * This function added as a private because we want add functionality that saves some job to the DB, so I choose to do it with the Decorator pattern
     * This pattern allows us to use the VehicleMakerWithDB without changing the VehicleMaker class, but to add the save to DB method.
     * This function called in buildVehicle()
     * (The saveToDB itself using the adapter design pattern.), store to mongo in the adapter class acts same as store to MySql,
     * the reason I suposed it to act like this is for example that we still don't have the mongo db DB, so it uses the mysql only.
     */
    private void saveToDB() {
        mySQLToMongoAdapter.storeToMongo();
    }
}
