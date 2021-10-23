/**
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
 * los segundos que faltan para llegar a la medianoche.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio11Tema4 {
  public static void main (String[] args) {
    System.out.println("Primero introduce la hora y luego los minutos.");
    System.out.print("Dime la hora: ");
    int hora = Integer.parseInt(System.console().readLine() );
    System.out.print("Dime los minutos de esa hora entre 0 - 59 :");
    int minutos = Integer.parseInt(System.console().readLine() );
    
    int segundosPasados = (hora * 3600) + (minutos * 60);
    int segundosMedianoche = (24 * 3600) - segundosPasados;
    System.out.printf("Queda para que sea media noche %d",segundosMedianoche);
  }
}
