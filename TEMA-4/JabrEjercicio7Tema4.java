/**
 * Realiza un programa que calcule la media de tres notas.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio7Tema4 {
  public static void main (String[] args) {
    
    System.out.print("Introduce la nota del primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la nota del segundo examen: ");
    double nota2= Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la nota del tercer examen: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    double media = ((nota1 + nota2 + nota3) / 3);
    System.out.printf("Tu nota de media es: %.2f" ,media);
  }
}
