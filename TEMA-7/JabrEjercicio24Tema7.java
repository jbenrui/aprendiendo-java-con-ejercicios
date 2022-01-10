/**
 * Ejercicio: 24
 * Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 * 
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio24Tema7 {
  public static void main (String[] args) {
    int[] [] num = new int[4] [5]; //array bidimensional de la tabla
    int indiceFila; //determina la posición en la fila de uno de los números del array
    int indiceColumna; // determina la posición en la columna de uno de los números del array
    int[] sumFila = new int[4]; //este array guardará cada uno de los sumatorios de filas
    int[] sumColumna = new int[5]; //este array guardará cada uno de lo sumatorios de columnas
    int sumTotal = 0; //esta variable indica el sumatorio total del array

    System.out.println("Introduzca 20 números:");

    for (indiceFila = 0; indiceFila < 4; indiceFila++) {
      for (indiceColumna = 0; indiceColumna < 5; indiceColumna++) {
        System.out.print("> ");
        num[indiceFila] [indiceColumna]= Integer.parseInt(System.console().readLine()); //el programa nos pedirá que itroduzcamos los datos(de izquierda a derecha y de arriba a abajo)
        System.out.println(" ");

        sumFila[indiceFila] = sumFila[indiceFila] + num[indiceFila] [indiceColumna]; //mientras la fila en la que estemos introduciendo datos no cambie, la posición del array correspondiente irá aumentando
        sumColumna[indiceColumna] = sumColumna[indiceColumna] + num[indiceFila] [indiceColumna]; //cada vez que se vuelva a una columna la posición del array correspondiente irá aumentando
        sumTotal = sumTotal + num[indiceFila] [indiceColumna]; //la suma total irá incrementando cada vez que introducimos un dato
      }
    }

    System.out.println(" ");

    //mostramos los resultados
    System.out.println("┌───────────────────┬───────────────────┬───────────────────┬───────────────────┬───────────────────┬──────────────────────┐");

    for (indiceFila = 0; indiceFila < 4; indiceFila++) {
      for (indiceColumna = 0; indiceColumna < 5; indiceColumna++) {
        System.out.printf("%-1s        %3d        " ,"|" ,num[indiceFila] [indiceColumna]);
      }

      System.out.printf("%-1s %-15s%5d %-1s" ,"|" ,"Sum. fila " + indiceFila + " = " ,sumFila[indiceFila] ,"|");

      System.out.println(" ");

      System.out.println("├───────────────────┼───────────────────┼───────────────────┼───────────────────┼───────────────────┼──────────────────────┤");
    }

    for (indiceColumna = 0; indiceColumna < 5; indiceColumna++) {
      System.out.printf("%-1s %-11s%5d " ,"|" ,"Sum. C. " + indiceColumna + " = " ,sumColumna[indiceColumna]);
    }

    System.out.print("|");

    System.out.printf("     %-6s %5d     %-1s" ,"TOTAL:" ,sumTotal ,"|");

    System.out.println(" ");

    System.out.println("└───────────────────┴───────────────────┴───────────────────┴───────────────────┴───────────────────┴──────────────────────┘");
  }
}


