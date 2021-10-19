/**
 * Realiza un conversor de pesetas a euros. La cantidad de euros que se quiere
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
    
    int resultado = (int)(valorConvertir * valorPeseta);
    System.out.printf(" %.2f euros en pesetas son: %d pesetas" ,valorConvertir ,resultado);
	}
}
