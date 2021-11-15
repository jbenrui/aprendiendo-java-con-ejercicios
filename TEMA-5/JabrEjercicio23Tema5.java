/**
 * Ejercicio: 23
 * Escribe un programa que permita ir introduciendo una serie indeterminada
 * de números mientras su suma no supere el valor 10000. Cuando esto último
 * ocurra, se debe mostrar el total acumulado, el contador de los números 
 * introducidos y la media.

 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio23Tema5 {
  public static void main (String[] args) {
    int n = 0;
    int contador = 0;
    int acumulador = 0;
    
    while (acumulador < 10000){
      System.out.print("Introduce un número por teclado: ");
      n = Integer.parseInt(System.console().readLine()) ;
      contador++;
      acumulador = acumulador + n;
      
    }
    
    System.out.println("Se han introducido " + contador +" numeros.");
    System.out.println("El total acumulado es "+ acumulador +" .");
    double media= acumulador / contador;
    System.out.printf("La media de los numeros es: %.2f \n ",media);
  }
}


