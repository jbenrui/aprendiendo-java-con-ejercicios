/**
 * Ejercicio: 25
 * Modifica el programa anterior de tal forma que los números que se introducen
 * en el array se generen de forma aleatoria (valores entre 100 y 999).
 * 
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio25Tema7 {
  public static void main (String[] args) {
    int[] [] num = new int[4][5]; 
    int fila;
    int columna;
    int[] sumFila = new int[4];
    int[] sumColumna = new int[5]; 
    int sumTotal = 0; 
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        num[fila] [columna]= ((int)(Math.random() * 900) + 100);

        sumFila[fila] = sumFila[fila] + num[fila] [columna]; //mientras la fila en la que estemos introduciendo datos no cambie, la posición del array correspondiente irá aumentando
        sumColumna[columna] = sumColumna[columna] + num[fila] [columna]; //cada vez que se vuelva a una columna la posición del array correspondiente irá aumentando
        sumTotal = sumTotal + num[fila] [columna]; //la suma total irá incrementando cada vez que introducimos un dato
      }
    }

    System.out.println(" ");

    //mostramos los resultados
    System.out.println("┌───────────────────┬───────────────────┬───────────────────┬───────────────────┬───────────────────┬──────────────────────┐");

    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        System.out.printf("%-1s        %3d        " ,"|" ,num[fila] [columna]);
      }

      System.out.printf("%-1s %-15s%5d %-1s" ,"|" ,"Sum. fila " + fila + " = " ,sumFila[fila] ,"|");

      System.out.println(" ");

      System.out.println("├───────────────────┼───────────────────┼───────────────────┼───────────────────┼───────────────────┼──────────────────────┤");
    }

    for (columna = 0; columna < 5; columna++) {
      System.out.printf("%-1s %-11s%5d " ,"|" ,"Sum. C. " + columna + " = " ,sumColumna[columna]);
    }

    System.out.print("|");

    System.out.printf("     %-6s %5d     %-1s" ,"TOTAL:" ,sumTotal ,"|");

    System.out.println(" ");

    System.out.println("└───────────────────┴───────────────────┴───────────────────┴───────────────────┴───────────────────┴──────────────────────┘");
  }
}
