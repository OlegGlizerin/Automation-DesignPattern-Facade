import Facade.CarFacade;
import org.testng.annotations.Test;

/**
 * Let's say the client want to build a car,
 * so we give him the CarFacade that easy can make a good car.
 * The only class that the client is using is the CarFacade and calls the buildCar.
 */
public class TestFacade {

   @Test
    public void carBuildTest() {
       CarFacade carDriver = new CarFacade();
       carDriver.buildCar();
    }
}
