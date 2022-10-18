package InOut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class InOut {
    static Scanner read = new Scanner(System.in);

    public static void copyPaste(){
        System.out.print("Agrega un fichero (Ejemplo: copia.txt): ");
        String fichero = read.next();
        try {
            FileInputStream fileIn = new FileInputStream(fichero);
            byte[] dataFileIn = fileIn.readAllBytes();
            fileIn.close();

            PrintStream fileOut = new PrintStream("Copiado.txt");
            fileOut.write(dataFileIn);
            fileOut.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
