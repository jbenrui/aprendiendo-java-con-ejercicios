/*
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 * convertir deberá estar almacenada en una variable.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */


public class JabrEjercicio05Tema2 {
  public static void main (String[] args) {
    double valorConvertir = 831.90;
    double valorPeseta = 166.38;
    
    double resultado = (valorConvertir / valorPeseta);
    System.out.printf(" %.2f pesetas en euros son: %.2f €" ,valorConvertir ,resultado);
	}
}
