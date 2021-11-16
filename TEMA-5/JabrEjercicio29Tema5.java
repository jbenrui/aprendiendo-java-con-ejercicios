/**
 * Ejercicio: 29
 * Escribe un programa que muestre por pantalla todos los números enteros positi
 * -vos menores a uno leído por teclado que no sean divisibles entre otro también
 * leído de igual forma.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio29Tema5 {
  public static void main (String[] args) {
    System.out.println("El programa muestra numeros positivos menores al introducido por el usuario y que no sean divisibles por el numero divisor elegido por el usuario .");
    System.out.print("Introduce un numero por teclado: ");
    int numero = Integer.parseInt(System.console().readLine()) ;
    System.out.print("Introduce un divisor por teclado: ");
    int divisor = Integer.parseInt(System.console().readLine()) ;
    int comprobador = 0;
    while ( numero > 0){
      numero--;
      comprobador = numero % divisor;
      if (comprobador != 0){
        System.out.print(numero+" ");
        }
    }
    System.out.println(" ");
  }
}

