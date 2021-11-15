/**
 * Ejercicio: 27
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay 
 * entre 1 y un número leído por teclado.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio27Tema5 {
  public static void main (String[] args) {
    System.out.println("El programa muestra, cuenta y suma los multiplos de 3 corprendidos entre 1 y el numero elegido por el usuario.");
    System.out.print("Introduce un numero por teclado: ");
    int numero = Integer.parseInt(System.console().readLine()) ;
    int multiplo = 0;
    int sumarMultiplo=0;
    while ( multiplo < numero){
      multiplo+=3;
      System.out.print(multiplo +" ");
      sumarMultiplo = sumarMultiplo + multiplo;
    }
    System.out.println(" ");
    System.out.print("La suma de los multiplos es: "+ sumarMultiplo +" .");
  }
}


