package BridgeExportVehicles.ExportVehicles;

import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.IVehicle;

public class USAExporter implements IExporter {

    /**
     * Export car to USA
     * @param vehicle - sell the vehicle
     * Design pattern bridge used here to export vehicles to USA for example.
     */
    @Override
    public void export(IVehicle vehicle) {
        //ToDo: export the vehicle ....
        System.out.println("Export the car " + vehicle.getVehicleModel() + "to USA.");
    }
}
