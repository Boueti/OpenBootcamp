package Programa.Localidades;
import static Programa.Pumptracks.PumptracksCRUD.*;

public class LocalidadesMain{
    public static void main() {

        valencia.put("Nazaret", 0);
        valencia.put("Campanar", 0);
        valencia.put("Gilet", 0);
        LocalidadesCRUD.save(valencia);
        vizcaya.put("Mungia", 0);
        vizcaya.put("XC Etxebarri", 0);
        LocalidadesCRUD.save(vizcaya);
    }
}
