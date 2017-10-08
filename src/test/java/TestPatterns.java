import BridgeExportVehicles.ExportVehicles.USAExporter;
import BuilderFactoryObjectPoolPrototypeToysCreation.CreateVehicleToys.ObjectPool.PooledToyObject;
import BuilderFactoryObjectPoolPrototypeToysCreation.CreateVehicleToys.ObjectPool.ToyPool;
import ProxyVehiclesCityEnterprises.Proxys.HerzliaEnterpriseProxy;
import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.IVehicle;
import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.EVehicleType;
import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.FlyWeightAndPrototypeVehicles.Models.Bikes.Bike;
import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.EVehicleModel;
import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.FlyWeightAndPrototypeVehicles.Models.Trucks.Truck;
import org.testng.annotations.Test;


/**
 * Let's say the client want to build a vehicle,
 * so we give him the FacadeAdapterDecoratorVehicleMaker that easy can make a good vehicle with it's identical abilities.
 * Structural patterns used (Adapter,Facade,Decorator,Proxy,FlyWeight,Bridge,Composite) , also creational pattern used (Builder,Prototype,Abstract Factory) .
 */
public class TestPatterns {

   @Test
    public void carBuildTest() throws ClassNotFoundException, IllegalAccessException, InstantiationException, CloneNotSupportedException {
      HerzliaEnterpriseProxy herzliaEnterpriseProxy = new HerzliaEnterpriseProxy(new USAExporter());
      herzliaEnterpriseProxy.buildVehicle(new Bike(EVehicleModel.HONDA));
      herzliaEnterpriseProxy.buildVehicle(new Bike(EVehicleModel.HONDA));
      herzliaEnterpriseProxy.buildVehicle(new Bike(EVehicleModel.MAZDA));
      herzliaEnterpriseProxy.buildVehicle(new Bike(EVehicleModel.MAZDA));
      herzliaEnterpriseProxy.buildVehicle(new Bike(EVehicleModel.HONDA));
      herzliaEnterpriseProxy.buildVehicle(new Truck(EVehicleModel.HONDA));
      herzliaEnterpriseProxy.buildVehicle(new Truck(EVehicleModel.HONDA));



       IVehicle vehicle = herzliaEnterpriseProxy.getVehicle(EVehicleType.BIKE);
//       Herzlia herzliaWarehouse = new Herzlia(new USAExporter());
//       herzliaWarehouse.sellCar(vehicle);
//
//       vehicle = herzliaEnterpriseProxy.getVehicle(EVehicleType.TRUCK);
//       herzliaWarehouse.sellCar(vehicle);

//       IVehicle vehicle1 = herzliaWarehouse.getClone(EVehicleType.BIKE);



//       herzliaWarehouse.buildToyWithBuilder(vehicle);
//
//       herzliaWarehouse.buildToyWithFactory(vehicle);

           PooledToyObject pooledToyObject = ToyPool.getObject(vehicle);
           PooledToyObject pooledToyObject2 = ToyPool.getObject(vehicle);
//           pooledToyObject.getToy().showProducts();
//           pooledToyObject.getToy().showCost();
           ToyPool.releaseObject(pooledToyObject);
//           ToyPool.cleanUp(pooledToyObject);


    }
}
