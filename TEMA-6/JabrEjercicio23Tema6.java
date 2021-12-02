/**
 * Ejercicio: 23
 * Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
 * Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio23Tema6 {
  public static void main (String[] args) {
    System.out.println("El programa que genera de forma aleatoria la tirada de cinco dados.");
    System.out.println(" ");
    String dadoCara="";
    int tirada=0;
    for (int dado = 5; dado > 0; dado--){
      tirada=(int)(Math.random()*6) +1;
      switch (tirada){
        case 1:
          System.out.print("As ");
        break; 
        case 2:
          System.out.print("K ");
        break; 
        case 3:
          System.out.print("Q ");
        break; 
        case 4:
          System.out.print("J ");

        break; 
        case 5:
          System.out.print("7 ");
        break; 
        case 6:
          System.out.print("8 ");
        break; 
        default:
      }
    }
  }
}
