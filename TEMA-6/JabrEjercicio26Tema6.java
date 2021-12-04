/**
 * Ejercicio: 26
 * Realiza un programa que pinte una tableta de turrón con un bocado realizado de
 * forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se
 * da alrededor del turrón, obviamente no se puede dar un bocado por en medio
 * de la tableta.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio26Tema6 {
  public static void main (String[] args) {
    System.out.println("El programa pinta una tableta de turrón con un bocado realizado de forma aleatoria.");
    System.out.print("Introduzca la anchura de la tableta: ");
    int anchura = Integer.parseInt(System.console().readLine()) ;
    System.out.print("Introduzca la altura de la tableta ");
    int altura = Integer.parseInt(System.console().readLine()) ;
    int bocado=(int)(Math.random()* (anchura*2 + (altura -2)*2))+1;
    int posicion = 0;
    for (int i=0; i < altura; i++){
      for (int a=0; a < anchura; a++){
        boolean estaEnBorde = (i == 0)||(i == altura -1 ) || (a == 0) || (a == anchura -1);
        
        if ((posicion == bocado) && (estaEnBorde)){
          System.out.print(" ");
        }else {
          System.out.print("*");
        }
      
        if (estaEnBorde){
          posicion++;
        }
      }
      System.out.println("");
    }
  }
}
