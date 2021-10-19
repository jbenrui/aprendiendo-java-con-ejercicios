/**
 * Escribe un programa que calcule el área de un rectángulo.
 * 
 * @author: Jose Antonio Benitez Ruiz
 * 
 */
public class JabrEjercicio05Tema3{
  
  public static void main (String[] args) {
    System.out.print("Introduce la base del rectangulo en cm: ");
    int base = Integer.parseInt(System.console().readLine() );
    System.out.print("Introduce la altura del rectangulo en cm: ");
    int altura = Integer.parseInt(System.console().readLine() );
    
    int resultado = base * altura;
    System.out.printf("El área de un rectángulo es : %d cm" ,resultado );
    
  }
}

