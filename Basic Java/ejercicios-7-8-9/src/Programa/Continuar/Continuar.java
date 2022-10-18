package Programa.Continuar;

import java.util.Objects;
import java.util.Scanner;

public class Continuar {

    public static void continuar() {
        Scanner yn = new Scanner(System.in);

        System.out.print("Continuar? (Pulsa y): ");
        String yesNo = yn.next();

        if (Objects.equals(yesNo, "y")){
            //Aquí va la invocación al programa
            System.out.println("Ejecutando programa...");
        } else {
            System.out.println("Saliendo...");
        }
    }
}
