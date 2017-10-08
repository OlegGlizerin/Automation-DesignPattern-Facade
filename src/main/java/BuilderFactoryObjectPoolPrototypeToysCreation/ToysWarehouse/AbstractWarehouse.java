package BuilderFactoryObjectPoolPrototypeToysCreation.ToysWarehouse;

import BridgeExportVehicles.ExportVehicles.IExporter;
import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.IVehicle;
import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.EVehicleType;

public abstract class AbstractWarehouse {
    protected IExporter exporter = null;

    public AbstractWarehouse(IExporter exporter) {
        this.exporter = exporter;
    }

    public abstract void sellCar(IVehicle vehicle);
    public abstract IVehicle getClone(EVehicleType vehicleType) throws CloneNotSupportedException;
}
