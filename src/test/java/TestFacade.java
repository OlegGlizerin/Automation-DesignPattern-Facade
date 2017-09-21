import Factory.Factory.Enums.Models;
import Factory.Factory.HerzliaFactory;
import ProductionLine.Car.CarModels.CarTypes.Bikes.Bike;
import ProductionLine.Car.CarModels.CarTypes.Privates.Private;
import ProductionLine.Car.CarModels.CarTypes.Trucks.Truck;
import ProductionLine.Car.CarModels.EModels;
import org.testng.annotations.Test;

/**
 * Let's say the client want to build a car,
 * so we give him the VehicleMaker that easy can make a good car.
 * The only class that the client is using is the VehicleMaker and calls the buildCar.
 */
public class TestFacade {

   @Test
    public void carBuildTest() {

       HerzliaFactory herzliaFactory = new HerzliaFactory();
       herzliaFactory.buildCar(new Bike(EModels.HONDA));
       herzliaFactory.buildCar(new Private(EModels.HONDA));
       herzliaFactory.buildCar(new Truck(EModels.HONDA));
       herzliaFactory.buildCar(new Bike(EModels.MAZDA));
       herzliaFactory.buildCar(new Private(EModels.MAZDA));
    }
}
