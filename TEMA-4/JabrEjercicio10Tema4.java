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
    
    System.out.print("Dime tu mes de nacimiento ");
    String mesNacimiento = (System.console().readLine() );;
    System.out.println("no uses signos de acentuación porfavor.");
    switch (mesNacimiento.toLowerCase()){
      case "enero":
      System.out.print("Dime tu dia de nacimiento ");
      int DiaNacimiento = Integer.parseInt(System.console().readLine() );;
      if (DiaNacimiento <= 20 ) && (DiaNacimiento >= 1);{
        System.out.println("Capricornio");
      } else if (DiaNacimiento <= 30 ) && (DiaNacimiento >= 21);{
        System.out.println("Acuario");
      } else{
        System.out.println("No existe ese dia");
      }
      break;
      
      case "febrero":
      System.out.println("A primera toca Programacion");
      break;
      case "marzo":
      System.out.println("A primera toca Sistemas Informaticos");
      break;
      case "abril":
      System.out.println("A primera toca Programacion");
      break;
      case "mayo":
      System.out.println("A primera toca Sistemas Informaticos");
      break;
      default:
          System.out.print("No existe ese mes");
        }
      }
  }
}

