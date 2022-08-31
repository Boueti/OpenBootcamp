package Main;

public class SmartDevice {

    //Attributes
    String madeBy;
    String model;
    Double storageCapacity;
    boolean microSd;
    int autonomy;
    int batteryLevel;

    //Constructors
    public SmartDevice() {}

    public SmartDevice(String madeBy, String model, Double storageCapacity, boolean microSd, int autonomy, int batteryLevel) {
        this.madeBy = madeBy;
        this.model = model;
        this.storageCapacity = storageCapacity;
        this.microSd = microSd;
        this.autonomy = autonomy;
        this.batteryLevel = batteryLevel;
    }

    @Override
    public String toString() {
        return "madeBy='" + madeBy + '\'' +
                ", model='" + model + '\'' +
                ", storageCapacity=" + storageCapacity +
                ", microSd=" + microSd +
                ", autonomy=" + autonomy +
                ", batteryLevel=" + batteryLevel +
                ", ";
    }

    //Methods

}
