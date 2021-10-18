/*
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */


public class JabrEjercicio02Tema3 {
  public static void main (String[] args) {
    System.out.print("Introduce el valor de pesetas que quieres conventir: ");
    double valorConvertir = Double.parseDouble(System.console().readLine() );;
    double valorPeseta = 166.38;
    
    double resultado = (valorConvertir / valorPeseta);
    System.out.printf(" %.2f pesetas en euros son: %.2f €" ,valorConvertir ,resultado);
 }
}
