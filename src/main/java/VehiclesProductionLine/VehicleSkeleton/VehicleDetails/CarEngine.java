package VehiclesProductionLine.VehicleSkeleton.VehicleDetails;

import VehiclesProductionLine.VehicleSkeleton.VehicleDetails.Component.IComponent;

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
