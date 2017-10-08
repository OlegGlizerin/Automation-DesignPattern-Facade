package FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.FacadeAdapterDecoratorVehicleMaker.AdapterDBInteraction.MySQLToMongoDBAdapter;

import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.FacadeAdapterDecoratorVehicleMaker.AdapterDBInteraction.IDBMongo;
import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.FacadeAdapterDecoratorVehicleMaker.AdapterDBInteraction.IDBMySQL;


/**
 * Adapter pattern used here, MySql storage now acts as Mongo, but actualy does the work from Mysql
 */
public class MySQLToMongoAdapter implements IDBMongo {
    private IDBMySQL idbMySQL = null;

    public MySQLToMongoAdapter(IDBMySQL idbMySQL) {
        this.idbMySQL = idbMySQL;
    }

    @Override
    public void storeToMongo() {
        idbMySQL.storeToMySQL();
    }

    @Override
    public void getData() {
        idbMySQL.getData();
    }
}
