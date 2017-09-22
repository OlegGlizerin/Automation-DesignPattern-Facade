package ProductionLine.Car.CarModels.CarTypes.Privates;

import ProductionLine.Car.CarModels.CarTypes.IHover;
import ProductionLine.Car.CarModels.CarTypes.INorma;
import ProductionLine.Car.CarModels.CarTypes.ISport;
import ProductionLine.Car.CarModels.EModels;
import ProductionLine.VehicleBase.IMaker;
import ProductionLine.VehicleBase.VehicleAdapter.VehicleMakerWithDB;

public class Private implements ISport, IHover, INorma {
//    private VehicleMaker vehicleBase = null;(adapter used)
private IMaker vehicleBaseWithDB = null;
    private EModels model = null;

    public Private(EModels model) {
//        vehicleBase = new VehicleMaker();(adapter used)
        vehicleBaseWithDB = new VehicleMakerWithDB();
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
//        vehicleBase.buildVehicle();(adapter used)
        vehicleBaseWithDB.buildVehicle();
        System.out.println("New " + model + " Private has been created.");
    }

    @Override
    public String getCarModel() {
        return model.toString();
    }
}
