/**
 * Ejercicio: 8
 * Muestra la tabla de multiplicar de un número introducido por teclado
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio08Tema5 {
  public static void main (String[] args) {
    System.out.println("Muestra la tabla de multiplicar de un número introducido por teclado");
    System.out.print("Introduce un numero para sacar su tabla de multiplicar: ");
    int n = Integer.parseInt(System.console().readLine()) ;
    
    for (int multiplicador = 0; multiplicador <= 10; multiplicador ++){
      System.out.printf("%2d x %2d = %2d\n",n,multiplicador,(n*multiplicador));
      
    }
  }
}

