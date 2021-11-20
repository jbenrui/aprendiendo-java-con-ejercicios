/**
 * Ejercicio: 35
 * Realiza un programa que pinte una X hecha de asteriscos. El programa debe
 * pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
 * igual a 3, en caso contrario se debe mostrar un mensaje de error.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio35Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduce la altura de la X por teclado: ");
    int altura = Integer.parseInt(System.console().readLine()) ;
    int base = 1;
    int cabeza = altura -2;
    int numespacioDentro = altura -2;
    int numespacioFuera = 0;
    int longitudLinea = 1;
    while (base < altura/2 +1 ){
      
      for (int a = 1; a <= numespacioFuera; a++){
        System.out.print(" ");
        
      }
      System.out.print("*");
      for (int a = 1; a < numespacioDentro; a++){
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
      base++;
      numespacioDentro-=2;
      numespacioFuera++;
    }
    /**Base de la X**/
    numespacioDentro = 1;
    numespacioFuera = altura / 2;
    base = 1;

    while (base <=(altura/2)+1 ){
      
      for (int a = 1; a <= numespacioFuera; a++){
        System.out.print(" ");
        
      }
      System.out.print("*");
      for (int a = 1; a < numespacioDentro; a++){
        System.out.print(" ");
      }
      System.out.print(" ");
      if (base > 1){
        System.out.print("*");
      }
    System.out.println();
    base++;
    numespacioFuera--;
    longitudLinea+=2;
    }
  }
}




