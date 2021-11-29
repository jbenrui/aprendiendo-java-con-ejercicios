/**
 * Ejercicio: 11
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes,el número de
 * bienes, etc.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio11Tema6 {
  public static void main (String[] args) {
    System.out.println("Muestra 20 notas generadas al azar");
    System.out.println("");
    int numAleatorio=0;
    int contador = 0;
    while (contador < 20){
      numAleatorio=(int)(Math.random()*10)+1;
      System.out.printf("%3d. ",numAleatorio);
      switch (numAleatorio){
        case 5:
          System.out.println("Suficiente");
        break; 
        case 6:
          System.out.println("Bien");
        break; 
        case 7:
          System.out.println("Notable");
        break; 
        case 8:
          System.out.println("Notable");
        break;
        case 9:
          System.out.println("Sobresaliente");
        break;
        case 10:
          System.out.println("Sobresaliente");
        break;
        default:
          System.out.println("Suspenso");
        break;
      }
      System.out.println("");
      contador++;
    }
  }
}
