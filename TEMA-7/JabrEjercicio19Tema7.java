/**
 * Ejercicio: 19
 * Realiza un programa que sea capaz de insertar un número en una posición
 * concreta de un array. En primer lugar, el programa generará un array de 12
 * números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
 * debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
 * el programa preguntará por el número que se quiere insertar y por la posición
 * donde será insertado. Los números del array se desplazan a la derecha para de
 * jar sitio al nuevo. El último número (el que se encuentra en la posición 11)
 * siempre se perderá.
 * 
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio19Tema7 {
  public static void main (String[] args) {
    
    int [] numero = new int[12];
    int [] auxiliar = new int[12];
    for (int i = 0; i < 12;i++){
      numero[i] = (int)(Math.random()*201);
      auxiliar[i]=numero[i];
    }
    int indice = 0;
    /**Muestra el Valor del Array Original**/
    System.out.print("Índice");
    for (indice = 0; indice < 12; indice++){
      System.out.printf("%3d " ,indice);
    }
    
    System.out.println(" ");
    System.out.print("Valor ");
    for (indice = 0; indice < 12; indice++) {
      System.out.printf("%3d " ,numero[indice]);
    }
    
    System.out.println(" ");
    System.out.println("");
    
    /**Si es menor a 100 lo guardare en un el array menor, si es mayor a 100 lo guardare en el array mayor.**/
    System.out.print("Introduzca el número que quiere insertar: ");
    int numIntroducido = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la posición donde lo quiere insertar (0 – 11): ");
    int posicion = Integer.parseInt(System.console().readLine());


    
    System.out.println("Array resultado:");


    System.out.print("Índice");
    
    for (indice = 0; indice < 12; indice++) {
      System.out.printf("%3d ",indice);
    }
    System.out.println(" ");
    System.out.print("Valor ");
    
    for (indice = 0; indice < 12; indice++) {
      if (indice == posicion){
        numero[indice]=numIntroducido;
        System.out.printf("%3d " ,numero[posicion]);
      }else if (indice > posicion ){
        System.out.printf("%3d " ,auxiliar[indice-1]);
      }else{
        System.out.printf("%3d " ,numero[indice]);
      }
      
    }
    System.out.println(" ");

  }
}
