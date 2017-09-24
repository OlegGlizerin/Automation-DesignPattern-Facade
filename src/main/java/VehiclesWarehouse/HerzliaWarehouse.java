package VehiclesWarehouse;

import VehiclesProductionLine.VehicleStructure.IVehicle;
import VehiclesWarehouse.ExportCars.IExporter;

/**
 * Here I use a Bridge design pattern to sell a car
 * HerzliaWarehouse class is responsible for selling the car it have been created.
 * Once the car is created we can sell it through the exporter class, and here comes the bridge design pattern to save us.
 */
public class HerzliaWarehouse extends AbstractWarehouse {

    public HerzliaWarehouse(IExporter exporter) {
        super(exporter);
    }

    /**
     * seel the car using exporter
     * @param vehicle - the vehicle we want to sell
     */
    @Override
    public void sellCar(IVehicle vehicle) {
        exporter.export(vehicle);
        System.out.println("Vehicle: " + vehicle.getClass().getSimpleName() + ", Model: " + vehicle.getVehicleModel() + ", is sold.");
    }
}
