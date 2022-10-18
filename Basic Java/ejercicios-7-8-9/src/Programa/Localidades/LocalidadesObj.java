package Programa.Localidades;

public class LocalidadesObj {

    //1. Atributos
    String name;

    //2. Constructores
    public LocalidadesObj(String name){
        this.name = name;
    }

    //3. Métodos
    @Override
    public String toString() {
        return name;
    }
}
