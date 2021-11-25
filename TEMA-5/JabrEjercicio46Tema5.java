/**
 * Ejercicio: 46
 * Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
 * asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
 * que tanto la anchura como la altura sean mayores o iguales que 2, en caso
 * contrario se debe mostrar un mensaje de error.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio46Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduce la altura del rectangulo por teclado(min. 2): ");
    int altura = Integer.parseInt(System.console().readLine()) ;
    System.out.print("Introduce la anchura del rectangulo por teclado(min. 2): ");
    int anchura = Integer.parseInt(System.console().readLine()) ;
    if ((altura < 2) || (anchura < 2)){
      System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2.");
    }else{
      /**Cabeza del rectangulo **/
      for (int i = 0; i < anchura -1; i++){
        System.out.print("*");
      }
      /**Cuerpo del rectangulo **/
      for (int i = 2; i < altura; i++ ){
        System.out.println("");
        System.out.print("*");
        for (int aux = 2; aux <= (anchura - 2);aux++){
          System.out.print(" ");
        } 
        System.out.print("*");
      }
      System.out.println("");
      /**Base del rectangulo **/
      for (int i = 1; i < anchura; i++){
        System.out.print("*");
      }
    }
  }
}
