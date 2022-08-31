package Devices;

import Main.SmartDevice;

public class SmartPhone extends SmartDevice {

    //Attributes
    String technologyConnection;
    String cameraFrontPixelResolution;
    String cameraBackPixelResolution;
    public double volume;

    //Constructors
    public SmartPhone(){}

    public SmartPhone(String madeBy, String model, Double storageCapacity,
                      boolean microSd, int autonomy, int batteryLevel,
                      String technologyConnection, String cameraFrontPixelResolution,
                      String cameraBackPixelResolution, double volume) {
        super(madeBy, model, storageCapacity, microSd, autonomy, batteryLevel);
        this.technologyConnection = technologyConnection;
        this.cameraFrontPixelResolution = cameraFrontPixelResolution;
        this.cameraBackPixelResolution = cameraBackPixelResolution;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "SmartPhone{" + super.toString() +
                "technologyConnection='" + technologyConnection + '\'' +
                ", cameraFrontPixelResolution='" + cameraFrontPixelResolution + '\'' +
                ", cameraBackPixelResolution='" + cameraBackPixelResolution + '\'' +
                ", volume=" + volume +
                '}';
    }

    //Methods
    public void volumeUp(int quantity){
        if(volume + quantity >= 0 && volume + quantity <= 100){
            this.volume += quantity;
        } else {
            System.out.println("Superado el volumen máximo (max: 100)");
            this.volume = 100;
        }
    }

    public void volumeDown(int quantity){
        if(volume - quantity >= 0 && volume - quantity <= 100){
            this.volume -= quantity;
        } else {
            System.out.println("Superado el volumen mínimo (min: 0)");
            this.volume = 0;
        }
    }
}
