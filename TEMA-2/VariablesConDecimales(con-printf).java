/**
 * Uso de variables que contienen números decimales
 *
 * @author Jose Antonio Benitez Ruiz
 */
public class VariablesConDecimales {
  public static void main(String[] args) {
    double x; // Se declaran las variables x e y
    double y; // de tal forma que puedan almacenar decimales.

    x = 7;
    y = 25.01;
    
    System.out.printf("%.3f  \n", x);
    System.out.printf("%.3f  ", y);
  }
}
