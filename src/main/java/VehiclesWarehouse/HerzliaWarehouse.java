package VehiclesWarehouse;

import VehiclesProductionLine.VehicleSkeleton.IVehicle;
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
     * @param car - the car we want to sell
     */
    @Override
    public void sellCar(IVehicle car) {
        exporter.export(car);
        System.out.println("VehicleSkeleton sold " + car.getCarModel());
    }
}
