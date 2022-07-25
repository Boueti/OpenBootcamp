public class Main {
  public static void main(String[] args) {
    Cliente cliente = new Cliente();
    Trabajador trabajador = new Trabajador();

    cliente.nombre = "Pepe";
    cliente.edad = 87;
    cliente.telefono = 652398759;
    cliente.credito = 789;

    trabajador.nombre = "Juan";
    trabajador.edad = 43;
    trabajador.telefono = 635410201;
    trabajador.salario = 358;

    System.out.println ("CLIENTE");
    System.out.println("Nombre: " + cliente.nombre);
    System.out.println ("Edad: " + cliente.edad);
    System.out.println ("Tlf: " + cliente.telefono);
    System.out.println ("Credito: " + cliente.credito);
    System.out.println ("-------");
    System.out.println ("TRABAJADOR");
    System.out.println("Nombre: " + trabajador.nombre);
    System.out.println ("Edad: " + trabajador.edad);
    System.out.println ("Tlf: " + trabajador.telefono);
    System.out.println ("Salario: " + trabajador.salario);
  }
}

class Persona {
  String nombre;
  int edad;
  int telefono;
}

class Cliente extends Persona {
  double credito;
}

class Trabajador extends Persona {
  double salario;
}