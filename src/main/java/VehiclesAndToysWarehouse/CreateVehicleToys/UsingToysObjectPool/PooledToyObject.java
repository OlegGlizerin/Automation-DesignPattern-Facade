package VehiclesAndToysWarehouse.CreateVehicleToys.UsingToysObjectPool;


import VehiclesAndToysWarehouse.CreateVehicleToys.UsingBuilder.ToyBox;


public class PooledToyObject {
    public ToyBox factoryToyBox  = null;

    public ToyBox getToy() {
        return factoryToyBox;
    }
    public void setToy(ToyBox factoryToyBox) {
        this.factoryToyBox = factoryToyBox;
    }




}
