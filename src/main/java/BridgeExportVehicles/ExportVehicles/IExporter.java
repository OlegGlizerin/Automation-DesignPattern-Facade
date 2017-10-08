package BridgeExportVehicles.ExportVehicles;

import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.IVehicle;

public interface IExporter {
    void export(IVehicle car);
}
