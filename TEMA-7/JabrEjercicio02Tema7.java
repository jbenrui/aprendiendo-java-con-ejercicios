/**
 * Ejercicio: 2
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
 * elementos según la tabla que se muestra a continuación. Muestra el contenido
 * de todos los elementos del array. ¿Qué sucede con los valores de los elementos
 * que no han sido inicializados?
 * 
 * R/ Ocurre que los valores no inicializados aparecen como un espacio y muestra
 * un error, que dice literalmente Fuera de Rango.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio02Tema7 {
  public static void main (String[] args) {
    
    char [] simbolo = new char[10];
    simbolo [0] = 'a';
    simbolo [1] = 'x';
    simbolo [4] = '@';
    simbolo [6] = ' ';
    simbolo [7] = '+';
    simbolo [8] = 'Q';
    System.out.print("Los valores del array n son los siguientes: \n");
    for (int i = 0; i <= 10;i++){
      System.out.print(simbolo[i]+"\n");

      
    }
  }
}
