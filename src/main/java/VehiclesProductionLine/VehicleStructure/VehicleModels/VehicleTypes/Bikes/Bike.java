package VehiclesProductionLine.VehicleStructure.VehicleModels.VehicleTypes.Bikes;

import VehiclesProductionLine.VehicleMaker.VehicleMakerWithoutDBDecorator.VehicleMaker;
import VehiclesProductionLine.VehicleStructure.VehicleModels.VehicleTypes.IFourXFour;
import VehiclesProductionLine.VehicleStructure.VehicleModels.VehicleTypes.IHover;
import VehiclesProductionLine.VehicleStructure.VehicleModels.VehicleTypes.INorma;
import VehiclesProductionLine.VehicleStructure.VehicleModels.VehicleTypes.ISport;
import VehiclesProductionLine.VehicleStructure.VehicleModels.EModels;
import VehiclesProductionLine.VehicleMaker.IMaker;
import VehiclesProductionLine.VehicleMaker.VehicleMakerDBDecorator.VehicleMakerWithDB;

public class Bike implements ISport,IHover,INorma,IFourXFour {

    private IMaker vehicleBaseWithDB = null;
    private EModels model = null;
    private boolean isConstructed = false;

    public Bike(EModels model) {
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
    public void fourXfourAbility() {
        System.out.println("fourXfour ability.");
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
        System.out.println("New " + model + " Bike has been created.");
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