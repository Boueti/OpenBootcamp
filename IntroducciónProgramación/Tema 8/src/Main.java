public class Main {
  public static void main(String[] args) {
    Persona persona = new Persona();

    persona.setEdad(33);
    persona.setNombre("Diego");
    persona.setTelefono(654072617);

    System.out.println(persona.getNombre() + ", " + persona.getEdad() + " tacos");
    System.out.println("telefono: " + persona.getTelefono());
      }
}

class Persona {
  private int edad;
  private String nombre;
  private int telefono;

  public void setEdad (int edad){
    this.edad = edad;
  }

  public int getEdad(){
    return edad;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public String getNombre(){
    return nombre;
  }

  public void setTelefono(int telefono){
    this.telefono = telefono;
  }

  public int getTelefono(){
    return telefono;
  }
}