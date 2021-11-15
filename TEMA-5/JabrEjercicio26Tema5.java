/**
 * Ejercicio: 26
 * Realiza un programa que pida primero un número y a continuación un dígito.
 * El programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio26Tema5 {
  public static void main (String[] args) {
    System.out.println("El programa nos dara la posición  de un ese dígito en el número introducido.");
    System.out.print("Introduce un numero por teclado: ");
    int numero = Integer.parseInt(System.console().readLine()) ;
    System.out.print("Introduce un digito por teclado: ");
    int digito = Integer.parseInt(System.console().readLine()) ;
    int cifra = 1;
    int posicion = 0;
    while ( numero > 0){
      /*saco la cifra con el modulo*/
      cifra = numero % 10;
      /*si la cifra es igual al digito entonces mostrara el siguiente mensaje por pantalla*/
      if (cifra == digito){
        System.out.println("El digito en la posicion "+posicion+" es "+cifra);
        }
      
      numero = numero / 10;  /*divido el numero entre 10 para ir reduciendo el numero*/
      
      posicion++;/*por cada vuelta aumento la posicion hasta llegar al digito deseado*/
      
    }
  }
}

