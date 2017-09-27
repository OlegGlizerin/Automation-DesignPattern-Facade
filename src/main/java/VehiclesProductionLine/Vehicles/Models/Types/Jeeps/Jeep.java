package VehiclesProductionLine.Vehicles.Models.Types.Jeeps;

import VehiclesProductionLine.VehicleMaker.WithoutDBDecorator.VehicleMaker;
import VehiclesProductionLine.Vehicles.IVehicle;
import VehiclesProductionLine.Vehicles.Models.EVehicleType;
import VehiclesProductionLine.Vehicles.Models.Types.IFourXFour;
import VehiclesProductionLine.Vehicles.Models.Types.INorma;
import VehiclesProductionLine.Vehicles.Models.Types.ISport;
import VehiclesProductionLine.Vehicles.Models.EVehicleModel;
import VehiclesProductionLine.VehicleMaker.IMaker;
import VehiclesProductionLine.VehicleMaker.WithDBDecorator.VehicleMakerWithDB;

public class Jeep implements ISport, IFourXFour, INorma {

    private IMaker vehicleBaseWithDB = null;
    private EVehicleModel model= null;
    private boolean isConstructed = false;
    public Jeep(EVehicleModel model) {
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

    @Override
    public int hashCode() {
        final int prime = 5;
        return prime;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        IVehicle other = (Jeep) obj;
        if (!getVehicleType().toString().toUpperCase().equals(other.getVehicleType().toString().toUpperCase()) && !model.equals(other.getVehicleModel()))
            return false;
        return true;
    }

    /**
     * Cloning the jeep object for the prototype design pattern
     * @return cloned Jeep
     * @throws CloneNotSupportedException
     */
    @Override
    public IVehicle clone() throws CloneNotSupportedException {
        System.out.println("Cloning Jeep.");
        return this.clone();
    }
}
