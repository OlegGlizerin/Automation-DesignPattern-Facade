package VehiclesProductionLine.VehicleStructure.VehicleModels.VehicleTypes.Trucks;

import VehiclesProductionLine.VehicleMaker.VehicleMakerWithoutDBDecorator.VehicleMaker;
import VehiclesProductionLine.VehicleStructure.VehicleModels.VehicleTypes.INorma;
import VehiclesProductionLine.VehicleStructure.VehicleModels.VehicleTypes.ISport;
import VehiclesProductionLine.VehicleStructure.VehicleModels.EModels;
import VehiclesProductionLine.VehicleMaker.IMaker;

public class Truck implements ISport,INorma {

    private IMaker vehicleBaseWithDB = null;
    private EModels model = null;
    private boolean isConstructed = false;
    public Truck(EModels model) {
        vehicleBaseWithDB = new VehicleMaker(); //decorator used here
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("drive ability...");
    }

    @Override
    public void normaAbility() {
        System.out.println("norma ability.");
    }

    @Override
    public void sportAbility() {
        System.out.println("sport ability.");
    }

    @Override
    public void printAbilities() {
        normaAbility();
        sportAbility();
        drive();
    }

    @Override
    public void construct() {
        vehicleBaseWithDB.buildVehicle();
        System.out.println("New " + model + " Truck has been created.");
        isConstructed = true;
    }
    @Override
    public String getVehicleModel() {
        return model.toString();
    }
    @Override
    public boolean isConstructed() {
        return isConstructed;
    }
}
