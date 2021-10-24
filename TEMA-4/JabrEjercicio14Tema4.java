/**
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio14Tema4 {
  public static void main (String[] args) {
    System.out.print("Este programa dira si el numero que has introducido es");
    System.out.println(" par y divisible entre 5.");
    System.out.println(" ");
    System.out.print("Dime el numero que deseas comprobar: ");
    int n1 = Integer.parseInt(System.console().readLine() );
    int par = n1 % 2 ; 
    int divisible = n1 % 5;
    
    if ((par == 0) && (divisible == 0)){
      System.out.print("par y es divisible entre 5");
    } else if ((par == 0)&&(divisible != 0)){
      System.out.print("El numero es par pero no divisible entre 5 ");
    } else if ((par != 0)&&(divisible == 0)){
      System.out.print("El numero es impar y divisible entre 5 ");
    }  else {
      System.out.print("El numero es impar y no es divisible entre 5 ");
    } 
  }
}
