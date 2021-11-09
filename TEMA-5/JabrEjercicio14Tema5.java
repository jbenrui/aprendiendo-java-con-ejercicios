/**
 * Ejercicio: 14
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
 * calcule la potencia.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio14Tema5 {
  public static void main (String[] args) {
    int potencia = 1;
    int i = 0;
    System.out.print("Introduce un número base por teclado: ");
      int base = Integer.parseInt(System.console().readLine()) ;
      
      System.out.print("Introduce un número exponente por teclado: ");
      int exponente = Integer.parseInt(System.console().readLine()) ;
    while( i < exponente){
      if (exponente == 0){
        potencia = 1;
        i++;
      }else {
        potencia = potencia * base;
        i++;
      }
    }
    System.out.printf("Un numero con la base %d y el exponente %d es = %d",base,exponente,potencia);
  }
}


