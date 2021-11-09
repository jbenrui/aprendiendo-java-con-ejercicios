/**
 * Ejercicio: 11
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio11Tema5 {
  public static void main (String[] args) {
    int n = 0;
    int digito = 0;
    System.out.print("Introduce un número por teclado: ");
    n = Integer.parseInt(System.console().readLine()) ;
    System.out.printf(" numero   su raiz   su cubo \n");
    System.out.printf(" --------------------------- \n");
    while (digito < 5){
      double raizCuadrada= Math.pow(n,2);
      double raizCubo = Math.pow(n,3);
      System.out.printf("   %d  %8.0f  %8.0f \n",n,raizCuadrada,raizCubo);
      n = 1 + n;
      digito ++;
      
      
    }
    
  }
}

