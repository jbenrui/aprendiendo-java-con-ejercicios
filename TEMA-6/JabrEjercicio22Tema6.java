/**
 * Ejercicio: 22
 * Realiza un programa que pinte por pantalla una serpiente con un “serpenteo” 
 * aleatorio. La cabeza se representará con el carácter @ y se debe colocar
 * exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
 * el cuerpo irá serpenteando de la siguiente manera: se generará de forma
 * aleatoria un valor entre tres posibles que hará que el siguiente carácter se
 * coloque una posición a la izquierda del anterior, alineado con el anterior o 
 * una posición a la derecha del anterior. La longitud de la serpiente se pedirá
 * por teclado y se supone que el usuario introducirá un dato correcto.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio22Tema6 {
  public static void main (String[] args) {
    System.out.println("El programa pinte por pantalla una serpiente con un “serpenteo” aleatorio.");
    System.out.print("Por favor, indique la longitud de la serpiente contando la cabeza: ");
    int longitud = Integer.parseInt(System.console().readLine()) ;
    int altura = longitud;
    int posicionCuerpo = 0;
    while (longitud > 0){
      if (longitud == altura ){
        System.out.println(" @ ");
      }
      posicionCuerpo=(int)(Math.random()*3) +1;
      if (longitud <= altura -1){
        switch (posicionCuerpo){
          case 1:
            System.out.println(" * ");
          break;
          case 2:
            System.out.println("*  ");
          break;
          case 3:
            System.out.println("  *");
          break;
        }
      }
      longitud--;
    }
  }
}
