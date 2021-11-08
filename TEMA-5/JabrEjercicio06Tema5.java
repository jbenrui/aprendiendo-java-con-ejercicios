/**
 * Ejercicio: 6
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
 * un bucle do-while.
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio06Tema5 {
  public static void main (String[] args) {
    System.out.println("Este programa muestra los numeros del 320 al 160 contando de 20 en 20 hacia atrás");
    int n = 320;
    do{
      n-=20;
      System.out.print(n + " ");
    }while (n > 160);
  }
}


