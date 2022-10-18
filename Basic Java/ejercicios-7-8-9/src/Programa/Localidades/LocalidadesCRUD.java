package Programa.Localidades;

import Programa.Pumptracks.PumptracksCRUD;

import java.util.*;

public class LocalidadesCRUD extends PumptracksCRUD {

    //Estructura de datos
    public static ArrayList<HashMap> localidades = new ArrayList<>();

    //Crear
    public static void save(HashMap localidad){
        localidades.add(localidad);
    }

    //Leer
    public static void read(){
        for(HashMap loc : localidades){
            System.out.println(loc);
        }
            }

    //Eliminar
    public static void eliminar(HashMap localidad){
        localidades.remove(localidad);
    }
}

