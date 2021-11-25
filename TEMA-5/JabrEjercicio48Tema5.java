/**
 * Ejercicio: 48
 * Realiza un programa que diga los dígitos que aparecen y los que no aparecen
 * en un número entero introducido por teclado. El orden es el que se muestra en
 * los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
 * largos.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio48Tema5 {
  public static void main (String[] args) {
    System.out.println("Realiza un programa que diga los dígitos que aparecen y los que no aparecen en un número entero introducido por teclado.");
    System.out.print("Introduzca un número entero: ");
    long numero = Integer.parseInt(System.console().readLine()) ;
    long duplicar = 0;
    boolean encontrado;
    System.out.print("Dígitos que aparecen en el número: ");
    /**Cifras dentro del numero**/
    for (int i = 0; i < 10; i++){
      duplicar = numero;
      encontrado = false;
      while (duplicar > 0){
        if (duplicar % 10 == i){
          encontrado = true;
        }
        duplicar /=10;
      }
      if (encontrado){
        System.out.print(i + " ");
        }
    }
    System.out.println("");
    System.out.print("Dígitos que no aparecen en el número: ");
    /**Cifras que no estan en el numero**/
    for (int i = 0; i < 10; i++){
      duplicar = numero;
      encontrado = false;
      while (duplicar > 0){
        if (duplicar % 10 != i){
          encontrado = true;
        }
        duplicar /=10;
      }
      if (encontrado){
        System.out.print(i + " ");
        }
    }
  }
}

