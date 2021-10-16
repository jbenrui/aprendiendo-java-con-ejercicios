/*
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estará almacenada en una
 * variable
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */


public class JabrEjercicio06Tema2 {
	public static void main (String[] args) {
		double baseImponible = 1200;
    double iva = 0.21;
    
    double resultado = ( baseImponible * iva ) + baseImponible;
    System.out.printf(" la base imponible es %.2f, con el iva añadidio es: %.2f " ,baseImponible ,resultado);
	}
}

