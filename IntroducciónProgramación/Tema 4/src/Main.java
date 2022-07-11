public class Main {
  public static void main(String[] args) {




  // if, else if y else
    int numeroIF = 7;

    if (numeroIF > 0) {
      System.out.println("Es positivo");
    } else if (numeroIF < 0) {
      System.out.println("Es negativo");
    } else {
      System.out.println("Es cero");
    }

    //while
    int numeroWhile = -2;

    while (numeroWhile < 3) {
      numeroWhile = numeroWhile + 1;
      System.out.println("Bucle while =" + numeroWhile);
    }


    //do while
    int numeroDoWhile = 5;

    do {
      System.out.println("Bucle do =" + numeroDoWhile);
      numeroDoWhile = numeroDoWhile + 1;
    } while(numeroDoWhile < 5);

    //for
    for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1) {
      System.out.println("For = " + numeroFor);
    }

    //switch case
    String estacion = "verano";

    switch (estacion) {
      case "invierno":
        System.out.println("Es invierno");
        break;
      case "verano":
        System.out.println("Es verano");
        break;
      case "otoño":
        System.out.println("Es otoño");
        break;
      case "primavera":
        System.out.println("Es primavera");
        break;
      default:
        System.out.println("No es una estación");
    }
  }
}