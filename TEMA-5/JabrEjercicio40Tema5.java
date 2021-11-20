/**
 * Ejercicio: 40
 * Realiza un programa que pinte por pantalla un rombo hueco hecho con asteriscos.
 * El programa debe pedir la altura. Se debe comprobar que la altura sea un número
 * impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio40Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduce la altura de la X por teclado: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine()) ;
    int altura =alturaIntroducida /2 +1;
    int espaciosDelante=alturaIntroducida /2 -1;
    int espaciosDentro= 2;
    /**Mensaje de error**/
    if ((alturaIntroducida <= 3) || ((alturaIntroducida %2)== 0)){
      System.out.print("La altura de la X debe ser un numero Impar mayor a 3.");
    }
    System.out.println("");
    /** Parte superior del Rombo**/
    if (altura == alturaIntroducida /2 +1){
      for (int i = 1; i <= altura-1; i++){
        System.out.print(" ");
      }
      System.out.print("*");
    }
    System.out.println();
    altura =1;
    /** Cuerpo Superior del Rombo**/
    while (altura < alturaIntroducida /2 + 1){
      
      for (int i=1 ; i <= espaciosDelante;i++ ){
        System.out.print(" ");
      }
      System.out.print("*");
      for (int i = 1; i < espaciosDentro; i++ ){
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println("");
      
      
      
      altura++;
      espaciosDelante--;
      espaciosDentro+=2;
      
    }
    /** Cuerpo Inferior del Rombo**/
    altura =2;
    espaciosDelante=1;
    espaciosDentro= alturaIntroducida - 3;
    
    while (altura < alturaIntroducida /2 +1){
      
      for (int i=1; i <= espaciosDelante;i++ ){
        System.out.print(" ");
      }
      System.out.print("*");
      for (int i = 1; i < espaciosDentro; i++ ){
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println("");
      
      altura++;
      espaciosDelante++;
      espaciosDentro-=2;
      
    }
    /** Parte Inferior del Rombo**/
    if (altura == alturaIntroducida /2 +1){
      for (int i = 1; i <= altura-1; i++){
        System.out.print(" ");
      }
      System.out.print("*");
    }
  }
}
