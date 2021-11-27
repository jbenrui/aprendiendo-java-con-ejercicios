/**
 * Ejercicio: 55
 * ealiza un programa que sea capaz de desplazar todos los dígitos de un número
 * de izquierda a derecha una posición. El dígito de más a la derecha, pasaría a
 * dar la vuelta y se colocaría a la izquierda.Si el número tiene un solo dígito,
 * se queda igual.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio55Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número entero : ");
    long numero = Integer.parseInt(System.console().readLine()) ;
    int numerosComidos = 0;
    long resultado = 0;
    int digito = 0;
    int longitud= 0;
    long voltear = 0;
    int cifraCambio = 0;
    /**Volteo el numerp**/
    while (numero > 0){
      
      voltear = (voltear * 10) + (numero %10);
      numero /= 10;
      longitud++;
    }
    /**Recorro el numero**/
    for (int i = 0; i < longitud; i++){
      digito = (int)(voltear %10);
      if (i == longitud -1){
        cifraCambio=digito;
      }else{
        resultado = (resultado * 10) + digito;
      }
      
      voltear/=10;
    }
    System.out.println("Después de haber sido comido por el gusano numérico se queda en "+cifraCambio+""+resultado);
    
  }
}
