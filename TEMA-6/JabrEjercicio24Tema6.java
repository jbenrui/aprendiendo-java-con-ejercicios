/**
 * Ejercicio: 23
 * Escribe un programa que, dado un número introducido por teclado, elija al azar
 * uno de sus dígitos.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio24Tema6 {
  public static void main (String[] args) {
    System.out.println("El programa dado un número introducido por teclado, elije al azar uno de sus dígitos.");
    System.out.print("Introduce un numero entero positivo por teclado: ");
    long numero = Integer.parseInt(System.console().readLine()) ;
    int posicion = 0;
    long voltear = 0;
    int longitud = 0;
    int digito = 0;
    
    /**Volteo el primer numero**/
    while (numero > 0){
      
      voltear = (voltear * 10) + (numero %10);
      numero /= 10;
      longitud++;
    }
    posicion = (int)(Math.random()*(longitud +1))+1;
    /**Recorro el numero**/
    for (int i = 0; i < longitud; i++){
      digito = (int)(voltear %10);
      
    /**Cuando llega a la posicion muestra el digito**/
      if (posicion -1 == i){
        System.out.println(digito);
      }
      voltear/=10;
    }
  }
}
