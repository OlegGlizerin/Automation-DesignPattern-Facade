package VehiclesProductionLine.VehicleStructure.VehicleModels;

public enum EVehicleType {
    BIKE,JEEP,PRIVATE,TRUCK;

    public static EVehicleType getByType(String type) {
        type = type.toUpperCase();
        for(EVehicleType enumVehicleType : EVehicleType.values()) {
            if(enumVehicleType.toString().equals(type)){
                return enumVehicleType;
            }
        }
        return null;
    }
}
