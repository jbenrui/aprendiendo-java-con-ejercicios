/**
 * Ejercicio: 26
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma
 * total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
 * que el ordenador se queda “pensando” antes de mostrar los números.
 * 
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio26Tema7 {
  public static void main (String[] args)
    throws InterruptedException {

      int[] [] num = new int[4][5]; 
      int fila;
      int columna;
      int[] sumFila = new int[4];
      int[] sumColumna = new int[5]; 
      int sumTotal = 0; 
      for (fila = 0; fila < 4; fila++) {
        for (columna = 0; columna < 5; columna++) {
          num[fila] [columna]= (int)(Math.random()*999)+100;
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
        for (int i = 0; i < 1; i++) {
          Thread.sleep(1000);
        }
        System.out.printf("%-1s %-15s%5d %-1s" ,"|" ,"Sum. fila " + fila + " = " ,sumFila[fila] ,"|");
        

        System.out.println(" ");

        System.out.println("├───────────────────┼───────────────────┼───────────────────┼───────────────────┼───────────────────┼──────────────────────┤");
      }

      for (columna = 0; columna < 5; columna++) {
        for (int i = 0; i < 1; i++) {
          Thread.sleep(1000);
        }
        System.out.printf("%-1s %-11s%5d " ,"|" ,"Sum. C. " + columna + " = " ,sumColumna[columna]);
      }

      System.out.print("|");
        for (int i = 0; i < 1; i++) {
          Thread.sleep(1000);
        }
      System.out.printf("     %-6s %5d     %-1s" ,"TOTAL:" ,sumTotal ,"|");

      System.out.println(" ");

      System.out.println("└───────────────────┴───────────────────┴───────────────────┴───────────────────┴───────────────────┴──────────────────────┘");
    
  }
}
