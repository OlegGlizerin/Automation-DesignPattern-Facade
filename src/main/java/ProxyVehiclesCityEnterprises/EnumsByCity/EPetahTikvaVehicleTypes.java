package ProxyVehiclesCityEnterprises.EnumsByCity;

public enum EPetahTikvaVehicleTypes {
    BIKE,JEEP,PRIVATE,TRUCK;

    public static boolean contains(String otherModel) {

        for (EHerzliaVehicleTypes model : EHerzliaVehicleTypes.values()) {
            if (model.name().equals(otherModel)) {
                return true;
            }
        }

        return false;
    }

}
