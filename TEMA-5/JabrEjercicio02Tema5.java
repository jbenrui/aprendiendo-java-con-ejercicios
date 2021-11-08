/**
 * Ejercicio: 2
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio02Tema5 {
  public static void main (String[] args) {
    System.out.println("Este programa muestra los multiplos de 5 desde el 0 al 100 ");
    int n = 5;
    int multiplo = 0;
    int resultado = 0; 
    while (resultado < 100){
      resultado = n * multiplo;
      System.out.print(resultado+ " ");
      multiplo ++;
      
    }
  }
}
