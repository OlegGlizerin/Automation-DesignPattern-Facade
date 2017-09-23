package ProductionLine.Car.CarDetails;

import ProductionLine.Car.CarDetails.Component.IComponent;

/**
 * Class that responsible to create the engine of the car, its a leaf of the composite design pattern
 */
public class CarEngine implements IComponent{
    private String name = null;

    public CarEngine(String name) {
        this.name = name;
    }
    @Override
    public void make() {
        System.out.println("Item: " + name + " builded.");
    }
}
