package ProductionLine.VehicleBase.VehicleAdapter;

import ProductionLine.Car.CarDetails.CarBody;
import ProductionLine.Car.CarDetails.CarContent;
import ProductionLine.Car.CarDetails.CarEngine;
import ProductionLine.Car.CarDetails.CarWheels;
import ProductionLine.VehicleBase.IMaker;

public class VehicleMakerWithDB implements IMaker{
    private CarBody body;
    private CarWheels wheels;
    private CarContent content;
    private CarEngine engine;

    public VehicleMakerWithDB() {
        body = new CarBody();
        wheels = new CarWheels();
        content = new CarContent();
        engine = new CarEngine();
    }


    /**
     * Facade pattern used here - lets it was to complex for the client (Bike,Jeep,Private or Truck in this case), so the solution is
     * to create a class that allows to run all this functionality at one function - buildVehicle()
     */
    @Override
    public void buildVehicle() {
        System.out.println("Build car started.");
        body.makeBody();
        wheels.makeWheels();
        content.makeContent();
        engine.makeEngine();
        System.out.println("Build car finished.");
        saveToDB();
    }

    /**
     * This function added as a private because we want add functionality that saves some job to the DB, so I choose to do it with the Adapter pattern
     * That alllows us not to destroy the class VehicleMaker which is not saving anything to the DB, no we have to functionalities.
     * This function called in buildVehicle()
     */
    private void saveToDB() {
        System.out.println("Saving to db.");
    }
}
