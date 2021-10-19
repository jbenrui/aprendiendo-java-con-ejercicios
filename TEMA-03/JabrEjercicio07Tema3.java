/**
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio07Tema3 {
  public static void main (String[] args) {
    System.out.print("Introduce la base imponible a calcular: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    double iva = 0.21;
    
    double resultado = ( baseImponible * iva ) + baseImponible;
    System.out.printf("La base imponible es %.2f, con el iva añadidio es: %.2f " ,baseImponible ,resultado);
	}
}

