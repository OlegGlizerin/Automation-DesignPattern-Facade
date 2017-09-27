package VehiclesAndToysWarehouse;

import VehiclesProductionLine.Vehicles.IVehicle;
import VehiclesProductionLine.Vehicles.Models.EVehicleType;
import VehiclesAndToysWarehouse.BridgeExportVehicles.ExportVehicles.IExporter;

public abstract class AbstractWarehouse {
    IExporter exporter = null;

    public AbstractWarehouse(IExporter exporter) {
        this.exporter = exporter;
    }

    public abstract void sellCar(IVehicle vehicle);
    public abstract IVehicle getClone(EVehicleType vehicleType) throws CloneNotSupportedException;
}
