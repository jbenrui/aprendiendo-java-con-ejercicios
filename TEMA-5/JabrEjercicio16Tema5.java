/**
 * Ejercicio: 16
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio16Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduce un número base por teclado: ");
    int n = Integer.parseInt(System.console().readLine()) ;
    for(int divisor = 2; divisor < n  ;divisor++){
      int divisible = n % divisor;
      if (divisible != 0){
        System.out.print("Es primo.");
        break;
      }else {
        System.out.print("No es primo.");
        break;
      } 
    }
  }
}

