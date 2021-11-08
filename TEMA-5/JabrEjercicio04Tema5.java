/**
 * Ejercicio: 4
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
 * un bucle for.
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio04Tema5 {
  public static void main (String[] args) {
    System.out.println("Este programa muestra los numeros del 320 al 160 contando de 20 en 20 hacia atrás");
    for (int n = 320; n >= 160; n-=20){
      System.out.print(n + " ");
    }
  }
}

