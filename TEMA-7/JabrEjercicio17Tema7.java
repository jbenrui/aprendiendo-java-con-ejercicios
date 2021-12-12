/**
 * Ejercicio: 17
 * Escribe un programa que muestre por pantalla un array de 10 números enteros
 * generados al azar entre 0 y 100. A continuación, el programa debe pedir un
 * número al usuario. Se debe comprobar que el número introducido por teclado
 * se encuentra dentro del array, en caso contrario se mostrará un mensaje por
 * pantalla y se volverá a pedir un número; así hasta que el usuario introduzca 
 * uno correctamente. A continuación, el programa rotará el array hacia la derecha
 * las veces que haga falta hasta que el número introducido quede situado en la
 * posición 0 del array. Por último, se mostrará el array rotado por pantalla.
 * 
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio17Tema7 {
  public static void main (String[] args) {
    
    int [] numero = new int[10];

    for (int i = 0; i < 10;i++){
      numero[i] = (int)(Math.random()*100);
    }
    
    int indice = 0;
    /**Muestra el Valor del Array Original**/
    System.out.println("┌──────┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐");
    System.out.print("|Índice|");
    for (indice = 0; indice < 10; indice++){
      System.out.printf(" %d %-1s" ,indice ,"|");
    }
    
    System.out.println(" ");
    System.out.println("├──────┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┤");
    System.out.print("|Número|");
    for (indice = 0; indice < 10; indice++) {
      numero[indice] = ((int)(Math.random() * 101));
      System.out.printf("%3d%-1s" ,numero[indice] ,"|");
    }
    
    System.out.println(" ");
    System.out.println("└──────┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘");
    System.out.println(" ");
    System.out.println("");
    
    /**El usuario introduce el numero de un array**/
    System.out.print("Introduce un numero del array \n");
    int numeroIntroducido = 0;
    int poscionNumIntroducido=0;
    boolean noCoincide =true;
    while (noCoincide){
      noCoincide=true;
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      for (int i = 0; i < 10; i++){
        if (numero[i] == numeroIntroducido){
          noCoincide=false;
          poscionNumIntroducido=i;
        }
      }
    }
    
    int [] resultado = new int[10];
    resultado[0]=numeroIntroducido;
    int posicionDelante = (10 - poscionNumIntroducido );
    /**números posteriores al número introducido **/
    for (indice = 1 ; indice < posicionDelante; indice++){
      resultado[indice]=numero[poscionNumIntroducido + indice];
    }
    /**números anteriores al número introducido **/
    for (indice = posicionDelante ; indice < (posicionDelante + poscionNumIntroducido); indice++){
      resultado[indice]=numero[indice - posicionDelante];
    }
    if (!noCoincide){
      System.out.println("Array resultado:");

      System.out.println("┌──────┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐");
      System.out.print("|Índice|");
      
      for (indice = 0; indice < 10; indice++) {
        System.out.printf(" %d %-1s" ,indice ,"|");
      }
      System.out.println(" ");
      System.out.println("├──────┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┤");
      System.out.print("|Número|");
      
      for (indice = 0; indice < 10; indice++) {
        System.out.printf("%3d%-1s" ,resultado[indice] ,"|");
      }
      System.out.println(" ");
      System.out.println("└──────┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘");
    }
  }
}




