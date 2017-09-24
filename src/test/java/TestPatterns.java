import VehiclesCityFactories.FactoryProxys.HerzliaFacotryProxy;
import VehiclesProductionLine.VehicleStructure.IVehicle;
import VehiclesProductionLine.VehicleStructure.VehicleModels.VehicleTypes.Bikes.Bike;
import VehiclesProductionLine.VehicleStructure.VehicleModels.EModels;
import VehiclesProductionLine.VehicleStructure.VehicleModels.VehicleTypes.Trucks.Truck;
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
       herzliaFacotryProxy.buildVehicle(new Bike(EModels.HONDA));
       herzliaFacotryProxy.buildVehicle(new Truck(EModels.HONDA));


       IVehicle car = herzliaFacotryProxy.getVehicle(EModels.HONDA);
       HerzliaWarehouse herzliaWarehouse = new HerzliaWarehouse(new USAExporter());
       herzliaWarehouse.sellCar(car);

       System.out.println(car.isConstructed());

    }
}
