/**
 * Ejercicio: 7
 * Realiza el control de acceso a una caja fuerte. La combinación será un número
 * de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no acerta
 * -mos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” y  si 
 * acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio07Tema5 {
  public static void main (String[] args) {
    int oportunidad = 0;
    while (oportunidad < 4){
      System.out.print("Introduce el pin de la caja fuerte: ");
      int pin = Integer.parseInt(System.console().readLine()) ;
      if (pin == 4567){
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        oportunidad+=5;
      }else {
        System.out.println("Lo siento, esa no es la combinación");
        oportunidad++;
      }
      
    }
  }
}

