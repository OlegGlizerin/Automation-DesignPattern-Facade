import Facade.CarFacade;
import org.testng.annotations.Test;


public class TestFacade {

   @Test
    public void carBuildTest() {
       CarFacade carDriver = new CarFacade();
       carDriver.buildCar();
    }
}
