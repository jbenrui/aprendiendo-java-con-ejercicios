/**
 * Ejercicio: 12
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
 * con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
 * convertir un entero en un carácter.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio12Tema6 {
  public static void main (String[] args) {
    System.out.println("Este programa llena la pantalla de caracteres aleatorios (a lo Matrix)");
    System.out.println("");
    while (1 < 20){
      int caracter=(int)(Math.random()*(126-32+1))+32;
      System.out.print((char)caracter);
    }
  }
}

