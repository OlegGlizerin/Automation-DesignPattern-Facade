package VehiclesProductionLine.Vehicles.VehicleComponents;

import VehiclesProductionLine.Vehicles.VehicleComponents.Component.IComponent;

/**
 * Class that responsible to create the wheels of the car, its a leaf of the composite design pattern
 */
public class VehicleWheelsLeaf implements IComponent{
    private String name = null;

    public VehicleWheelsLeaf(String name) {
        this.name = name;
    }
    @Override
    public void make() {
        System.out.println("Item: " + name + " builded.");
    }
}
