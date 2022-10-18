package Programa.IO;

import Programa.Localidades.LocalidadesCRUD;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class GuardarLeerArchivo {

    public static void saveFile(){
        try {
            PrintStream info = new PrintStream("LocalidadesBBDD.txt");
            info.println(LocalidadesCRUD.localidades);
            System.out.println("Guardado correctamente.");
        } catch (FileNotFoundException e){
            System.out.println("No se puede guardar: " + e.getMessage());
        }
    }

    public static void readFile() {
        try {
            FileInputStream fichero = new FileInputStream("LocalidadesBBDD.txt");

            try {
                byte[] datos = fichero.readAllBytes();

                System.out.println("Estos son los pumptracks de España (Ubicación = valoración):");
                for (byte dato : datos) {
                    System.out.print((char) dato);
                }
            } catch (IOException e) {
                System.out.println("Imposible leer el fichero. " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Oye, que no existe! " + e.getMessage());
        }
    }
}
