/**
 * Ejercicio: 17
 * Realiza un programa que sume los 100 números siguientes a un número entero y 
 * positivo introducido por teclado . Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio17Tema5 {
  public static void main (String[] args) {
    boolean repetir = true;
    while (repetir){
      System.out.print("Introduce un número por teclado: ");
      int n = Integer.parseInt(System.console().readLine()) ;
      if (n >= 0){
        int limitador = 100 + n;
        while( n <= limitador ){

            System.out.print(n++ + " ");
        }
        repetir = false;
      }else{
        System.out.println("El numero no es positivo");
        repetir = true;
      }
    }
  }
}
