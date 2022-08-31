package Main;

import Devices.SmartPhone;
import Devices.SmartWatch;

public class Main {

    public static void main(String[] args) {

        SmartPhone iPhone = new SmartPhone("Apple", "11 Pro Max", 256.0, false,
                52, 100, "4G", "20px",
                "12px", 50);

        SmartWatch appleWatch = new SmartWatch("Apple", "Series 7", 64.0, false,
                154, 100, true, true);

        System.out.println(iPhone);
        System.out.println(appleWatch);

        System.out.println("Subir volumen iPhone");
        System.out.println("Volumen inicial: " + iPhone.volume);
        iPhone.volumeUp(60);
        System.out.println("Volumen subido: " + iPhone.volume);

    }

}
