package VehiclesProductionLine.VehicleSkeleton.VehicleDetails;

import VehiclesProductionLine.VehicleSkeleton.VehicleDetails.Component.IComponent;

/**
 * Class that responsible to create the content of the car, its a leaf of the composite design pattern
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
