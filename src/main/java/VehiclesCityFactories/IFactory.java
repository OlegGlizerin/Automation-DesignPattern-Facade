package VehiclesCityFactories;

import VehiclesProductionLine.VehicleSkeleton.VehicleModels.EModels;
import VehiclesProductionLine.VehicleSkeleton.IVehicle;


/**
 * The Factory Interface.
 */
public interface IFactory {
    void buildCar(IVehicle car);
    IVehicle getCar(EModels model);
}
