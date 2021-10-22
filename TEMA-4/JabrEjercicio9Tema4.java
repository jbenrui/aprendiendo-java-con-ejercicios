/**
 * Realiza un programa que resuelva una ecuación de segundo grado 
 * (del tipo ax2 + bx + c = 0).
 * 
 * 
 */
public class JabrEjercicio9Tema4 {
  public static void main (String[] args) {
    System.out.println("Este programa resuelve ecuaciones de segundo grado del tipo ax2 + bx + c = 0 ");
    System.out.print("Introduce el valor de a: ");
    int a = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el valor de b: ");
    int b = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el valor de c: ");
    int c = Integer.parseInt(System.console().readLine());
    
    if (a >0) { 
      
      double CoficienteRaiz = Math.pow((double)b,2.0) - (4.0*(double)a*(double)c);
      
      double RaizCuadrada1 = (-(double)b + Math.sqrt(CoficienteRaiz));
      double SolucionX1 = RaizCuadrada1 / (2.0*(double)a);
      System.out.println("La primera solucion es : " + SolucionX1);
       
      double RaizCuadrada2 = (-(double)b - Math.sqrt(CoficienteRaiz));
      double SolucionX2 = RaizCuadrada2 / (2.0*(double)a);
      System.out.println("La segunda solucion es: " + SolucionX2);
      
    } else {
      System.out.print("Operacion no valida");
    }
  }
}
