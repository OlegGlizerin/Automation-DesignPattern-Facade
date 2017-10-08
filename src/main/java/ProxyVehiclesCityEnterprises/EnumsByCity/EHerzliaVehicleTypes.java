package ProxyVehiclesCityEnterprises.EnumsByCity;

public enum EHerzliaVehicleTypes {
    BIKE,JEEP,PRIVATE;

    public static boolean contains(String otherModel) {

        for (EHerzliaVehicleTypes model : EHerzliaVehicleTypes.values()) {
            if (model.name().equals(otherModel)) {
                return true;
            }
        }

        return false;
    }
}
