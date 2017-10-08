package BuilderFactoryObjectPoolPrototypeToysCreation.CreateVehicleToys.AbstractFactory.ToyFactoryBox.BagFactory;

import BuilderFactoryObjectPoolPrototypeToysCreation.CreateVehicleToys.AbstractFactory.AbstractToyFactory;
import BuilderFactoryObjectPoolPrototypeToysCreation.CreateVehicleToys.AbstractFactory.ToyFactoryBox.FactoryToyBox;
import BuilderFactoryObjectPoolPrototypeToysCreation.ToysProducts.ToysSpecificModels.MiniBike;
import BuilderFactoryObjectPoolPrototypeToysCreation.ToysProducts.ToysSpecificModels.MiniTruck;
import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.IVehicle;
import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.EVehicleType;
import BuilderFactoryObjectPoolPrototypeToysCreation.ToysProducts.AbstractToyWrapper.ToyBag;
import BuilderFactoryObjectPoolPrototypeToysCreation.CreateVehicleToys.PrototypeVehicle.PrototypeToysVehicleFactory;

/**
 * Abstract factory to create toys from the specific Vehicles
 */
public class BagToyFactory extends AbstractToyFactory {
    @Override
    public FactoryToyBox createToy(IVehicle iVehicle) {
        FactoryToyBox factoryToyBox = null;
        if (PrototypeToysVehicleFactory.contains(iVehicle)) {
            if(iVehicle.getVehicleType().equals(EVehicleType.BIKE)) {
                factoryToyBox = new FactoryToyBox(new MiniBike(iVehicle.getVehicleModel()),new ToyBag());
            }
            else if(iVehicle.getVehicleType().equals(EVehicleType.JEEP)) {
                return null; //ToDo: add implementation classes
            }
            else if(iVehicle.getVehicleType().equals(EVehicleType.PRIVATE)) {
                return null; //ToDo: add implementation classes
            }
            else if(iVehicle.getVehicleType().equals(EVehicleType.TRUCK)) {
                factoryToyBox = new FactoryToyBox(new MiniTruck(iVehicle.getVehicleModel()),new ToyBag());
            }
        }
        return factoryToyBox;
    }
}
