/**
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h. Aplica la fórmula t =√2h/g siendo g = 9.81m/s².
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio6Tema4 {
  public static void main (String[] args) {
    
    System.out.println("Este programa resuelve cuanto tiempo tardara en caer usando la formula t =√2h/g siendo g = 9.81m/s²");
    System.out.print("Introduce el valor de la altura en m: ");
    double h = Double.parseDouble(System.console().readLine());
    
    final double g = 9.81; // las constantes se declaran con final
    double segundos = Math.sqrt(( 2 * h) / g);
      System.out.printf("El objeto tardara en caer :%.2f s" ,segundos);
  }
}
