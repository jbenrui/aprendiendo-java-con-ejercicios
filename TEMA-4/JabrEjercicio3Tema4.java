/**
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
 * nombre del día de la semana
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio3Tema4 {
  public static void main (String[] args) {
    System.out.print("Di un dia un numero entero del 1 al 7 y te dire que dia es: ");
    int numeroDelDia = Integer.parseInt(System.console().readLine() );;
    switch (numeroDelDia){
      case 1:
      System.out.println("lunes");
      break;
      case 2:
      System.out.println("martes");
      break;
      case 3:
      System.out.println("miercoles");
      break;
      case 4:
      System.out.println("jueves");
      break;
      case 5:
      System.out.println("viernes");
      break;
      case 6:
      System.out.println("sabado");
      break;
      case 7:
      System.out.println("domingo");
      break;
      default:
          System.out.print("No existe ese dia");
    }
  }
}
