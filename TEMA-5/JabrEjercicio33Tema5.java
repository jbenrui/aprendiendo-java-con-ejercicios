/**
 * Ejercicio: 33
 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. 
 * El programa pedirá la altura. Fíjate que el programa inserta un espacio y 
 * pinta dos asteriscos menos en la base para simular la curvatura de las esqu
 * -inas inferiores.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio33Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduce la altura de la U por teclado: ");
    int altura = Integer.parseInt(System.console().readLine()) ;
    /**Cuerpo de la U **/
    for (int a = 1; a < altura; a++ ){
      System.out.print("*");
      for (int contador = 1; contador <= (altura - 2);contador++){
        System.out.print(" ");
      } 
      System.out.println("*");
    }
    /**Base de la U **/
    System.out.print(" ");
    for (int contador = 1; contador <= (altura - 2);contador++){
      System.out.print("*");

    }
  }
}



