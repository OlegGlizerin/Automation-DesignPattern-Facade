package VehiclesAndToysWarehouse.CreateVehicleToys.UsingAbstractFactory;

import VehiclesProductionLine.Vehicles.IVehicle;
import VehiclesAndToysWarehouse.CreateVehicleToys.UsingAbstractFactory.ToyFactory.FactoryToyBox;

public abstract class AbstractToyFactory {
    public abstract FactoryToyBox getToy(IVehicle iVehicle);
}
