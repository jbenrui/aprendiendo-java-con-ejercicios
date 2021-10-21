/**
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio8Tema4 {
  public static void main (String[] args) {
    
    System.out.print("Introduce la nota del primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la nota del segundo examen: ");
    double nota2= Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la nota del tercer examen: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    double media = ((nota1 + nota2 + nota3) / 3);
    System.out.printf("Tu nota de media es: %.1f \n" ,media);
    
    if ( media >= 9 ) {
      System.out.print("Tienes un Sobresaliente en el boletín");
    } else if ( media >= 7 ) {
      System.out.print("Tienes un Notable en el boletín");
    } else if ( media >= 6 ) {
      System.out.print("Tienes un Bien en el boletín");
    } else if ( media == 5 ) {
      System.out.print("Tienes un Suficiente en el boletín");
    } else {
      System.out.print("Tienes un Insuficiente en el boletín");
    }
  }
}
