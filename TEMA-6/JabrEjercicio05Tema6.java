/**
 * Ejercicio: 5
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio05Tema6 {
  public static void main (String[] args) {
    System.out.println("El programa muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos).");
    int contador = 50;
    int maximo = 0;
    int minimo = 199;
    int numAleatorio=0;
    int media = 0;
    for (int i = 1; i <= contador;i++){
      numAleatorio=(int)(Math.random()*100) +100;
      
      if (numAleatorio > maximo){
        maximo = numAleatorio;
      }
      if (numAleatorio < minimo){
        minimo = numAleatorio;
      }
      
      media = media + numAleatorio;
      
      System.out.print(numAleatorio+" ");
      
    }
    System.out.println("");
    System.out.println("El numero maximo es: "+maximo);
    System.out.println("El numero minimo es: "+minimo);
    media = media / 50;
    System.out.println("La media total de los numeros es: "+media);
  }
}
