/**
 * Realiza un programa que resuelva una ecuación de primer grado 
 * (del tipo ax+b = 0).
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio5Tema4 {
  public static void main (String[] args) {
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0 ");
    System.out.print("Introduce el valor de a: ");
    int a = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el valor de b: ");
    int b = Integer.parseInt(System.console().readLine());
    
    if (a >0) { 
      System.out.printf("%dx + %d = 0 \n" ,a ,b);
      System.out.printf("%dx = -%d \n" ,a ,b );
      System.out.printf("x = %d/-%d \n" ,a ,b );
      
      int resultado = ( (int)a / (int)(-b));
      System.out.printf("x = %d \n" ,resultado);
      
    } else {
      System.out.print("Operacion no valida");
    }
  }
}


