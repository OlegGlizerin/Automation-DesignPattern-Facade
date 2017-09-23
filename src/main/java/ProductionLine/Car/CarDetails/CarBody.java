package ProductionLine.Car.CarDetails;

import ProductionLine.Car.CarDetails.Component.IComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that responsible to create the body of the car with Composite design pattern.
 */
public class CarBody implements IComponent{
    private List<IComponent> components = new ArrayList<IComponent>();
    private String name = null;

    public CarBody(String name) {
        this.name = name;
    }
    @Override
    public void make() {
        for(IComponent component : components) {
            component.make();
        }
        System.out.println("The body of the car build successfully.");
    }

    public void addComponent(IComponent component) {
        components.add(component);
    }
}
