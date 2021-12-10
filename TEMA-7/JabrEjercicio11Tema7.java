/**
 * Ejercicio: 11
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array.A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9) utilizando para ello una tabla .  Seguidamente el programa pasará los 
 * primos a las primeras posiciones, desplazando el resto de números (los que no
 * son primos) de tal forma que no se pierda ninguno.Al final se debe mostrar el
 * array resultante.
 * 
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio11Tema7 {
  public static void main (String[] args) {
    
    System.out.print("El programa te muestra el los primos primeros.\n");
    int [] numero = new int[10];
    System.out.print("Introduce 10 numeros porfavor : \n");
    for (int i = 0; i < 10;i++){
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    /**Muestra el Indice**/
    for (int i = 0; i < 10;i++){
      System.out.printf("%3d|",i);
    }
    System.out.println("");
    /**Muestra el Valor del Array Inicial**/
    int indice = 0;
    while  (indice < 10){
      System.out.printf("%3d|",numero[indice]);
      indice++;
    }
    System.out.println("");
    System.out.println("");
    /**Muestra el Indice**/
    for (int i = 0; i < 10;i++){
      System.out.printf("%3d|",i);
    }
    System.out.println("");
    /**Muestra el Valor del Array Final de los Primos**/
    indice = 0; 
    boolean esPrimo; 
    do{
      esPrimo = true; 
      for (int i=2; i < numero[indice]; i++){
        if ((numero[indice] % i) == 0){
          esPrimo = false;
        }
      }
      if (esPrimo){
        System.out.printf("%3d|",numero[indice]);
      }
      indice++;
    }while (indice < 10);
    
    /**Muestra el Valor del Array Final de los NO Primos**/
    indice = 0; 
    do{
      esPrimo = true; 
      for (int i=2; i < numero[indice]; i++){
        if ((numero[indice] % i) == 0){
          esPrimo = false;
        }
      }
      if (!esPrimo){
        System.out.printf("%3d|",numero[indice]);
      }
      indice++;
    }while (indice < 10);
    
  }
}

