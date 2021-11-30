/**
 * Ejercicio: 59
 * Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe
 * introducir la altura. En esa altura va incluida la estrella y el tronco. Suponemos
 * que el usuario introduce una altura mayor o igual a 4.
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio59Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduce la altura del arbol por teclado: ");
    int altura = Integer.parseInt(System.console().readLine()) ;
    int base = 1;
    int numespacio = altura -1;
    int longitudLinea = 1;
    /**estrella superior**/
    for(int i = 0; i <= altura;i++){
      if (i <= (altura -2) ){
        System.out.print(" ");
      } else if (i < altura ){
        System.out.print("\033[33m*");
      }
    }
    System.out.println("");
    /**Cuerpo del arbol**/
    while (base <=(altura-2) ){
      
      for (int a = 1; a <= numespacio; a++){
        System.out.print(" ");
        
      }
      for (int a = 1; a <= longitudLinea; a++ ){
        if (base == (altura -2))
          System.out.print("\033[32m^");
        else{
          if ((a == 1) || (a == longitudLinea)){
            System.out.print("\033[32m^");
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
    /**Base del arbol (Tronco)**/
    for (int i = 0; i < altura; i++){
      if (i < altura -1){
        System.out.print(" ");
      }else{
        System.out.print("\033[33mY");
        System.out.println("");
      }
    }
    
  }
}
