public abstract class Animal {
  private String nombre;
  private String color;


  public Animal(String nombre, String color) {
    this.nombre = nombre;
    this.color = color;
  }


  public String getNombre() {
    return nombre;
  }


  public void setNombre(String nombre) {
    this.nombre = nombre;
  }


  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    this.color = color;
  }



  
}
