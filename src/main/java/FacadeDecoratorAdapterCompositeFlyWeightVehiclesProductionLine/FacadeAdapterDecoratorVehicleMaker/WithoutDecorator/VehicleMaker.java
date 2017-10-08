package FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.FacadeAdapterDecoratorVehicleMaker.WithoutDecorator;

import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.FacadeAdapterDecoratorVehicleMaker.IMaker;
import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.CompositeVehicleStructure.VehicleBodyComposite;
import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.CompositeVehicleStructure.VehicleContentLeaf;
import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.CompositeVehicleStructure.VehicleEngineLeaf;
import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.CompositeVehicleStructure.VehicleWheelsLeaf;
import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.CompositeVehicleStructure.Component.IComponent;

/**
 * VehicleFacde holds 4 classes which every one of these classes responsible for some different work,
 * in that case for building body,wheels,conent and engine. (User just using this classes)
 */
public class VehicleMaker implements IMaker {
    private VehicleBodyComposite body;
    private IComponent wheels;
    private IComponent content;
    private IComponent engine;

    public VehicleMaker() {
        body = new VehicleBodyComposite("body");
        wheels = new VehicleWheelsLeaf("wheels");
        content = new VehicleContentLeaf("content");
        engine = new VehicleEngineLeaf("Enginge");
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