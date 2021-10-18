/*
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */


public class JabrEjercicio01Tema3 {
  
  public static void main (String[] args) {
    System.out.println("Introduce un numero: ");
    int x = Integer.parseInt(System.console().readLine() );
    System.out.println("Introduce un numero: ");
    int y = Integer.parseInt(System.console().readLine() );
    
    int multiplicacion = (x * y );
    System.out.printf("La multiplicacion de %d * %d es %d \n " ,x ,y ,multiplicacion );
  }
}



