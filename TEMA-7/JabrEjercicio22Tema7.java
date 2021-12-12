/**
 * Ejercicio: 22
 * Realiza un programa que sea capaz de recolocar los números de un array de fuera
 * hacia adentro.En primer lugar,el programa pedirá al usuario el tamaño del array.
 * A continuación generará un array con ese tamaño con números enteros aleatorios 
 * entre 0 y 200 ambos incluidos. Seguidamente el programa irá colocando desde fuera
 * hacia adentro los números de tal forma que el primero se coloca en la primera pos
 * -ición, el segundo en la última, el tercero en la segunda, el cuarto en la penúlt
 * -ima, el quinto en la tercera, en sexto en la antepenúltima, etc. Se debe mostrar
 * por pantalla tanto el array original como el array resultado.
 * 
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio22Tema7 {
  public static void main (String[] args) {
    System.out.print("Introduzca el tamaño del array: ");
    int tamaño = Integer.parseInt(System.console().readLine());
    System.out.println("Array original: ");
    System.out.print("Indice ");
    int [] numero = new int[tamaño];
     for (int i = 0; i < tamaño;i++){
      System.out.printf(" %3d|",i);
    }
    System.out.println(" ");
    System.out.print("Valor  ");
    for (int i = 0; i < tamaño;i++){
      numero[i] = (int)(Math.random()*201);
      System.out.printf(" %3d|",numero[i]);
    }
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Array resultado: ");
    System.out.print("Indice ");
     for (int i = 0; i < tamaño;i++){
      System.out.printf(" %3d|",i);
    }
    System.out.println(" ");
    System.out.print("Valor  ");
    System.out.printf(" %3d|",numero[0]);
    for (int indice = tamaño-1; indice > 0 ;indice--){
      System.out.printf(" %3d|",numero[indice]);
    }
  }
}


