package Factory.Factory.Enums;

public enum Models {
    BIKE,JEEP,PRIVATE,TRUCK;

    public static boolean contains(String otherModel) {

        for (Models model : Models.values()) {
            if (model.name().equals(otherModel)) {
                return true;
            }
        }

        return false;
    }
}
