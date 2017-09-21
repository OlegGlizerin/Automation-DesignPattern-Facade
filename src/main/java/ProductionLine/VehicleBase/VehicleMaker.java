package ProductionLine.VehicleBase;

import ProductionLine.Car.CarDetails.CarBody;
import ProductionLine.Car.CarDetails.CarContent;
import ProductionLine.Car.CarDetails.CarEngine;
import ProductionLine.Car.CarDetails.CarWheels;

/**
 * CarFacde holds 4 classes which every one of these classes responsible for some different work,
 * in that case for building body,wheels,conent and engine. (User just using this classes)
 */
public class VehicleMaker implements IMaker {
    private CarBody body;
    private CarWheels wheels;
    private CarContent content;
    private CarEngine engine;

    public VehicleMaker() {
        body = new CarBody();
        wheels = new CarWheels();
        content = new CarContent();
        engine = new CarEngine();
    }

    @Override
    public void buildVehicle() {
        System.out.println("Build car started.");
        body.makeBody();
        wheels.makeWheels();
        content.makeContent();
        engine.makeEngine();
        System.out.println("Build car finished.");
    }
}