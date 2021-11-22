/**
 * Ejercicio: 42
 * Escribe un programa que pida un número entero positivo por teclado y que mues
 * -tre a continuación los 5 números consecutivos a partir del número introducido
 * Al lado de cada número se debe indicar si se trata de un primo o no.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio42Tema5 {
  public static void main (String[] args) {
    System.out.println("El programa calcula el factorial de un número entero leído por teclado.");
    System.out.print("Por favor, introduzca un número entero positivo :");
    int numero = Integer.parseInt(System.console().readLine()) ;
    int esPrimo = 0;
    int contador = 0;
    boolean NoesPrimo;
    while (contador < 5){
      NoesPrimo=false;
      for (int i=2; i < numero; i++){
          if (numero % i == 0){
            NoesPrimo = true;
          }
      }
      if(NoesPrimo){
        System.out.println(numero +" no es primo");
      }else{
        System.out.println(numero +" es primo");
      }
      numero++;
      contador++;
    }
  }
}


