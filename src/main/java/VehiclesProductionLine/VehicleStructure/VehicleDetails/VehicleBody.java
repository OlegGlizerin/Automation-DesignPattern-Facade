package VehiclesProductionLine.VehicleSkeleton.VehicleDetails;

import VehiclesProductionLine.VehicleSkeleton.VehicleDetails.Component.IComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that responsible to create the body of the vehicle with Composite design pattern.
 * This is the composite that holds many leafs like wheels, content of the vehicle and engine...
 */
public class VehicleBody implements IComponent{
    private List<IComponent> components = new ArrayList<IComponent>();
    private String name = null;

    public VehicleBody(String name) {
        this.name = name;
    }
    @Override
    public void make() {
        for(IComponent component : components) {
            component.make();
        }
        System.out.println("The body of the vehicle build successfully.");
    }

    public void addComponent(IComponent component) {
        components.add(component);
    }
}
