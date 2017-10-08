package ProxyVehiclesCityEnterprises.Subjects;

import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.IVehicle;
import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.EVehicleType;


/**
 * The Enterprise Interface.
 */
public interface IEnterprise {
    void buildVehicle(IVehicle vehicle);
    IVehicle getVehicle(EVehicleType type);
}
