/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio1Tema4 {
  public static void main (String[] args) {
    System.out.println("no uses signos de acentuación porfavor.");
    System.out.print("Di un dia de la semana y te dire que toca a primera: ");
    String nombreDelDia = (System.console().readLine() );;
    switch (nombreDelDia.toLowerCase()){
      case "lunes":
      System.out.println("A primera toca Programacion");
      break;
      case "martes":
      System.out.println("A primera toca Programacion");
      break;
      case "miercoles":
      System.out.println("A primera toca Sistemas Informaticos");
      break;
      case "jueves":
      System.out.println("A primera toca Programacion");
      break;
      case "viernes":
      System.out.println("A primera toca Sistemas Informaticos");
      break;
      default:
        if (nombreDelDia.equals("sabado") || nombreDelDia.equals("domingo") ){
          System.out.print("Es un dia de Fin de semana");
        } else { 
          System.out.print("No existe ese dia");
        }
      }
  }
}


