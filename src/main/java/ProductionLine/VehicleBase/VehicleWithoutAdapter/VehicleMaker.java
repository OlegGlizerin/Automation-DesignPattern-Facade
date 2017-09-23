package ProductionLine.VehicleBase.VehicleWithoutAdapter;

import ProductionLine.Car.CarDetails.CarBody;
import ProductionLine.Car.CarDetails.CarContent;
import ProductionLine.Car.CarDetails.CarEngine;
import ProductionLine.Car.CarDetails.CarWheels;
import ProductionLine.Car.CarDetails.Component.IComponent;
import ProductionLine.VehicleBase.IMaker;

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
        body = new CarBody("Car Body Composite");
        wheels = new CarWheels("Car Wheels Leaf");
        content = new CarContent("Car Content Leaf");
        engine = new CarEngine("Car Engine Leaf");
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