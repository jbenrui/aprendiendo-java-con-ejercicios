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
    double x = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce un numero: ");
    double y = Double.parseDouble(System.console().readLine());
    
    double multiplicacion = (x * y );
    System.out.printf("La multiplicacion de %.2f * %.2f es %.2f \n " ,x ,y ,multiplicacion );
  }
}



