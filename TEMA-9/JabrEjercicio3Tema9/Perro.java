public class Perro extends Mamifero {
  private String tipoDeLadrido;

  public Perro(String nombre, String color, int mesesDeGestacion, String tipoDeLadrido) {
    super(nombre, color, mesesDeGestacion);
    this.tipoDeLadrido = tipoDeLadrido;
  }

  @Override
  public String toString() {
    return "Hola, ella es " + this.getNombre() + " es de color " + this.getColor() + " y ladra " + this.tipoDeLadrido + " y lindo.";
  }

}
