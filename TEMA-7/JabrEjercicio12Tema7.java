/**
 * Ejercicio: 12
 * Realiza un programa que pida 10 números por teclado y que los almacene en un 
 * array . A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
 * “inicial” y “final” . Se debe comprobar que inicial es menor que final y que 
 * ambos números están entre 0 y 9 . El programa deberá colocar el número de la 
 * posición inicial en la posición final , rotando el resto de números para que 
 * no se pierda ninguno. Al final se debe mostrar el array resultante.
 * 
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio12Tema7 {
  public static void main (String[] args) {
    
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
    /**Pido la posicion Inicial y la Posicion Final**/
    System.out.print("Introduzca la posicion Inicial : \n");
    int inicial = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la posicion Final : \n");
    int finall = Integer.parseInt(System.console().readLine());
    
    /**Muestra el Indice**/
    for (int i = 0; i < 10;i++){
      System.out.printf("%3d|",i);
    }
    System.out.println("");
    
    
    /**Muestra el Valor del Array Final **/
    indice = 0; 
    System.out.printf("%3d|",numero[9]);
    do{
      indice++;
      if (inicial == indice){
        System.out.printf("%3d|",numero[finall]);
      }else if (finall == indice){
        System.out.printf("%3d|",numero[inicial]);
      }else {
        System.out.printf("%3d|",numero[(indice-1)]);
      }
      
    }while (indice < 9);
    
  }
}

