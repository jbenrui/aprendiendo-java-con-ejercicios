/**
 * Ejercicio: 67
 * Realiza un programa que pinte una escalera que va descendiendo de izquierda
 * a derecha. El programa pedirá el número de escalones y la altura de cada
 * escalón. La anchura de los escalones siempre es la misma: 4 asteriscos.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio67Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduzca el número de escalones: ");
    int numEscalones = Integer.parseInt(System.console().readLine()) ;
    System.out.print("Introduzca la altura de cada escalón: ");
    int alturaEscalon = Integer.parseInt(System.console().readLine()) ;
    int espaciosDetras = 4 ;
    int longitudlinea = 4;
    while ( numEscalones > 0 ){
      for (int j = alturaEscalon; j >= 0; j--){
        /**pinto escalon**/
        for (int i = 0; i < longitudlinea ; i++){
          System.out.print("*");
        }
        /**pinto espacioDetras**/
        for (int i = 0; i < espaciosDetras ; i++){
          System.out.print(" ");
        }
        System.out.println(" ");
        
      }
      numEscalones--;
      espaciosDetras+=4;
      longitudlinea+=4;
    }
  }
}
