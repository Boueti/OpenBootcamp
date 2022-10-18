package Programa;

import Programa.IO.GuardarLeerArchivo;
import Programa.Localidades.LocalidadesMain;

public class PumptracksMain {
    public static void main() {

        LocalidadesMain.main();
//        LocalidadesCRUD.read();

        GuardarLeerArchivo.saveFile();
        GuardarLeerArchivo.readFile();
    }
}
