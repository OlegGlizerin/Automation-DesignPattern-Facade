package VehiclesCityFactories;

import VehiclesProductionLine.VehicleStructure.VehicleModels.EModels;
import VehiclesProductionLine.VehicleStructure.IVehicle;


/**
 * The Factory Interface.
 */
public interface IFactory {
    void buildVehicle(IVehicle car);
    IVehicle getVehicle(EModels model);
}
