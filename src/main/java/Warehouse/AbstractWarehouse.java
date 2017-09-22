package Warehouse;

import ProductionLine.Car.ICar;
import Warehouse.ExportCars.IExporter;

public abstract class AbstractWarehouse {
    IExporter exporter = null;

    public AbstractWarehouse(IExporter exporter) {
        this.exporter = exporter;
    }

    public abstract void sellCar(ICar car);
}
