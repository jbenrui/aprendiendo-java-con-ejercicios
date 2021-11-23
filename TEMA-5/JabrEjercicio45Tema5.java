/**
 * Ejercicio: 45
 * Escribe un programa que cambie un dígito dentro de un número dando la
 * posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
 * empezando por el 1. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos. Suponemos que el usuario introduce
 * correctamente los datos.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio45Tema5 {
  public static void main (String[] args) {
    System.out.println("Escribe un programa que permita partir un número introducido por teclado en dos partes");
    System.out.print("Introduce un numero entero positivo por teclado: ");
    long numero1 = Integer.parseInt(System.console().readLine()) ;
    System.out.print("Introduce un numero entero positivo para partir el numero: ");
    int posicion = Integer.parseInt(System.console().readLine()) ;
    System.out.print("Introduce un numero entero positivo para sustituir en la posicion: ");
    int sustituirNum = Integer.parseInt(System.console().readLine()) ;
    long voltear = 0;
    int longitud = 0;
    int digito = 0;
    int numPart1 = 0;
    int numResultante = 0;
    
    /**Volteo el primer numero**/
    while (numero1 > 0){
      
      voltear = (voltear * 10) + (numero1 %10);
      numero1 /= 10;
      longitud++;
    }
    /**Recorro el numero**/
    for (int a = 0; a < longitud; a++){
      digito = (int)(voltear %10);
      
    /**Cuando llega a la posicion sustituyo el numero**/
      if (a < posicion -1){
        numPart1 = (numPart1 * 10) +digito;
      }else if (a == posicion-1){
        digito=sustituirNum;
        numResultante = digito + (numResultante * 10);
      }else if (a > posicion -1){
        numResultante = digito + (numResultante * 10);
      }
      voltear/=10;
    }
    System.out.println("El número resultante es "+ numPart1 +""+ numResultante +".");
  }
}

