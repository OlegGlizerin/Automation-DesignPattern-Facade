package BuilderFactoryObjectPoolPrototypeToysCreation.CreateVehicleToys.AbstractFactory.ToyFactoryBox;

import BuilderFactoryObjectPoolPrototypeToysCreation.ToysProducts.AbstractToyVehicle.IToyVehicle;
import BuilderFactoryObjectPoolPrototypeToysCreation.ToysProducts.AbstractToyWrapper.IToyWrapper;


/**
 * Abstract Factory ToyBox representation
 */
public class FactoryToyBox {
    private IToyVehicle toy = null;
    private IToyWrapper wrapper = null;

    public FactoryToyBox(IToyVehicle vehicles, IToyWrapper wrapper) {
        this.toy = vehicles;
        this.wrapper = wrapper;
    }

    public void showProducts() {
        System.out.println("Toy: " + toy.getName() + ", " + toy.price() + "$") ;
        System.out.println("Wrapper: " + wrapper.getName() + ", " + wrapper.price() + "$");
    }
    public void totalPrice() {
        System.out.println("Total price is: " + (toy.price() + wrapper.price())  + "$");
    }


}
