package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLinkedMain {
    public static void main() {

        //Crea un ArrayList con una capacidad de 4
        //Agrega 4 elementos
        ArrayList<String> generosMusica = new ArrayList<>(4);
        generosMusica.add("Pop");
        generosMusica.add("House");
        generosMusica.add("Rock");
        generosMusica.add("Jazz");

        //Copia los elementos del ArrayList en un LinkedList
        LinkedList<String> generosMusicaLinked = new LinkedList<>();
        generosMusicaLinked.addAll(generosMusica);

        //Recorre el ArrayList
        for(String arrayList : generosMusica){
            System.out.println("ArrayList: " + arrayList);
        }

        //Recorre el LinkedList
        for(String linked : generosMusicaLinked){
            System.out.println("LinkedList: " + linked);
        }
    }

}
