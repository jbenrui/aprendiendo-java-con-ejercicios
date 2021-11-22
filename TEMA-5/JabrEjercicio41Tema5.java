/**
 * Ejercicio: 41
 * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
 * hay dentro de un número. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio41Tema5 {
  public static void main (String[] args) {
    System.out.println("El programa pide 2 y luego los mezcle en dos números diferentes los dígitos pares y los impares.");
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Integer.parseInt(System.console().readLine()) ;
    long numero = numeroIntroducido;
    long voltear = 0;
    int longitud = 0;
    if ( numero == 0){
      longitud=1;
      }
    
    /**Volteo el numero**/
    while (numero > 0){
      
      voltear = (voltear * 10) + (numero %10);
      numero /= 10;
      longitud++;
    }
    long numeroPares = 0;
    long numeroImpares = 0;
    int digito = 0;
    /**recorro el numero volteados para sacar los resultados**/
    for (int a = 0; a < longitud; a++){
      digito = (int)(voltear %10);
      if ((digito % 2)==0){
        numeroPares++;
      }else{
        numeroImpares++;
      }
      voltear/=10;
    }
    System.out.println("El "+ numeroIntroducido +" contiene "+ numeroPares +" dígitos pares y "+numeroImpares+" dígitos impares.");
  
  }
}
