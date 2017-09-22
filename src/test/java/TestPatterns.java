import Factory.Factory.Enums.Models;
import Factory.Factory.FactoryProxys.HerzliaFacotryProxy;
import Factory.Factory.HerzliaFactory;
import ProductionLine.Car.CarModels.CarTypes.Bikes.Bike;
import ProductionLine.Car.CarModels.CarTypes.Privates.Private;
import ProductionLine.Car.CarModels.CarTypes.Trucks.Truck;
import ProductionLine.Car.CarModels.EModels;
import ProductionLine.Car.ICar;
import Warehouse.ExportCars.USAExporter;
import Warehouse.HerzliaWarehouse;
import org.testng.annotations.Test;

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


       ICar car = herzliaFacotryProxy.getCar(EModels.HONDA);
       HerzliaWarehouse herzliaWarehouse = new HerzliaWarehouse(new USAExporter());
       herzliaWarehouse.sellCar(car);

    }
}
