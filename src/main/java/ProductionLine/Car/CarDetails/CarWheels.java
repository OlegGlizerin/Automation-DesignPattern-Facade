package ProductionLine.Car.CarDetails;

import ProductionLine.Car.CarDetails.Component.IComponent;

/**
 * Class that responsible to create the wheels of the car
 */
public class CarWheels implements IComponent{
    private String name = null;

    public CarWheels(String name) {
        this.name = name;
    }
    @Override
    public void make() {
        System.out.println("Item: " + name + " builded.");
    }
}
