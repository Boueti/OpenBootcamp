package Arrays;

public class Unidimensional {
    static String[] names = {"Diego", "Lucia", "Paco", "Malales"};

    //Función que recorre y muestra el Array cuando se le invoca desde el Main
    public static void unidimensional() {
        for (String name : names){
            System.out.println(name);
        }

    }
}
