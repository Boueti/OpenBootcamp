import ArrayList.ArrayLinkedMain;
import ArrayList.ArrayListIntMain;
import Arrays.Bidimensional;
import Arrays.Unidimensional;
import Excepciones.DividePorCero;
import Programa.Continuar.Continuar;
import Programa.PumptracksMain;
import ReverseChain.ReverseChain;
import Vector.VectorAddRemove;
import Vector.VectorCapacity;
import InOut.InOut;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 0
        System.out.println("Ej0 - Cadena al revés:");
        ReverseChain.reverse("Hola mundo");
        System.out.println(" "); //Espacio
        System.out.println(" "); //Espacio

        //Ejercicio 1
        System.out.println("Ej1 - Array Unidimensional");
        Unidimensional.unidimensional();
        System.out.println(" "); //Espacio

        //Ejercicio 2
        System.out.println("Ej2 - Array Bidimensional");
        Bidimensional.bidimensional();
        System.out.println(" "); //Espacio

        //Ejercicio 3 y 4
        System.out.println("Ej3&4 - Vector");
        VectorAddRemove.vectorAdd("Lechuga");
        VectorAddRemove.vectorAdd("Quinoa");
        VectorAddRemove.vectorAdd("Hummus");
        VectorAddRemove.vectorAdd("Café");
        VectorAddRemove.vectorAdd("Huevos");
        VectorAddRemove.vectorRemove(1);
        VectorAddRemove.vectorRemove(1);
        VectorAddRemove.vectorShow();
        System.out.println(" "); //Espacio
        System.out.println("El problema principal del vector es la forma en la que \n" +
                "amplia su capacidad cuando necesita más espacio \n" +
                "pues multiplica por dos la capacidad actual.\n" +
                "A continuación dejo una calculadora para comprobarlo.");
        VectorCapacity.capacidadInicial();
        System.out.println(" "); //Espacio

        //Ejercicio 5
        System.out.println("Ej5 - ArrayList to LinkedList");
        ArrayLinkedMain.main();
        System.out.println(" "); //Espacio

        //Ejercicio 6
        System.out.println("Ej6 - ArrayList int(Agrega y elimina pares)");
        ArrayListIntMain.main();
        System.out.println(" "); //Espacio

        //Ejercicio 7
        System.out.print("Inserta un número: ");
        try {
            DividePorCero.dividePorCero(4);
        } catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse.");
        }
        System.out.println("Demo de código");
        System.out.println(" "); //Espacio

        //Ejercicio 8
        InOut.copyPaste();
        System.out.println(" "); //Espacio

        //Ejercicio 9
        System.out.println("Ahora se va a iniciar el programa solicitado.");
        Continuar.continuar();
        PumptracksMain.main();
    }
}



