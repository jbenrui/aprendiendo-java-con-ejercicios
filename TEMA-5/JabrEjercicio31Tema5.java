/**
 * Ejercicio: 31
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos.El
 * programa pedirá la altura. El palo horizontal de la L tendrá una  longitud de 
 * la mitad (división entera entre 2) de la altura más uno.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio31Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduce la altura de la L por teclado: ");
    int altura = Integer.parseInt(System.console().readLine()) ;
    int base = 1;
    int contador = 0;
    while (base <=altura ){
      System.out.println("*");
      
      
    
      while (base == (altura-1)){
        while ( contador < (altura/2)+1){
          System.out.print("* ");
          contador++;
        }
      }
    base++;
    }
    
  }
}
