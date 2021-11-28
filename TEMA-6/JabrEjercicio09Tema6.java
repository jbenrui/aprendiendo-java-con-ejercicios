/**
 * Ejercicio: 9
 * Realiza un programa que vaya generando números aleatorios pares entre 0
 * y 100 y que no termine de generar números hasta que no saque el 24. El
 * programa deberá decir al final cuántos números se han generado.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio09Tema6 {
  public static void main (String[] args) {
    System.out.println("Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no termine de generar números hasta que no saque el 24");
    System.out.println("");
    int numAleatorio=0;
    int contador = 0;
    while (numAleatorio != 24){
      numAleatorio=(int)(Math.random()*100);
      if ((numAleatorio %2)== 0){
        System.out.print(numAleatorio+" ");
        contador++;
      }
    }
    System.out.println("");
    System.out.print("Se han generado "+contador+" numeros");
  }
}
