package VehiclesWarehouse.ExportCars;

import VehiclesProductionLine.VehicleStructure.IVehicle;

public interface IExporter {
    void export(IVehicle car);
}
