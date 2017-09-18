package Facade;

import Cars.CarBody;
import Cars.CarContent;
import Cars.CarEngine;
import Cars.CarWheels;

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