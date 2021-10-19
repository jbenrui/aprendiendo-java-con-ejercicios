/**
 * Realiza un conversor de pesetas a euros. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */


public class JabrEjercicio02Tema3 {
  public static void main (String[] args) {
    System.out.print("Introduce el valor de pesetas que quieres conventir: ");
    int pesetas = Integer.parseInt(System.console().readLine() );;
    double factorConversion = 166.38;
    
    double euros = (pesetas / factorConversion);
    System.out.printf(" %d pesetas en euros son: %.2f €" ,pesetas ,euros);
 }
}
