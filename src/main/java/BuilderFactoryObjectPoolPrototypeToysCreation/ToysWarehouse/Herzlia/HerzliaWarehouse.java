package BuilderFactoryObjectPoolPrototypeToysCreation.ToysWarehouse.Herzlia;

import BuilderFactoryObjectPoolPrototypeToysCreation.CreateVehicleToys.AbstractFactory.AbstractToyFactory;
import BuilderFactoryObjectPoolPrototypeToysCreation.CreateVehicleToys.ObjectPool.PooledToyObject;
import BuilderFactoryObjectPoolPrototypeToysCreation.CreateVehicleToys.ObjectPool.ToyPool;
import BuilderFactoryObjectPoolPrototypeToysCreation.ToysWarehouse.AbstractWarehouse;
import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.IVehicle;
import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.EVehicleType;

import BuilderFactoryObjectPoolPrototypeToysCreation.CreateVehicleToys.Builder.BuilderToyBox;
import BuilderFactoryObjectPoolPrototypeToysCreation.CreateVehicleToys.AbstractFactory.ToyFactoryBox.BagFactory.BagToyFactory;
import BuilderFactoryObjectPoolPrototypeToysCreation.CreateVehicleToys.AbstractFactory.ToyFactoryBox.FactoryToyBox;
import BuilderFactoryObjectPoolPrototypeToysCreation.ToysProducts.AbstractToyWrapper.EToysWrappers;
import BridgeExportVehicles.ExportVehicles.IExporter;
import BuilderFactoryObjectPoolPrototypeToysCreation.CreateVehicleToys.PrototypeVehicle.PrototypeToysVehicleFactory;


/**
 * Here I use a Bridge design pattern to sell a car
 * Herzlia class is responsible for selling the car it have been created.
 * Once the car is created we can sell it through the exporter class, and here comes the bridge design pattern to save us.
 */
public class HerzliaWarehouse extends AbstractWarehouse {

    private AbstractToyFactory bagToyFactory = new BagToyFactory();


    public HerzliaWarehouse(IExporter exporter) {
        super(exporter);

    }


    /**
     * sell the vehicle using exporter (Bridge pattern)
     * @param vehicle - the vehicle we want to sell
     */
    @Override
    public void sellCar(IVehicle vehicle) {
        exporter.export(vehicle);
        System.out.println("Vehicles: " + vehicle.getClass().getSimpleName() + ", Model: " + vehicle.getVehicleModel() + ", is sold.");

        if(!PrototypeToysVehicleFactory.contains(vehicle)) {
            addVehicleToPrototypeFactory(vehicle);
        }
    }

    /**
     * Cloning the vehicle using the prototype pattern
     * @param vehicleType - the vehicle we want to clone
     * @return cloned new vehicle
     * @throws CloneNotSupportedException
     */
    @Override
    public IVehicle getClone(EVehicleType vehicleType) throws CloneNotSupportedException {
        return PrototypeToysVehicleFactory.getClone(vehicleType);
    }

    /**
     * Vehicles that have been sold, added automaticaly to the prototype factory
     * @param vehicle - vehicle that add to the prototype factory
     */
    private void addVehicleToPrototypeFactory(IVehicle vehicle) {
        System.out.println(vehicle.getVehicleType() + " added to prototype toys factory.");
        PrototypeToysVehicleFactory.add(vehicle);
    }

    /**
     * Using the builder pattern to build the BuilderToyBox from the existing types and models
     */
    public void buildToyWithBuilder(IVehicle vehicle) {
        System.out.println("Making toy Box from the builder, of specific type.");
        BuilderToyBox builderToyBox = new BuilderToyBox.ToysBuilder(vehicle).wrapper(EToysWrappers.BAG).build();
        builderToyBox.showProducts();
        builderToyBox.showCost();
    }

    public void buildToyWithFactory(IVehicle vehicle) {
        System.out.println("Making a toy with factory");
        FactoryToyBox factoryToyBox = bagToyFactory.createToy(vehicle);
        factoryToyBox.showProducts();
        factoryToyBox.totalPrice();

    }

    public PooledToyObject buildToyWithObjectPool(IVehicle vehicle) {
        return ToyPool.getObject(vehicle);
    }

}
