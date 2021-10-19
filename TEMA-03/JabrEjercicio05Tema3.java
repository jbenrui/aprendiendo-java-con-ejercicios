/**
 * Escribe un programa que calcule el área de un rectángulo.
 * 
 * @author: Jose Antonio Benitez Ruiz
 * 
 */
public class JabrEjercicio05Tema3{
  
  public static void main (String[] args) {
    System.out.print("Introduce la base del rectangulo en cm: ");
    double base = Double.parseDouble(System.console().readLine() );
    System.out.print("Introduce la altura del rectangulo en cm: ");
    double altura = Double.parseDouble(System.console().readLine() );
    
    double resultado = base * altura;
    System.out.printf("El área de un rectángulo es : %.f cm²" ,resultado );
    
  }
}

