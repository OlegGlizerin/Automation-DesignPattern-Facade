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

    @Override
    public void buildVehicle() {
        System.out.println("Build car started.");
        body.makeBody();
        wheels.makeWheels();
        content.makeContent();
        engine.makeEngine();
        System.out.println("Build car finished.");
        System.out.println("Saving to db.");
    }
}
