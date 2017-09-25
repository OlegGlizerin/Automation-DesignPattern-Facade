package VehiclesProductionLine.VehicleStructure;

import VehiclesProductionLine.VehicleStructure.VehicleModels.EVehicleModel;
import VehiclesProductionLine.VehicleStructure.VehicleModels.EVehicleType;

public interface IVehicle {
    void drive();
    void printAbilities();
    void construct();
    EVehicleModel getVehicleModel();
    EVehicleType getVehicleType();
    boolean isConstructed();
}
