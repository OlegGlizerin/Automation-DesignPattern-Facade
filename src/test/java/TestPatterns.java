import VehiclesCityFactories.FactoryProxys.HerzliaFacotryProxy;
import VehiclesCityFactories.VehicleTypesByCity.EHerzliaVehicleTypes;
import VehiclesProductionLine.VehicleStructure.IVehicle;
import VehiclesProductionLine.VehicleStructure.VehicleModels.EVehicleType;
import VehiclesProductionLine.VehicleStructure.VehicleModels.VehicleTypes.Bikes.Bike;
import VehiclesProductionLine.VehicleStructure.VehicleModels.EVehicleModel;
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
       herzliaFacotryProxy.buildVehicle(new Bike(EVehicleModel.HONDA));
       herzliaFacotryProxy.buildVehicle(new Bike(EVehicleModel.HONDA));
       herzliaFacotryProxy.buildVehicle(new Bike(EVehicleModel.MAZDA));
       herzliaFacotryProxy.buildVehicle(new Bike(EVehicleModel.MAZDA));
       herzliaFacotryProxy.buildVehicle(new Bike(EVehicleModel.HONDA));
       herzliaFacotryProxy.buildVehicle(new Truck(EVehicleModel.HONDA));


       IVehicle vehicle = herzliaFacotryProxy.getVehicle(EVehicleType.BIKE);
       HerzliaWarehouse herzliaWarehouse = new HerzliaWarehouse(new USAExporter());
       herzliaWarehouse.sellCar(vehicle);

       System.out.println(vehicle.isConstructed());


    }
}
