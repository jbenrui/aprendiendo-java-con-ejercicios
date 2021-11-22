/**
 * Ejercicio: 3
 * gual que el ejercicio anterior pero con la baraja española. Se utilizará la 
 * baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio03Tema6 {
  public static void main (String[] args) {
    System.out.println("El programa muestra al azar el nombre de una carta de la baraja francesa.");
    int numBaraja=(int)(Math.random()*4) +1;
    int numCarta=(int)(Math.random()*13) +1;
      switch (numBaraja){
        case 1:
        System.out.println("Palo de Espada");
        break;
        case 2:
        System.out.println("Palo de Oro");
        break;
        case 3:
        System.out.println("Palo de Copa");
        break;
        case 4:
        System.out.println("Palo de Basto.");
        break;
      }
      System.out.print("Tienes un: ");
      switch (numCarta){
        case 1:
          System.out.println("AS");
        break;
        case 11:
          System.out.println("sota");
        break;
        case 12:
          System.out.println("caballo");
        break;
        case 13:
          System.out.println("rey");
        break;
        default :
          System.out.println(numCarta);
        break;
      }
  }
}

