package com.ejercicio;

public class Ejercicio2 {

  public static void main(String[] args) {

    double precio = precioIva(30);

    System.out.println("El precio total con IVA es:" + precio);
  }

  static double precioIva(double precio) {
    return precio * 1.21;
  }
}
