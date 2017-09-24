package VehiclesProductionLine.VehicleStructure;

public interface IVehicle {
    void drive();
    void printAbilities();
    void construct();
    String getVehicleModel();
    boolean isConstructed();
}
