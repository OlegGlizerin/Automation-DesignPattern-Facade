package Warehouse;

import ProductionLine.Car.ICar;
import Warehouse.ExportCars.IExporter;

/**
 * Here I use a Bridge design pattern to sell a car
 * HerzliaWarehouse can sell the car it have been created.
 * Once the car created we can put a car we want to sell and sell it through the exporter class.
 */
public class HerzliaWarehouse extends AbstractWarehouse {

    public HerzliaWarehouse(IExporter exporter) {
        super(exporter);
    }

    /**
     * seel the car using exporter
     * @param car - the car we want to sell
     */
    @Override
    public void sellCar(ICar car) {
        exporter.export(car);
        System.out.println("Car sold " + car.getCarModel());
    }
}
