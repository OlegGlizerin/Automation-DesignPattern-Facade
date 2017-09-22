package Warehouse.ExportCars;

import ProductionLine.Car.ICar;

public class USAExporter implements IExporter {

    /**
     * Export car to USA
     * @param car - sell the car
     */
    @Override
    public void export(ICar car) {
        System.out.println("Export the car " + car.getCarModel() + "to USA.");
    }
}
