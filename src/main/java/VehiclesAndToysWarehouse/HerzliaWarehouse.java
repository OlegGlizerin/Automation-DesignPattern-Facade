package VehiclesAndToysWarehouse;

import VehiclesAndToysWarehouse.CreateVehicleToys.UsingToysObjectPool.PooledToyObject;
import VehiclesAndToysWarehouse.CreateVehicleToys.UsingToysObjectPool.ToyPool;
import VehiclesProductionLine.Vehicles.IVehicle;
import VehiclesProductionLine.Vehicles.Models.EVehicleType;

import VehiclesAndToysWarehouse.CreateVehicleToys.UsingBuilder.ToyBox;
import VehiclesAndToysWarehouse.CreateVehicleToys.UsingAbstractFactory.ToyFactory.BagToyFactory;
import VehiclesAndToysWarehouse.CreateVehicleToys.UsingAbstractFactory.ToyFactory.FactoryToyBox;
import VehiclesAndToysWarehouse.ToysContents.AbstractToyWrapper.EToysWrappers;
import VehiclesAndToysWarehouse.BridgeExportVehicles.ExportVehicles.IExporter;
import VehiclesAndToysWarehouse.CreateVehicleToys.UsingPrototypeVehicle.PrototypeToysVehicleFactory;

/**
 * Here I use a Bridge design pattern to sell a car
 * HerzliaWarehouse class is responsible for selling the car it have been created.
 * Once the car is created we can sell it through the exporter class, and here comes the bridge design pattern to save us.
 */
public class HerzliaWarehouse extends AbstractWarehouse {

    private BagToyFactory bagToyFactory = new BagToyFactory();


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
     * Using the builder pattern to build the ToyBox from the existing types and models
     */
    public void buildToyWithBuilder(IVehicle vehicle) {
        System.out.println("Making toy Box from the builder, of specific type.");
        ToyBox toyBox = new ToyBox.ToysBuilder(vehicle).wrapper(EToysWrappers.BAG).build();
        toyBox.showProducts();
        toyBox.showCost();
    }

    public void buildToyWithFactory(IVehicle vehicle) {
        System.out.println("Making a toy with factory");
        FactoryToyBox factoryToyBox = bagToyFactory.getToy(vehicle);
        factoryToyBox.showProducts();
        factoryToyBox.totalPrice();

    }

    public PooledToyObject buildToyWithObjectPool(IVehicle vehicle) {
        return ToyPool.getObject(vehicle);
    }

}
