package VehiclesProductionLine.VehicleSkeleton.VehicleModels.VehicleTypes.Jeeps;

import VehiclesProductionLine.VehicleMaker.VehicleMakerWithoutDBDecorator.VehicleMaker;
import VehiclesProductionLine.VehicleSkeleton.VehicleModels.VehicleTypes.IFourXFour;
import VehiclesProductionLine.VehicleSkeleton.VehicleModels.VehicleTypes.INorma;
import VehiclesProductionLine.VehicleSkeleton.VehicleModels.VehicleTypes.ISport;
import VehiclesProductionLine.VehicleSkeleton.VehicleModels.EModels;
import VehiclesProductionLine.VehicleMaker.IMaker;
import VehiclesProductionLine.VehicleMaker.VehicleMakerDBDecorator.VehicleMakerWithDB;

public class Jeep implements ISport, IFourXFour, INorma {

    private IMaker vehicleBaseWithDB = null;
    private EModels model= null;

    public Jeep(EModels model) {
        vehicleBaseWithDB = new VehicleMakerWithDB(new VehicleMaker());
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
    public void fourXfourAbility() {
        System.out.println("fourXfour ability.");
    }

    @Override
    public void printAbilities() {
        fourXfourAbility();
        normaAbility();
        sportAbility();
        drive();
    }

    @Override
    public void construct() {
        vehicleBaseWithDB.buildVehicle();
        System.out.println("New " + model + " Jeep has been created.");
    }

    @Override
    public String getVehicleModel() {
        return model.toString();
    }
}
