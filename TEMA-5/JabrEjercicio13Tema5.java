/**
 * Ejercicio: 13
 * Escribe un programa que lea una lista de diez números y determine cuántos son
 * positivos, y cuántos son negativos.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio13Tema5 {
  public static void main (String[] args) {
    int n = 0;
    int numNeg = 0;
    int numPos = 0;
    for (int lista = 0;lista < 10; lista ++){
      System.out.print("Introduce un número por teclado: ");
      n = Integer.parseInt(System.console().readLine()) ;
      if (n >= 0){
        numPos++;
      }else if (n <= 0){
        numNeg++;
      }
    }
    
    System.out.printf("Son positivos %d y Son negativos %d",numPos,numNeg);
  }
}


