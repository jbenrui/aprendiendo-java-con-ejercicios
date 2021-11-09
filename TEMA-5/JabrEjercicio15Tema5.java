/**
 * Ejercicio: 15
 * Escribe un programa que dados dos números, uno real (base) y un entero positi
 * -vo (exponente), saque por pantalla todas las potencias con base el numero da
 * -do y exponentes entre uno y el exponente introducido . No se  deben utilizar
 * funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5, se deb
 * -erán mostrar 2¹ 2² 2 ³ 2⁴ 2⁵.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio15Tema5 {
  public static void main (String[] args) {
    int potencia = 1;
    int i = 1;
    System.out.print("Introduce un número base por teclado: ");
      int base = Integer.parseInt(System.console().readLine()) ;
      
      System.out.print("Introduce un número exponente por teclado: ");
      int exponente = Integer.parseInt(System.console().readLine()) ;
    while((i -1) <= exponente){
      if (exponente == 0){
        System.out.printf("Un numero con la base %d y el exponente %d es = %d\n",base,0,1);
        i++;
      } else {
        potencia = potencia * base;
        System.out.printf("Un numero con la base %d y el exponente %d es = %d\n",base,i,potencia);
        i++;
      }
    }
  }
}
