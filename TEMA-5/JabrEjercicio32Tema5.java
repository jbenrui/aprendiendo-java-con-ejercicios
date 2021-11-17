/**
 * Ejercicio: 32
 * Escribe un programa que, dado un número entero positivo, diga cuáles son y
 * cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden
 * , de izquierda a derecha. Usa long en lugar de int donde sea necesario para 
 * admitir números largos.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio32Tema5 {
  public static void main (String[] args) {
    System.out.println("Escribe un programa que, dado un número entero positivo, diga cuáles son y cuánto suman los dígitos pares.");
    System.out.print("Introduce un numero por teclado: ");
    int numero = Integer.parseInt(System.console().readLine()) ;
    int esPar = 0 ;
    int voltear = 0;
    int sumaPares = 0;
    int numCifra = 0;
    System.out.print("Dígitos pares: ");
    while (numero > 0){
      numCifra = numero %10; /*saco la cifra del numero*/
      
      
      
      esPar = numCifra %2;
      if ( esPar == 0){
        sumaPares=numCifra + sumaPares ;  
        System.out.print(numCifra+ " ");
      }
      numero /= 10; /*voy dividiendo el numero para que vaya reduciendo el numero*/
    }
    System.out.print(" \n");
    System.out.print("Suma de los dígitos pares: "+sumaPares+ " ");
    
  }
}
