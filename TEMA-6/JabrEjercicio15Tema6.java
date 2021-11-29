/**
 * Ejercicio: 15
 * Realiza un generador de melodía con las siguientes condiciones:
 * 
 * a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol, la y si.
 * 
 * b) Una melodía está formada por un número aleatorio de notas mayor o igual a 4 , menor o 
 * igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
 * 
 * c) Cada grupo de 4 notas será un compás y estará separado del siguiente compás mediante la
 * barra vertical “|” (Alt + 1). El final de la melodía se marca con dos barras.
 * 
 * d) La última nota de la melodía debe coincidir con la primera.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio15Tema6 {
  public static void main (String[] args) {
    System.out.println("El programa genera una melodía ");
    System.out.println(" ");
    int compas=(int)(Math.random()* (7 - 4))+ 4;
    String primeraMelodia="";
    int grupo = (int)(Math.random()* (7 - 4))+ 4;
    int contadorMelodia = 0;
    int notas = 0;
    for (int i = 0; i < grupo -1; i++){
      System.out.print("| ");
      contadorMelodia++;
      for (int contador = 0; contador < compas; contador++){
        notas = (int)(Math.random()* 7)+1;
        switch (notas){
          case 1:
            System.out.print("do ");
            if (contadorMelodia <= 1){
              primeraMelodia= primeraMelodia + "do ";
            } 
          break; 
          case 2:
            System.out.print("re ");
            if (contadorMelodia <= 1){
              primeraMelodia= primeraMelodia + "re ";
            } 
          break; 
          case 3:
            System.out.print("mi ");
            if (contadorMelodia <= 1){
              primeraMelodia= primeraMelodia + "mi ";
            }
          break; 
          case 4:
            System.out.print("fa ");
            if (contadorMelodia <= 1){
              primeraMelodia= primeraMelodia + "fa ";
            }
          break;
          case 5:
            System.out.print("sol ");
            if (contadorMelodia <= 1){
            primeraMelodia= primeraMelodia + "sol ";
            }
          break;
          case 6:
            System.out.print("la ");
            if (contadorMelodia <= 1){
              primeraMelodia= primeraMelodia + "la ";
            }
          break;
          case 7:
            System.out.print("si ");
            if (contadorMelodia <= 1){
              primeraMelodia= primeraMelodia + "si ";
            }
          break;
          default:
        }
        
      }
    }System.out.print("| ");
    System.out.println(""+primeraMelodia+"||");
  }
}

