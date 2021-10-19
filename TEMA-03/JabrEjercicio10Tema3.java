/**
 * Realiza un conversor de Mb a Kb.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio10Tema3 {
  public static void main (String[] args) {
    System.out.print("Introduce los Mb que quieres conventir en Kb: ");
    double valorMb = Double.parseDouble(System.console().readLine() );;
    double valorKb = 1000;
    
    int Kb = (int)(valorMb * valorKb);
    System.out.printf(" %.2f Mb en Kb son: %d Kb" ,valorMb ,Kb);
	}
}
