/**
 * Ejercicio: 2
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja
 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diaman
 * -tes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas
 * son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que ser
 * -ía el 1). Para convertir un número en una cadena de caracteres podemos usar
 * String.valueOf(n).
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio02Tema6 {
  public static void main (String[] args) {
    System.out.println("El programa muestra al azar el nombre de una carta de la baraja francesa.");
    int numBaraja=(int)(Math.random()*4) +1;
    int numCarta=(int)(Math.random()*13) +1;
      switch (numBaraja){
        case 1:
        System.out.println("Palo de Picas");
        break;
        case 2:
        System.out.println("Palo de Corazones");
        break;
        case 3:
        System.out.println("Palo de Diamantes");
        break;
        case 4:
        System.out.println("Palo de Tréboles.");
        break;
      }
      System.out.print("Tienes un: ");
      switch (numCarta){
        case 1:
          System.out.println("AS");
        break;
        case 11:
          System.out.println("J");
        break;
        case 12:
          System.out.println("Q");
        break;
        case 13:
          System.out.println("K");
        break;
        default :
          System.out.println(numCarta);
        break;
      }
  }
}

