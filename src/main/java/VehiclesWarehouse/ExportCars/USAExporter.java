package VehiclesWarehouse.ExportCars;

import VehiclesProductionLine.VehicleSkeleton.IVehicle;

public class USAExporter implements IExporter {

    /**
     * Export car to USA
     * @param car - sell the car
     */
    @Override
    public void export(IVehicle car) {
        System.out.println("Export the car " + car.getCarModel() + "to USA.");
    }
}
