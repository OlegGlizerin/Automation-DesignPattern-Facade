package FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.CompositeVehicleStructure;

import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.CompositeVehicleStructure.Component.IComponent;

/**
 * Class that responsible to create the content of the car, its a leaf of the composite design pattern
 */
public class VehicleContentLeaf implements IComponent{
    private String name = null;

    public VehicleContentLeaf(String name) {
        this.name = name;
    }
    @Override
    public void make() {
        System.out.println("Item: " + name + " builded.");
    }
}
