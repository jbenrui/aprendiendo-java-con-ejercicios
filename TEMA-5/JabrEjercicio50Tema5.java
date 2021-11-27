/**
 * Ejercicio: 50
 * Una empresa de cartelería nos ha encargado un programa para realizar uno de
 * sus diseños. Debido a los acontecimientos que han tenido lugar en Cataluña
 * durante el 2018, han recibido muchos pedidos del cartel que muestra el número
 * 155. Realiza un programa que pinte el número 155 mediante asteriscos. Al
 * usuario se le pedirán dos datos, la altura del cartel y el número de espacios
 * que habrá entre los números. La altura mínima es 5. La anchura de los números
 * siempre es la misma. La parte superior de los cincos también es siempre igual.
 * La parte inferior del 5 sí que varía en función de la altura.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio50Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduzca la altura (5 como mínimo): ");
    int altura = Integer.parseInt(System.console().readLine()) ;
    System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
    int espaciosNum = Integer.parseInt(System.console().readLine()) ;
    int base = 4;
    int linea = 1;
    
    while (linea <= altura){
      /**NUMERO 1**/
      System.out.print("*");
      /**Espacios entre numero**/
      for (int espacio = 0; espacio < espaciosNum; espacio++){
        System.out.print(" ");
      }
      /**NUMERO 5**/
      for (int anchura5 = 1; anchura5 <= base; anchura5++){
        if ((linea == 2 )&&(anchura5 > 1)){
          System.out.print(" ");
        }else if (((linea > 3) && (linea < altura)) && (anchura5 < 4)){
          System.out.print(" ");
        }else {
          System.out.print("*");
        }
      }
      /**Espacios entre numero**/
      for (int espacio = 0; espacio < espaciosNum; espacio++){
        System.out.print(" ");
      }
      /**NUMERO 5**/
      for (int anchura5 = 1; anchura5 <= base; anchura5++){
        if ((linea == 2 )&&(anchura5 > 1)){
          System.out.print(" ");
        }else if (((linea > 3) && (linea < altura)) && (anchura5 < 4)){
          System.out.print(" ");
        }else {
          System.out.print("*");
        }
      }
      linea++;
      System.out.println(" ");
    }
    
  }
}

