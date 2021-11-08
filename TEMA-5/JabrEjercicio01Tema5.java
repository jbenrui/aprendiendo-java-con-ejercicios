/**
 * Ejercicio: 1
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio01Tema5 {
  public static void main (String[] args) {
    System.out.println("Este programa muestra los multiplos de 5 desde el 0 al 100 ");
    int n = 5;
    int multiplo = 0;
    for (int resultado = 0; resultado < 100; multiplo ++){
      resultado = n * multiplo;
      System.out.print(resultado+ " ");
      
    }
  }
}
