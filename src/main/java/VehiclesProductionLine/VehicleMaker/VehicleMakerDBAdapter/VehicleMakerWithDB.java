package VehiclesProductionLine.VehicleMaker.VehicleMakerDBAdapter;

import VehiclesProductionLine.VehicleSkeleton.VehicleDetails.CarBody;
import VehiclesProductionLine.VehicleSkeleton.VehicleDetails.CarContent;
import VehiclesProductionLine.VehicleSkeleton.VehicleDetails.CarEngine;
import VehiclesProductionLine.VehicleSkeleton.VehicleDetails.CarWheels;
import VehiclesProductionLine.VehicleSkeleton.VehicleDetails.Component.IComponent;
import VehiclesProductionLine.VehicleMaker.IMaker;

public class VehicleMakerWithDB implements IMaker{
    private CarBody body;
    private IComponent wheels;
    private IComponent content;
    private IComponent engine;

    /**
     * Composite design pattern used to build body of the car, first I initiate the IComponent items, add them to the body, and when we want to build
     * the body, it builds all the items that the body holds.
     */
    public VehicleMakerWithDB() {
        body = new CarBody("VehicleSkeleton Body Composite");
        wheels = new CarWheels("VehicleSkeleton Wheels Leaf");
        content = new CarContent("VehicleSkeleton Content Leaf");
        engine = new CarEngine("VehicleSkeleton Engine Leaf");
        body.addComponent(wheels);
        body.addComponent(content);
        body.addComponent(engine);
    }


    /**
     * Facade pattern used here - lets it was to complex for the client (Bike,Jeep,Private or Truck in this case), so the solution is
     * to create a class that allows to run all this functionality at one function - buildVehicle()
     */
    @Override
    public void buildVehicle() {
        System.out.println("Build car started.");
        body.make();
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
