package VehiclesProductionLine.VehicleMaker.VehicleMakerWithoutDBAdapter;

import VehiclesProductionLine.VehicleSkeleton.VehicleDetails.CarBody;
import VehiclesProductionLine.VehicleSkeleton.VehicleDetails.CarContent;
import VehiclesProductionLine.VehicleSkeleton.VehicleDetails.CarEngine;
import VehiclesProductionLine.VehicleSkeleton.VehicleDetails.CarWheels;
import VehiclesProductionLine.VehicleSkeleton.VehicleDetails.Component.IComponent;
import VehiclesProductionLine.VehicleMaker.IMaker;

/**
 * CarFacde holds 4 classes which every one of these classes responsible for some different work,
 * in that case for building body,wheels,conent and engine. (User just using this classes)
 */
public class VehicleMaker implements IMaker {
    private CarBody body;
    private IComponent wheels;
    private IComponent content;
    private IComponent engine;

    public VehicleMaker() {
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
    }
}