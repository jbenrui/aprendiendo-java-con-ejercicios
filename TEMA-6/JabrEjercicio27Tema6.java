/**
 * Ejercicio: 27
 * Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
 * jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
 * introduce una opción incorrecta,el programa deberá mostrar un mensaje de error.

 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio27Tema6 {
  public static void main (String[] args) {
    System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
    String turnoUsuario = (System.console().readLine()) ;
    System.out.println("");
    String turnoMaquina = "";
    if ( (turnoUsuario.equals("piedra")) || (turnoUsuario.equals("papel")) || (turnoUsuario.equals("tijera"))){
      int manoMaquina = (int)(Math.random()* 3)+1;
      switch (manoMaquina){
        case 1:
          turnoMaquina="piedra";
        break;
        case 2:
          turnoMaquina="papel";
        break;
        case 3:
          turnoMaquina="tijera";
        break;
        default:
      }
      System.out.println("Turno del ordenador: "+turnoMaquina);
      System.out.println("");
      if (turnoUsuario.equals(turnoMaquina)){
        System.out.print("Empate");
      }else if ((turnoUsuario.equals("piedra")) && (turnoMaquina.equals("papel"))){
        System.out.print("Gana el Ordenador");
      }else if ((turnoUsuario.equals("papel")) && (turnoMaquina.equals("piedra"))){
        System.out.print("Gana el Usuario");
      }else if ((turnoUsuario.equals("piedra")) && (turnoMaquina.equals("tijera"))){
        System.out.print("Gana el Usuario");
      }else if ((turnoUsuario.equals("tijera")) && (turnoMaquina.equals("piedra"))){
        System.out.print("Gana el Ordenador");
      }else if ((turnoUsuario.equals("tijera")) && (turnoMaquina.equals("papel"))){
        System.out.print("Gana el Usuario");
      }else if ((turnoUsuario.equals("papel")) && (turnoMaquina.equals("tijera"))){
        System.out.print("Gana el Ordenador");
      }
    }else{
      System.out.print("La opcion introducida no es valida.");
    }
    
  }
}
