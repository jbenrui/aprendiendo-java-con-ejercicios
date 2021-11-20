/**
 * Ejercicio: 39
 * Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los números desde el 1 al número introducido junto
 * con su factorial.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio39Tema5 {
  public static void main (String[] args) {
    System.out.println("El programa calcula el factorial de un número entero leído por teclado.");
    System.out.print("Introduce un numero por teclado: ");
    int numero = Integer.parseInt(System.console().readLine()) ;
    int factorial = 1;
    int multiplicarFactorial=1;
    int contador = 1;
    while (contador <= numero){
      factorial=contador;
      multiplicarFactorial = multiplicarFactorial * factorial;
      System.out.println(contador +"! = "+ multiplicarFactorial);
      contador++;
    }
  }
}
