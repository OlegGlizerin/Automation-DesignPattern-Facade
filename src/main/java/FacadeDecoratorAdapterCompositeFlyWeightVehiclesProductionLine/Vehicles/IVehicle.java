package FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles;

public interface IVehicle extends Cloneable{
    void drive();
    void printAbilities();
    void construct();
    EVehicleModel getVehicleModel();
    EVehicleType getVehicleType();
    boolean isConstructed();
    IVehicle clone() throws CloneNotSupportedException;
}
