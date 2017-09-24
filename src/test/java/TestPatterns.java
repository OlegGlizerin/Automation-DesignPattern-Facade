import VehiclesCityFactories.FactoryProxys.HerzliaFacotryProxy;
import VehiclesProductionLine.VehicleSkeleton.VehicleModels.VehicleTypes.Bikes.Bike;
import VehiclesProductionLine.VehicleSkeleton.VehicleModels.EModels;
import VehiclesProductionLine.VehicleSkeleton.IVehicle;
import VehiclesWarehouse.ExportCars.USAExporter;
import VehiclesWarehouse.HerzliaWarehouse;

/**
 * Let's say the client want to build a car,
 * so we give him the VehicleMaker that easy can make a good car.
 * The only class that the client is using is the VehicleMaker and calls the buildCar.
 */
public class TestPatterns {

   @org.testng.annotations.Test
    public void carBuildTest() {
       HerzliaFacotryProxy herzliaFacotryProxy = new HerzliaFacotryProxy();
       herzliaFacotryProxy.buildCar(new Bike(EModels.HONDA));


       IVehicle car = herzliaFacotryProxy.getCar(EModels.HONDA);
       HerzliaWarehouse herzliaWarehouse = new HerzliaWarehouse(new USAExporter());
       herzliaWarehouse.sellCar(car);

    }
}
