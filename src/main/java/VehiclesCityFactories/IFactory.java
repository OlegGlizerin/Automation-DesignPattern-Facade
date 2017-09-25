package VehiclesCityFactories;

import VehiclesProductionLine.VehicleStructure.IVehicle;
import VehiclesProductionLine.VehicleStructure.VehicleModels.EVehicleType;


/**
 * The Factory Interface.
 */
public interface IFactory {
    void buildVehicle(IVehicle vehicle);
    IVehicle getVehicle(EVehicleType type);
}
