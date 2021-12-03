/**
 * Ejercicio: 25
 * Escribe un programa que muestre por pantalla 100 números enteros separados
 * por un espacio. Los números deben estar generados de forma aleatoria en
 * un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
 * almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio25Tema6 {
  public static void main (String[] args) {
    System.out.println("El programa muestra 100 números enteros aleatorios entre 10 y 200 (ambos incluidos).");
    int contador = 100;
    int numAleatorio=0;
    boolean esPrimo;
    for (int i = 0; i <= contador ;i++){
      numAleatorio=(int)(Math.random()*(200 -10 ))+10;
      esPrimo = true;
      
      for (int aux=2; aux < numAleatorio; aux++){
        if ((numAleatorio % aux) == 0){
          esPrimo = false;
        }
      }
      if (!esPrimo){
        System.out.print("#"+numAleatorio+"# ");
      }else if ((numAleatorio % 5) == 0){
        System.out.print("["+numAleatorio+"] ");
      } else {
        System.out.print(numAleatorio+" ");
      }
    }
  }
}
