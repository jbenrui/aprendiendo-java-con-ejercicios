/**
 * Ejercicio: 51
 * El gusano numérico se come los dígitos con forma de rosquilla, o sea , el 0 y 
 * el 8(todos los que encuentre).Realiza un programa que muestre un número antes
 * y después de haber sido comido por el gusano. Si el animalito no se ha comido
 * ningún dígito, el programa debe indicarlo.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio51Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número entero (mayor que cero): ");
    long numero = Integer.parseInt(System.console().readLine()) ;
    int numerosComidos = 0;
    long resultado = 0;
    int digito = 0;
    int longitud= 0;
    long voltear = 0;
    /**Volteo el numerp**/
    while (numero > 0){
      
      voltear = (voltear * 10) + (numero %10);
      numero /= 10;
      longitud++;
    }
    /**Recorro el numero**/
    for (int i = 0; i < longitud; i++){
      digito = (int)(voltear %10);
      if ((digito == 8)||(digito == 0)){
        numerosComidos++;
      }else{
        resultado = (resultado * 10) + digito;
      }
      
      voltear/=10;
    }
    if (numerosComidos == 0){
      System.out.println("El gusano numérico no se ha comido ningún dígito.");
    }else{
      System.out.println("Después de haber sido comido por el gusano numérico se queda en "+resultado);
    }
  }
}

