/**
 * Ejercicio: 25
 * Realiza un programa que pida un número por teclado y que luego muestre ese 
 * número al revés.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio25Tema5 {
  public static void main (String[] args) {
    System.out.println("El programa leera un numero y mostrara ese numero al reves.");
    System.out.print("Introduce un numero por teclado: ");
    int n = Integer.parseInt(System.console().readLine()) ;
    int voltear = 0;
    while (n > 0){
      //
      voltear = (voltear * 10) + (n %10);
      n /= 10;
    }
    System.out.println("La numero con el orden distinto es: "+voltear);
  }
}
