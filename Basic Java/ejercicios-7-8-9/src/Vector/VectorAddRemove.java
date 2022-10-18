package Vector;

import java.util.Vector;

public class VectorAddRemove {
    static Vector<String> vector = new Vector<>();

    public static void vectorAdd(String string){
        System.out.println("Agregado al vector: " + string);
        vector.add(string);
    }
    public static void vectorRemove(int posicion){
        System.out.println("Eliminado del vector: " + vector.get(posicion));
        vector.remove(posicion);
    }

    public static void vectorShow(){
        for (int i = 0; i < vector.size(); i++){
            System.out.println("Posicion Vector: " + i + " Valor Vector: " + vector.get(i));
        }
    }
}

