/**
 * Escribe un programa que calcule el área de un triangulo.
 * 
 * @author: Jose Antonio Benitez Ruiz
 * 
 */


public class JabrEjercicio06Tema3{
  
  public static void main (String[] args) {
    System.out.print("Introduce la base del triángulo en cm: ");
    double base = Double.parseDouble(System.console().readLine() );
    System.out.print("Introduce la altura del triángulo en cm: ");
    double altura = Double.parseDouble(System.console().readLine() );
    
    double resultado = (base * altura) / 2;
    System.out.printf("El área de un triángulo es : %.2f" ,resultado );
    
  }
}
