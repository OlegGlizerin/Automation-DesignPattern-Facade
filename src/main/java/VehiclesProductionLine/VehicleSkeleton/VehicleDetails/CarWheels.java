package VehiclesProductionLine.VehicleSkeleton.VehicleDetails;

import VehiclesProductionLine.VehicleSkeleton.VehicleDetails.Component.IComponent;

/**
 * Class that responsible to create the wheels of the car, its a leaf of the composite design pattern
 */
public class CarWheels implements IComponent{
    private String name = null;

    public CarWheels(String name) {
        this.name = name;
    }
    @Override
    public void make() {
        System.out.println("Item: " + name + " builded.");
    }
}
