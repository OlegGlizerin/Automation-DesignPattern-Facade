package VehiclesWarehouse;

import VehiclesProductionLine.VehicleStructure.IVehicle;
import VehiclesWarehouse.ExportCars.IExporter;

public abstract class AbstractWarehouse {
    IExporter exporter = null;

    public AbstractWarehouse(IExporter exporter) {
        this.exporter = exporter;
    }

    public abstract void sellCar(IVehicle car);
}
