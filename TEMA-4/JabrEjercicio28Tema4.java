/**
 * Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
 * su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
 * incorrecta, el programa deberá mostrar un mensaje de error.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio28Tema4 {
  public static void main (String[] args) {
    System.out.println("El juego de piedra, papel, tijeras.");
    
    System.out.print("Turno del primer jugador: (introduce piedra, papel,tijeras): ");
    String user1 = (System.console().readLine() );
    System.out.print("Turno del segundo jugador: (introduce piedra, papel,tijeras): ");
    String user2 = (System.console().readLine() );
    
    if ((user1.equals("papel")) && (user2.equals("piedra"))){
      System.out.print("Gana el jugador 1");
    } else if ((user1.equals("papel")) && (user2.equals("tijeras"))){
      System.out.print("Gana el jugador 2");
    } else if ((user1.equals("tijeras")) && (user2.equals("papel"))){
      System.out.print("Gana el jugador 1");
    } else if ((user1.equals("tijeras")) && (user2.equals("piedra"))){
      System.out.print("Gana el jugador 2");
    } else if ((user1.equals("piedra")) && (user2.equals("papel"))){
      System.out.print("Gana el jugador 2");
    } else if ((user1.equals("piedra")) && (user2.equals("tijeras"))){
      System.out.print("Gana el jugador 1");
    } else if ((user1.equals("piedra")) && (user2.equals("piedra"))){
      System.out.print("Empate");
    } else if ((user1.equals("tijera")) && (user2.equals("tijera"))){
      System.out.print("Empate");
    } else if ((user1.equals("papel")) && (user2.equals("papel"))){
      System.out.print("Empate");
    } else {
      System.out.print("Uno de los jugadores ha introducido una opcion incorrecta.");
    }
  }
}

