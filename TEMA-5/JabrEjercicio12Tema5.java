/**
 * Ejercicio: 12
 * Escribe un programa que muestre los n primeros términos de la serie de Fibona
 * -cci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y  el 
 * resto se calcula sumando los dos anteriores, por lo que tendríamos que los té
 * -rminos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
 * introducir por teclado.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio12Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduce un número por teclado: ");
    int n1 = Integer.parseInt(System.console().readLine()) ;
    int n2 = 1;
    int n3 = n1 + n2;
    
    
    while (n3 < 144){
      
    n3 = n1 + n2; 
    System.out.print( n3 +" ");
    n1 = n2;
    n2 = n3;
      
    }
    
  }
}
