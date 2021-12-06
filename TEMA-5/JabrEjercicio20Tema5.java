/**
 * Ejercicio: 20
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe pe
 * -dir por teclado.  El carácter con el que se pinta la pirámide también se debe
 * pedir por teclado.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio20Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduce la altura de la piramide por teclado: ");
    int altura = Integer.parseInt(System.console().readLine()) ;
    System.out.print("Introduce el caracter por teclado: ");
    String caracter = System.console().readLine();
    int base = 1;
    int numespacio = altura -1;
    int longitudLinea = 1;
    while (base <=altura ){
      
      for (int a = 1; a <= numespacio; a++){
        System.out.print(" ");
        
      }
      for (int a = 1; a <= longitudLinea; a++ ){
        if (base == altura)
          System.out.print(caracter);
        else{
          if ((a == 1) || (a == longitudLinea)){
            System.out.print(caracter);
          } else {
            System.out.print(" ");
          }
        }
        
      }
      System.out.println(" ");
    base++;
    numespacio--;
    longitudLinea+=2;
    }
  }
}

