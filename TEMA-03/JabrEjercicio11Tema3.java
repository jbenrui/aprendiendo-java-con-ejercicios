/**
 * Realiza un conversor de Kb a Mb.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio11Tema3 {
  public static void main (String[] args) {
    System.out.print("Introduce los Kb que quieres conventir en Mb: ");
    int valorKb = Integer.parseInt(System.console().readLine() );;
    double valorMb = 0.001;
    
    double Mb =((double)valorKb * valorMb);
    System.out.printf(" %d Kb en Mb son: %.1f Mb" ,valorKb ,Mb);
  }
}

