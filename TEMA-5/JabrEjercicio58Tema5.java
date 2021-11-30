/**
 * Ejercicio: 58
 * Realiza un programa que calcule la media de los dígitos que contiene un número
 * entero introducido por teclado.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio58Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número entero : ");
    long numero = Integer.parseInt(System.console().readLine()) ;
    double resultado = 0;
    int digito = 0;
    double longitud= 0;
    long voltear = 0;
    /**Volteo el numero**/
    while (numero > 0){
      
      voltear = (voltear * 10) + (numero %10);
      numero /= 10;
      longitud++;
    }
    /**Recorro el numero**/
    for (int i = 0; i < longitud; i++){
      digito = (int)(voltear %10);
      resultado = resultado + digito;
      
      voltear/=10;
    }
    System.out.println("La media de sus dígitos es "+(resultado / longitud));
    
  }
}
