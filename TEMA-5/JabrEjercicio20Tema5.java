/**
 * Ejercicio: 19
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
    int numEspacioFuera = altura -1;
    int numEspacioDentro = 0;
    int longitudLinea = 1;
    while (base <=altura ){
      
      for (int a = 1; a <= numEspacioFuera; a++){
        System.out.print(" ");
        
      }
      System.out.print(caracter);
      for (int a = 1; a <= numEspacioDentro; a++){
        System.out.print(" ");
        
      }
      
      if (altura > 1){
        System.out.print(caracter);
      }
      System.out.println(" ");
    base++;
    numEspacioFuera--;
    numEspacioDentro+=2;
    longitudLinea+=2;
    }
    for (int a = 1; a <= altura*2; a++ ){
        System.out.print(caracter);
      }
  }
}

