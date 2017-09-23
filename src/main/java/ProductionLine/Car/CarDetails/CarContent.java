package ProductionLine.Car.CarDetails;

import ProductionLine.Car.CarDetails.Component.IComponent;

/**
 * Class that responsible to create the content of the car
 */
public class CarContent implements IComponent{
    private String name = null;

    public CarContent(String name) {
        this.name = name;
    }
    @Override
    public void make() {
        System.out.println("Item: " + name + " builded.");
    }
}
