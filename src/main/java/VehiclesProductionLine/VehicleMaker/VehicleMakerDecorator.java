package VehiclesProductionLine.VehicleMaker;


public class VehicleMakerDecorator implements IMaker {
   protected IMaker maker = null;

   public VehicleMakerDecorator() {

   }

    public VehicleMakerDecorator(IMaker maker) {
        this.maker = maker;
    }

    @Override
    public void buildVehicle() {
        System.out.println("Build vehicle started.");
        this.maker.buildVehicle();
        System.out.println("Build vehicle finished.");
    }
}
