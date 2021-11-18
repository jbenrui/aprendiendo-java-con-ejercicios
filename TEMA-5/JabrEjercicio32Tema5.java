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
    /** Le doy la vuelta al numero para que coja las cifras de izq a derecha.**/
    numero = (numero * 10)+1;
    while (numero > 0){
      
      voltear = (voltear * 10) + (numero %10);
      numero /= 10;
    }
    /**saco la cifra del numero**/
    while (voltear > 0){
      numCifra = voltear %10; 
      
      
      
      esPar = numCifra %2;
      if ( esPar == 0){
        sumaPares=numCifra + sumaPares ;  
        System.out.print(numCifra+ " ");
      }
      voltear /= 10; //voy dividiendo el numero para que vaya reduciendo el numero.
    }
    System.out.print(" \n");
    System.out.print("Suma de los dígitos pares: "+sumaPares+ " ");
    
  }
}
