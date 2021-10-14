/*
 * Uso de variables enteras
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */


public class JabrEjercicio01Tema2 {
	
	public static void main (String[] args) {
    int x = 144;
    int y = 999;
    
    int suma = (x + y);
    System.out.printf(" La suma de %d + %d es %d \n " ,x ,y ,suma );
    
    int resta = (x - y);
    System.out.printf("La resta de %d - %d es %d \n " ,x ,y ,resta );
    
    int multiplicacion = (x * y );
    System.out.printf("La multiplicacion de %d - %d es %d \n " ,x ,y ,multiplicacion );
    
    double division = (double) x / (double) y;
    System.out.printf("La division es %d / %d es %f",x ,y ,division);
    
		
	}
}

