/**
 * Ejercicio: 4
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.

 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio04Tema6 {
  public static void main (String[] args) {
    System.out.println("El programa muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos).");
    int contador = 20;
    for (int i = 1; i <= contador;i++){
      int numAleatorio=(int)(Math.random()*11);
      System.out.print(numAleatorio+" ");
      
    }
  }
}
