package Facade;

import CarDetails.CarBody;
import CarDetails.CarContent;
import CarDetails.CarEngine;
import CarDetails.CarWheels;

/**
 * CarFacde holds 4 classes which every one of these classes responsible for some different work,
 * in that case for building body,wheels,conent and engine. (User just useing this classes)
 */
public class CarFacade {
    private CarBody body;
    private CarWheels wheels;
    private CarContent content;
    private CarEngine engine;

    public CarFacade() {
        body = new CarBody();
        wheels = new CarWheels();
        content = new CarContent();
        engine = new CarEngine();
    }


    public void buildCar() {
        System.out.println("Build car started.");
        body.makeBody();
        wheels.makeWheels();
        content.makeContent();
        engine.makeEngine();
        System.out.println("Build car finished.");
    }
}