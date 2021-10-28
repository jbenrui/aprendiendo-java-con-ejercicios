/**
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 * hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 * Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 * por hecho que el usuario introducirá un día y hora correctos, anterior al vi
 * -ernes a las 15:00h.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio22Tema4 {
  public static void main (String[] args) {
    System.out.println("Di un dia de la semana y te dire cuantos minutos faltan para");
    System.out.print("que llegue el fin de semana: ");
    String nombreDelDia = (System.console().readLine() );;
    int diaNum = 0;
    switch (nombreDelDia.toLowerCase()){
      case "lunes":
      diaNum = 0;
      break;
      case "martes":
      diaNum = 1;

      break;
      case "miercoles":
      diaNum = 2;
      break;
      case "jueves":
      diaNum = 3;
      break;
      case "viernes":
      diaNum = 4;
      break;
      default:
        if (nombreDelDia.equals("sabado") || nombreDelDia.equals("domingo") ){
          System.out.print("Es un dia de Fin de semana");
        } else { 
          System.out.print("No existe ese dia");
        }
      }
    System.out.println("Primero introduce la hora y luego los minutos.");
    System.out.print("Dime la hora: ");
    int hora = Integer.parseInt(System.console().readLine() );
    System.out.print("Dime los minutos de esa hora entre 0 - 59 :");
    int minutos = Integer.parseInt(System.console().readLine() );
    
    int MinutosTotal = (4 * 24 * 60) + (15 * 60);
    int MinutosPasados = (diaNum *24 * 60) + (hora * 60) + minutos;

    System.out.println("Para que sea viernes queda "+ (MinutosTotal - MinutosPasados) + " minutos." );
  }
}

