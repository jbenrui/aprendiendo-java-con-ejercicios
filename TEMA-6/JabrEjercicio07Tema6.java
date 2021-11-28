/**
 * Ejercicio: 7
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince. A continuación se muestra un impre
 * -so real. Cada columna es una apuesta.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio07Tema6 {
  public static void main (String[] args) {
    System.out.println("muestre tres apuestas de la quiniela en tres columnas para los 14 partidos y el pleno al quince.");
    int numAleatorio=0;
    for (int partidos = 1; partidos <= 15;partidos++){  
      System.out.printf("%3d. ",partidos);
      if ( partidos <= 14){
        for (int apuesta = 0; apuesta < 3; apuesta++){
          numAleatorio=(int)(Math.random()*3);
          switch (numAleatorio){
            case 0:
              System.out.print("| X |");
            break;
            case 1:
              System.out.print("|1  |");
            break;
            case 2:
              System.out.print("|  2|");
            break;
            default:
          }
        }
        System.out.println("");
      }else{
        System.out.printf("PLENO AL %3d. -Local...",partidos);
        numAleatorio=(int)(Math.random()*5);
        switch (numAleatorio){
          case 0:
            System.out.print("0");
          break;
          case 1:
            System.out.print("1");
          break;
            case 2:
            System.out.print("2");
          break;
          default:
            System.out.print("M");
          break;
        }
        System.out.print("  Visitante...");
        numAleatorio=(int)(Math.random()*5);
        switch (numAleatorio){
          case 0:
            System.out.print("0");
          break;
          case 1:
            System.out.print("1");
          break;
          case 2:
            System.out.print("2");
          break;
          default:
            System.out.print("M");
          break;
        }
      }
    }
  }
}

