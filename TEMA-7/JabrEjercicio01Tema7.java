/**
 * Ejercicio: 1
 * Define un array de 12 números enteros con nombre num y asigna los valores según
 * la tabla que se muestra a continuación. Muestra el contenido de todos los eleme
 * -ntos del array.¿Qué sucede con los valores de los elementos que no han sido in
 * -icializados?
 * 
 * R/ Ocurre que los valores no inicializados salen como 0 y muestra un error, que 
 * dice literalmente Fuera de Rango.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio01Tema7 {
  public static void main (String[] args) {
    
    int [] num = new int[12];
    num [0] = 39;
    num [1] = -2;
    num [4] = 0;
    num [8] = 5;
    num [9] = 120;
    System.out.print("Los valores del array n son los siguientes: \n");
    for (int i = 0; i <= 12;i++){
      System.out.print(num[i]+"\n");

      
    }
  }
}
