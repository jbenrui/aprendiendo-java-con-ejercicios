/**
 * Calcula la nota de un trimestre de la asignatura Programación. El programa
 * pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
 * Si la media de los dos controles da un número mayor o igual a 5, el alumno
 * está aprobado y se mostrará la media. En caso de que la media sea un número
 * menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
 * se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
 * ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
 * de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
 * la nota media anterior.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio21Tema4 {
  public static void main (String[] args) {
    
    System.out.print("Introduce la nota del primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la nota del segundo examen: ");
    double nota2= Double.parseDouble(System.console().readLine());
    if (nota1 <= 5){
      System.out.print("¿Cual ha sido el resultado de la recuperacion?(apto/no apto): ");
      String recuperacion =(System.console().readLine());
      if (recuperacion.equals("apto")){
        double media = ((5 + nota2) / 2);
        System.out.println("Tu nota media de programacion es: "+media);
      } else {
        double media = ((nota1 + nota2) / 2);
        System.out.println("Tu nota media de programacion es: "+media);
      }
    }
    if (nota2 <= 5){
      System.out.print("¿Cual ha sido el resultado de la recuperacion?(apto/no apto): ");
      String recuperacion =(System.console().readLine());
       if (recuperacion.equals("apto")){
        double media = ((nota1 + 5) / 2);
        System.out.println("Tu nota media de programacion es: "+media);
      } else {
        double media = ((nota1 + nota2) / 2);
        System.out.println("Tu nota media de programacion es: "+media);
      }
    }
  }
}
