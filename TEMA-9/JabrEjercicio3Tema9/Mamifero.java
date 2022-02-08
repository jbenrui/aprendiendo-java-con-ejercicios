public abstract class Mamifero extends Animal {
  private int mesesDeGestacion;

  public Mamifero(String nombre, String color, int mesesDeGestacion) {
    super(nombre, color);
    this.mesesDeGestacion = mesesDeGestacion;
  }

  public int getMesesDeGestacion() {
    return mesesDeGestacion;
  }

  public void setMesesDeGestacion(int mesesDeGestacion) {
    this.mesesDeGestacion = mesesDeGestacion;
  }

}
