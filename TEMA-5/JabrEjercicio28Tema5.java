/**
 * Ejercicio: 28
 * Escribe un programa que calcule el factorial de un número entero leído por
 * teclado.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio28Tema5 {
  public static void main (String[] args) {
    System.out.println("El programa calcula el factorial de un número entero leído por teclado.");
    System.out.print("Introduce un numero por teclado: ");
    int numero = Integer.parseInt(System.console().readLine()) ;
    int factorial = 1;
    int multiplicarFactorial=1;
    while ( factorial < numero){
      factorial++;
      multiplicarFactorial = multiplicarFactorial * factorial;
    }
    System.out.println(" ");
    System.out.print("El factorial de "+ numero +" es "+ multiplicarFactorial +" .");
  }
}
