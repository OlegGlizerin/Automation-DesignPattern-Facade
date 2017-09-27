package VehiclesProductionLine.Vehicles.Models.Types.Bikes;

import VehiclesProductionLine.VehicleMaker.WithoutDBDecorator.VehicleMaker;
import VehiclesProductionLine.Vehicles.IVehicle;
import VehiclesProductionLine.Vehicles.Models.EVehicleType;
import VehiclesProductionLine.Vehicles.Models.Types.IFourXFour;
import VehiclesProductionLine.Vehicles.Models.Types.IHover;
import VehiclesProductionLine.Vehicles.Models.Types.INorma;
import VehiclesProductionLine.Vehicles.Models.Types.ISport;
import VehiclesProductionLine.Vehicles.Models.EVehicleModel;
import VehiclesProductionLine.VehicleMaker.IMaker;
import VehiclesProductionLine.VehicleMaker.WithDBDecorator.VehicleMakerWithDB;

public class Bike implements ISport,IHover,INorma,IFourXFour{

    private IMaker vehicleBaseWithDB = null;
    private EVehicleModel model = null;
    private boolean isConstructed = false;

    public Bike(EVehicleModel model) {
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
    public EVehicleModel getVehicleModel() {
        return model;
    }

    @Override
    public EVehicleType getVehicleType() {
        return EVehicleType.getByType(this.getClass().getSimpleName().toUpperCase());
    }

    @Override
    public boolean isConstructed() {
        return isConstructed;
    }


    /**
     * In order to FlyWeight use a good compare in it's hashset, so I give some unique hash for each unique Vehicles
     * @return unique number for bike (assume its a good hash)
     */
    @Override
    public int hashCode() {
        final int prime = 3;
        return prime;
    }

    /**
     * Compares to IVehicles (for hashset comparing), used in FlyWeight design pattern
     * @param obj , it is some other IVehicle
     * @return true if the object are the same
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        IVehicle other = (Bike) obj;
        if (!getVehicleType().toString().toUpperCase().equals(other.getVehicleType().toString().toUpperCase()) && !model.equals(other.getVehicleModel()))
            return false;
        return true;
    }

    /**
     * Cloning the bike object for the prototype design pattern
     * @return cloned Bike
     * @throws CloneNotSupportedException
     */
    @Override
    public IVehicle clone() throws CloneNotSupportedException {
        System.out.println("Cloning Bike.");
        return (IVehicle)super.clone();
    }
}
