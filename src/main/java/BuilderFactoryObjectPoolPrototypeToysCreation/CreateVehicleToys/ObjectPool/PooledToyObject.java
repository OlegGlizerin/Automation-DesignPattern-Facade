package BuilderFactoryObjectPoolPrototypeToysCreation.CreateVehicleToys.ObjectPool;


import BuilderFactoryObjectPoolPrototypeToysCreation.CreateVehicleToys.Builder.BuilderToyBox;


public class PooledToyObject {
    public BuilderToyBox factoryBuilderToyBox = null;

    public BuilderToyBox getToy() {
        return factoryBuilderToyBox;
    }
    public void setToy(BuilderToyBox factoryBuilderToyBox) {
        this.factoryBuilderToyBox = factoryBuilderToyBox;
    }
}
