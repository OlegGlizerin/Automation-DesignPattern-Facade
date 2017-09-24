package VehiclesProductionLine.VehicleSkeleton.VehicleModels.VehicleTypes.Privates;

import VehiclesProductionLine.VehicleMaker.VehicleMakerWithoutDBDecorator.VehicleMaker;
import VehiclesProductionLine.VehicleSkeleton.VehicleModels.VehicleTypes.IHover;
import VehiclesProductionLine.VehicleSkeleton.VehicleModels.VehicleTypes.INorma;
import VehiclesProductionLine.VehicleSkeleton.VehicleModels.VehicleTypes.ISport;
import VehiclesProductionLine.VehicleSkeleton.VehicleModels.EModels;
import VehiclesProductionLine.VehicleMaker.IMaker;
import VehiclesProductionLine.VehicleMaker.VehicleMakerDBDecorator.VehicleMakerWithDB;

public class Private implements ISport, IHover, INorma {

    private IMaker vehicleBaseWithDB = null;
    private EModels model = null;

    public Private(EModels model) {
        vehicleBaseWithDB = new VehicleMakerWithDB(new VehicleMaker());
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("drive ability...");
    }

    @Override
    public void hoverAbility() {
        System.out.println("fly ability.");
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
        hoverAbility();
        normaAbility();
        sportAbility();
        drive();
    }

    @Override
    public void construct() {
        vehicleBaseWithDB.buildVehicle();
        System.out.println("New " + model + " Private has been created.");
    }

    @Override
    public String getVehicleModel() {
        return model.toString();
    }
}
