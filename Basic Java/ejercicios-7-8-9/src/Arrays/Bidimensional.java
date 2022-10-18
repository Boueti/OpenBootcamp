package Arrays;

public class Bidimensional {
    static int[][] enteros = {{1, 2, 3},{4, 5, 6}};

    //Función que recorre y muestra el Array cuando se le invoca desde el Main
    public static void bidimensional(){
        for (int i = 0; i < enteros.length; i++){
            for (int x = 0; x < enteros[i].length; x++){
                System.out.println("Posición: " + i + " " + x + ", Valor: " + enteros[i][x]);
            }
        }
    }
}
