/*
 * Escribe un programa que calcule el área de un triangulo.
 * 
 * @author: Jose Antonio Benitez Ruiz
 * 
 */


public class JabrEjercicio06Tema3{
  
  public static void main (String[] args) {
    System.out.print("Introduce la base del triangulo: ");
    int base = Integer.parseInt(System.console().readLine() );
    System.out.print("Introduce la altura del triangulo: ");
    int altura = Integer.parseInt(System.console().readLine() );
    
    double resultado = (base * altura) / 2;
    System.out.printf("El área de un rectángulo es : %.2f" ,resultado );
    
  }
}
