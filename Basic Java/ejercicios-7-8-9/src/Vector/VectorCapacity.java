package Vector;

import java.util.Scanner;

public class VectorCapacity {
    static Scanner num = new Scanner(System.in);

    //Funcion que lanza dos Scanners(Capacidad del vector y Cantidad de elementos a agregar)
    //Posteriormente hace un cálculo y muestra la capacidad total que tendría el vector
    public static void capacidadInicial(){
        System.out.println("Agrega capacidad inicial del vector:");
        int capacity = num.nextInt();
        System.out.println("Agrega cantidad elementos a añadir al vector:");
        int elementos = num.nextInt();

        while(capacity < elementos) {
                capacity = capacity * 2;
        }
        System.out.println("Capacidad actual del vector: " + capacity);
    }
}
