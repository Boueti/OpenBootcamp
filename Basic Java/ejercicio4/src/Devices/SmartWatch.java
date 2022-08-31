package Devices;

import Main.SmartDevice;

public class SmartWatch extends SmartDevice {

    //Attributes
    boolean microphone;
    boolean speaker;

    //Constructors
    public SmartWatch(){}

    public SmartWatch(String madeBy, String model, Double storageCapacity,
                      boolean microSd, int autonomy, int batteryLevel,
                      boolean microphone, boolean speaker) {
        super(madeBy, model, storageCapacity, microSd, autonomy, batteryLevel);
        this.microphone = microphone;
        this.speaker = speaker;
    }

    @Override
    public String toString() {
        return "SmartWatch{" + super.toString() +
                "microphone=" + microphone +
                ", speaker=" + speaker +
                '}';
    }
//Methods
}
