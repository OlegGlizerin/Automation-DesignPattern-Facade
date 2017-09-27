package VehiclesAndToysWarehouse.BridgeExportVehicles.ExportVehicles;

import VehiclesProductionLine.Vehicles.IVehicle;

public class USAExporter implements IExporter {

    /**
     * Export car to USA
     * @param vehicle - sell the vehicle
     */
    @Override
    public void export(IVehicle vehicle) {
        System.out.println("Export the car " + vehicle.getVehicleModel() + "to USA.");
    }
}
