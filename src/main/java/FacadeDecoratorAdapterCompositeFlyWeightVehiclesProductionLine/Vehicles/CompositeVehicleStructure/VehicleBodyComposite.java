package FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.CompositeVehicleStructure;

import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.CompositeVehicleStructure.Component.IComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that responsible to create the body of the vehicle with Composite design pattern.
 * This is the composite that holds many leafs like wheels, content of the vehicle and engine...
 */
public class VehicleBodyComposite implements IComponent{
    private List<IComponent> components = new ArrayList<IComponent>();
    private String name = null;

    public VehicleBodyComposite(String name) {
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
