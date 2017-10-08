package BuilderFactoryObjectPoolPrototypeToysCreation.CreateVehicleToys.Builder;



import BuilderFactoryObjectPoolPrototypeToysCreation.ToysProducts.AbstractToyVehicle.IToyVehicle;
import BuilderFactoryObjectPoolPrototypeToysCreation.ToysProducts.AbstractToyWrapper.EToysWrappers;
import BuilderFactoryObjectPoolPrototypeToysCreation.ToysProducts.AbstractToyWrapper.IToyWrapper;
import BuilderFactoryObjectPoolPrototypeToysCreation.ToysProducts.AbstractToyWrapper.ToySimpleWrapper;
import BuilderFactoryObjectPoolPrototypeToysCreation.ToysProducts.ToysSpecificModels.MiniBike;
import BuilderFactoryObjectPoolPrototypeToysCreation.ToysProducts.ToysSpecificModels.MiniTruck;
import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.IVehicle;
import BuilderFactoryObjectPoolPrototypeToysCreation.ToysProducts.AbstractToyWrapper.ToyBag;

import java.util.ArrayList;
import java.util.List;

/**
 * Toy box used by the Builder
 * BuilderToyBox class is the packing for the Toy present, it contains some toys in it and some wrapping.
 */
public class BuilderToyBox {
    private List<IToyVehicle> toys = new ArrayList<IToyVehicle>();
    private IToyWrapper toyWrapper = null;

    /**
     * Builder pattern used here to build a toy and prepare it for selling
     * Return - BuilderToyBox which conatins some toy in it and wrapps with some known wrapper
     */
    public static class ToysBuilder {
        private List<IToyVehicle> toys = new ArrayList<IToyVehicle>();
        private IToyWrapper toyWrapper = null;
        private IVehicle vehicle = null;

        public ToysBuilder(IVehicle vehicle) {
            this.vehicle = vehicle;
        }

        /**
         * build wrapper for the toy
         * @param toysWrapperStyle, enum with style of the wrapper that we want for the toy
         * @return  - returns ToysBuilder to keep the object state
         */
        public ToysBuilder wrapper(EToysWrappers toysWrapperStyle) {
            switch (toysWrapperStyle) {
                case BAG:
                    this.toyWrapper = new ToyBag();
                    break;
                case WRAPPER:
                    this.toyWrapper = new ToySimpleWrapper();
                    break;
            }
            return this;
        }

        /**
         * build the toy with the specific type we get from the vehicle object
         * @return BuilderToyBox - packed with toy and wrapped with some toy wrapper
         */
        public BuilderToyBox build() {
            switch (vehicle.getVehicleType()) {
                case BIKE:
                    toys.add(new MiniBike(vehicle.getVehicleModel()));
                    break;
                case TRUCK:
                    toys.add(new MiniTruck(vehicle.getVehicleModel()));
                    break;
                case JEEP:
                    //ToDo
                    break;
                case PRIVATE:
                    //ToDo
                    break;
            }
            return new BuilderToyBox(this);
        }
    }

    /**
     * Constructor is private because we want the client who uses the BuilderToyBox, to use our builder static class to create ToyBoxes!
     * @param builder
     */
    private BuilderToyBox(ToysBuilder builder) {
        toys = builder.toys;
        toyWrapper = builder.toyWrapper;
    }

    /**
     * Print cost of the BuilderToyBox after building
     */
    public void showCost() {
        float cost = 0;
        for(IToyVehicle vehicle : toys) {
            cost += vehicle.price();
        }
        cost += toyWrapper.price();
        System.out.println("Total cost is: " + cost + "$");
    }

    /**
     * Print the BuilderToyBox content
     */
    public void showProducts() {
        System.out.println("Toys:");
        for(IToyVehicle toyVehicle : toys) {
            System.out.println(toyVehicle.getName() + ", " + toyVehicle.price() + "$");
        }
        System.out.println("Wrapper: " + toyWrapper.getName() + ", " + toyWrapper.price() + "$");
    }
}
