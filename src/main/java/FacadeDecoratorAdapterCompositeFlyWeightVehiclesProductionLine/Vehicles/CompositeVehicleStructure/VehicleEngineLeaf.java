package FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.CompositeVehicleStructure;

import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.CompositeVehicleStructure.Component.IComponent;

/**
 * Class that responsible to create the engine of the car, its a leaf of the composite design pattern
 */
public class VehicleEngineLeaf implements IComponent{
    private String name = null;

    public VehicleEngineLeaf(String name) {
        this.name = name;
    }
    @Override
    public void make() {
        System.out.println("Item: " + name + " builded.");
    }
}
