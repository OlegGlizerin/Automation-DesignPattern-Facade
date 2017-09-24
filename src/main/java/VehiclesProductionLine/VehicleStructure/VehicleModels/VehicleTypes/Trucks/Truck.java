package VehiclesProductionLine.VehicleSkeleton.VehicleModels.VehicleTypes.Trucks;

import VehiclesProductionLine.VehicleMaker.VehicleMakerWithoutDBDecorator.VehicleMaker;
import VehiclesProductionLine.VehicleSkeleton.VehicleModels.VehicleTypes.INorma;
import VehiclesProductionLine.VehicleSkeleton.VehicleModels.VehicleTypes.ISport;
import VehiclesProductionLine.VehicleSkeleton.VehicleModels.EModels;
import VehiclesProductionLine.VehicleMaker.IMaker;
import VehiclesProductionLine.VehicleMaker.VehicleMakerDBDecorator.VehicleMakerWithDB;

public class Truck implements ISport,INorma {

    private IMaker vehicleBaseWithDB = null;
    private EModels model = null;

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
    }
    @Override
    public String getVehicleModel() {
        return model.toString();
    }
}
