package VehiclesCityFactories.VehicleTypes;

public enum EVehicleTypes {
    BIKE,JEEP,PRIVATE,TRUCK;

    public static boolean contains(String otherModel) {

        for (EVehicleTypes model : EVehicleTypes.values()) {
            if (model.name().equals(otherModel)) {
                return true;
            }
        }

        return false;
    }
}
