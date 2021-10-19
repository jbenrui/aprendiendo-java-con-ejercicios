/**
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio12Tema3 {
  public static void main (String[] args) {
    System.out.print("Introduce la nota del primer examen: ");
    double primerExamen = Double.parseDouble(System.console().readLine() );;
    System.out.print("Introduce la nota media que quieres sacar: ");
    double notaMedia = Double.parseDouble(System.console().readLine() );;
    
    
    double primerExamenPonderado = primerExamen * 0.4;
    double ponderacionSegundoExamen = 0.6;
    
    double segundoExamen = ((notaMedia - primerExamenPonderado ) / ponderacionSegundoExamen);
    System.out.printf("Para tener un %.2f en el trimestre necesitas sacar un %.2f en el segundo examen" ,notaMedia, segundoExamen);
  }
}
