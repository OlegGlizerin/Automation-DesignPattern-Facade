package VehiclesProductionLine.VehicleMaker;

import VehiclesProductionLine.VehicleStructure.IVehicle;

public class AbstractVehicleMakerDecorator implements IMaker {
   protected IMaker maker = null;

   public AbstractVehicleMakerDecorator() {

   }

    public AbstractVehicleMakerDecorator(IMaker maker) {
        this.maker = maker;
    }

    @Override
    public void buildVehicle() {
        System.out.println("Build vehicle started.");
        this.maker.buildVehicle();
        System.out.println("Build vehicle finished.");
    }
}
