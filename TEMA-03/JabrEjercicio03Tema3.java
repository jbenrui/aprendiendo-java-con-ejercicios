/*
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */


public class JabrEjercicio03Tema3 {
  public static void main (String[] args) {
    System.out.print("Introduce el valor de euros que quieres conventir: ");
    double valorConvertir = Double.parseDouble(System.console().readLine() );;
    double valorPeseta = 166.38;
    
    double resultado = (valorConvertir * valorPeseta);
    System.out.printf(" %.2f euros en pesetas son: %.2f pesetas" ,valorConvertir ,resultado);
	}
}
