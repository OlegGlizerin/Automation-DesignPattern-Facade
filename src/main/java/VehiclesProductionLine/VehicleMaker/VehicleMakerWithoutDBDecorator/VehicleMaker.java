package VehiclesProductionLine.VehicleMaker.VehicleMakerWithoutDBDecorator;

import VehiclesProductionLine.VehicleMaker.AbstractVehicleMakerDecorator;
import VehiclesProductionLine.VehicleStructure.VehicleDetails.VehicleBody;
import VehiclesProductionLine.VehicleStructure.VehicleDetails.VehicleContent;
import VehiclesProductionLine.VehicleStructure.VehicleDetails.VehicleEngine;
import VehiclesProductionLine.VehicleStructure.VehicleDetails.VehicleWheels;
import VehiclesProductionLine.VehicleStructure.VehicleDetails.Component.IComponent;

/**
 * VehicleFacde holds 4 classes which every one of these classes responsible for some different work,
 * in that case for building body,wheels,conent and engine. (User just using this classes)
 */
public class VehicleMaker extends AbstractVehicleMakerDecorator {
    private VehicleBody body;
    private IComponent wheels;
    private IComponent content;
    private IComponent engine;

    public VehicleMaker() {
        body = new VehicleBody("body");
        wheels = new VehicleWheels("wheels");
        content = new VehicleContent("content");
        engine = new VehicleEngine("Enginge");
        body.addComponent(wheels);
        body.addComponent(content);
        body.addComponent(engine);
    }

    /**
     * Facade pattern used here - lets it was to complex for the client (Bike,Jeep,Private or Truck in this case), so the solution is
     * to create a class that allows to run all this functionality at one function - buildVehicle()
     */
    @Override
    public void buildVehicle() {
        System.out.println("Build vehicle started.");
        body.make();
        System.out.println("Build vehicle finished.");
    }
}