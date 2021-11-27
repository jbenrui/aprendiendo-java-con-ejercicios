/**
 * Ejercicio: 52
 * Realiza un programa que sea capaz de desplazar todos los dígitos de un número
 * de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría
 * a dar la vuelta y se colocaría a la derecha.Si el número tiene un solo dígito
 * ,se queda igual.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio52Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número entero : ");
    long numero = Integer.parseInt(System.console().readLine()) ;
    long resultado = 0;
    int digito = 0;
    
    System.out.print("El número resultado es ");
    /**Recorro el numero y voy diviendo entre 10 hasta llegar al 0**/
    while(numero > 0){
      digito = (int)(numero %10);
      System.out.print(digito);
      numero/=10;
    }
    
  }
}

