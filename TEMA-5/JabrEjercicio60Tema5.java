/**
 * Ejercicio: 60
 * Escribe un programa que pinte por pantalla un par de calcetines, de los que
 * se ponen al lado del árbol de Navidad para que Papá Noel deje sus regalos.
 * El usuario debe introducir la altura. Suponemos que el usuario introduce una
 * altura mayor o igual a 4. Observa que la talla de los calcetines y la distancia
 * que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio60Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduzca la altura de la figura (mayor o igual a 4): ");
    int altura = Integer.parseInt(System.console().readLine()) ;
    int anchura = 6;
    int base = 0;
    int espaciosNum = 2;
    while (altura  > 0){
      for (int i = 0; i < anchura ; i++){
        if (i < anchura / 2){
          System.out.print("*");
        }else if (( i > (anchura / 2) -1) && ( altura > 2)){
          System.out.print(" ");
        }else if (altura <= 2){
          System.out.print("*");
        }
      }
      for (int espacio = 0; espacio < espaciosNum; espacio++){
          System.out.print(" ");
      }
      for (int i = 0; i < anchura ; i++){
        if (i < anchura / 2){
          System.out.print("*");
        }else if (( i > (anchura / 2) -1) && ( altura > 2)){
          System.out.print(" ");
        }else if (altura <= 2){
          System.out.print("*");
        }
      }
      System.out.println("");
      altura--;
      
    }
  }
}
