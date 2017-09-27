package VehiclesAndToysWarehouse.CreateVehicleToys.UsingAbstractFactory.ToyFactory;

import VehiclesProductionLine.Vehicles.IVehicle;
import VehiclesProductionLine.Vehicles.Models.EVehicleType;
import VehiclesAndToysWarehouse.CreateVehicleToys.UsingAbstractFactory.AbstractToyFactory;
import VehiclesAndToysWarehouse.ToysContents.AbstractToyWrapper.ToyBag;
import VehiclesAndToysWarehouse.ToysContents.ToysSpecificModels.MiniBike;
import VehiclesAndToysWarehouse.ToysContents.ToysSpecificModels.MiniTruck;
import VehiclesAndToysWarehouse.CreateVehicleToys.UsingPrototypeVehicle.PrototypeToysVehicleFactory;

/**
 * Abstract factory to create toys from the specific Vehicles
 */
public class BagToyFactory extends AbstractToyFactory{
    @Override
    public FactoryToyBox getToy(IVehicle iVehicle) {
        FactoryToyBox factoryToyBox = null;
        if (PrototypeToysVehicleFactory.contains(iVehicle)) {
            if(iVehicle.getVehicleType().equals(EVehicleType.BIKE)) {
                factoryToyBox = new FactoryToyBox(new MiniBike(iVehicle.getVehicleModel()),new ToyBag());
            }
            else if(iVehicle.getVehicleType().equals(EVehicleType.JEEP)) {
                return null; //ToDo: add implementation classes
            }
            else if(iVehicle.getVehicleType().equals(EVehicleType.PRIVATE)) {
                return null; //ToDo: add implementation classes
            }
            else if(iVehicle.getVehicleType().equals(EVehicleType.TRUCK)) {
                factoryToyBox = new FactoryToyBox(new MiniTruck(iVehicle.getVehicleModel()),new ToyBag());
            }
        }
        return factoryToyBox;
    }
}
