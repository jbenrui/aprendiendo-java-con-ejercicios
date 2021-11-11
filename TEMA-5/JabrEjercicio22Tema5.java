/**
 * Ejercicio: 22
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio22Tema5 {
  public static void main (String[] args) {
    int n = 2;
    while ( n <= 100){
    
      for(int divisor = 2; divisor <= n  ;divisor++){
        int divisible = n % divisor;
        if (divisible != 0){
          System.out.println(n);
          
          break;
        }else {
          break;
        } 
      
      }
      n++;
    }
  }
}

