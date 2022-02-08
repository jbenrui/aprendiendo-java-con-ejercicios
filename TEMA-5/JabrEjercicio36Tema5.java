/**
 * Ejercicio: 36
 * Escribe un programa que diga si un número introducido por teclado es o no
 * capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
 * programa debe aceptar números de cualquier longitud siempre que lo permita
 * el tipo, en caso contrario el ejercicio no se dará por bueno.Se recomienda 
 * usar long en lugar de int ya que el primero admite números más largos.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio36Tema5 {
  public static void main (String[] args) {
    System.out.println("El programa nos dira si un numero es capicua o no");
    System.out.print("Introduce un numero por teclado: ");
    long numeroIntroducido = Integer.parseInt(System.console().readLine()) ;
    long numero = numeroIntroducido;
    long voltear = 0;
    /**Le doy la vuelta al numero**/
    while (numero > 0){
      
      voltear = (voltear * 10) + (numero %10);
      numero /= 10;
    }
    /**Comparo si el numero dado la vuelta es igual al numero que he introducido**/
    if (voltear == numeroIntroducido){
      System.out.print("El "+numeroIntroducido+ " es capicúa");
    }else{
      System.out.print("El "+numeroIntroducido+ " no es capicúa");
    }
    
    
  }
}


