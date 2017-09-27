package VehiclesCityEnterprises.Concrete;

import VehiclesProductionLine.Vehicles.IVehicle;
import VehiclesProductionLine.Vehicles.Models.EVehicleType;


/**
 * The Enterprise Interface.
 */
public interface IEnterprise {
    void buildVehicle(IVehicle vehicle);
    IVehicle getVehicle(EVehicleType type);
}
