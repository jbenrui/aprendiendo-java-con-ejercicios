/**
 * Ejercicio: 33
 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. 
 * El programa pedirá la altura. Fíjate que el programa inserta un espacio y 
 * pinta dos asteriscos menos en la base para simular la curvatura de las esqu
 * -inas inferiores.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio33Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduce la altura de la U por teclado: ");
    int altura = Integer.parseInt(System.console().readLine()) ;
    int base = 1;
    int contador = 0;
    int numespacio = altura -1;
    while (base <=altura ){
      System.out.println("*");
      
      
    
      while (base == (altura-1)){
        while ( contador < (altura/2)+1){
          
          System.out.print(" *");
          
          contador++;
        }
        
      }
    
    base++;
    
    }
    base =1;
    while (base <=altura ){
        for (int a = 1; a <= numespacio; a++){
          System.out.print(" ");
        
        }
        System.out.print("*");
        numespacio--;
      base++;
    }
  }
}
