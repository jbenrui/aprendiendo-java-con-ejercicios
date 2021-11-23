/**
 * Ejercicio: 43
 * Escribe un programa que permita partir un número introducido por teclado en
 * dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
 * el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
 * el número introducido tiene dos dígitos como mínimo y la posición en la que
 * se parte el número está entre 2 y la longitud del número. No se permite en
 * este ejercicio el uso de funciones de manejo de String (por ej. para extraer
 * subcadenas dentro de una cadena).
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio43Tema5 {
  public static void main (String[] args) {
    System.out.println("Escribe un programa que permita partir un número introducido por teclado en dos partes");
    System.out.print("Introduce un numero entero positivo por teclado: ");
    int numero1 = Integer.parseInt(System.console().readLine()) ;
    System.out.print("Introduce un numero entero positivo para partir el numero: ");
    int posicion = Integer.parseInt(System.console().readLine()) ;
    int voltear = 0;
    int longitud = 0;
    int digito = 0;
    int contador = 0;
    int numPrimeraParte = 0;
    int numeroSegundaParte = 0;
    if ( numero1 == 0){
      contador=1;
      }
    
    /**Volteo el primer numero**/
    while (numero1 > 0){
      
      voltear = (voltear * 10) + (numero1 %10);
      numero1 /= 10;
      longitud++;
    }
    
    /**Partir numero**/
    for (int a = 0; a < longitud; a++){
      digito = (int)(voltear %10);
      
      /**Partir la primera parte del numero**/
      if (a < posicion -1){
        numPrimeraParte = digito + (numPrimeraParte * 10);
        /**Partir la segunda parte del numero**/
      }else if (a >= posicion -1){
        numeroSegundaParte = digito + (numeroSegundaParte * 10);
      }
      voltear/=10;
    }
    System.out.println("Los números partidos son el "+ numPrimeraParte +" y el "+ numeroSegundaParte +".");
  }
}

