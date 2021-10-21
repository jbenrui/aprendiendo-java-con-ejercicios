/**
 * Escribe un programa que calcule el volumen de un cono según la fórmula :
 *      1
 * V = ⁻⁻⁻ πr²h
 *      3
 * 
 * @author: Jose Antonio Benitez Ruiz
 * 
 */
public class JabrEjercicio09Tema3{
  
  public static void main (String[] args) {
    System.out.print("Introduce el radio del cono en cm: ");
    double radio = Double.parseDouble(System.console().readLine() );
    double radioCuadrado = Math.pow(radio, 2);
    
    System.out.print("Introduce la altura del cono en cm: ");
    double altura = Double.parseDouble(System.console().readLine() );
    
    double volumen = (((double)1 / (double)3) * (Math.PI * radioCuadrado * altura));
    System.out.printf("El volumen de un cono es : %f cm³" ,volumen );
    
  }
}

