/**
 * Ejercicio: 34
 * Escribe un programa que pida dos números por teclado y que luego mezcle en 
 * dos números diferentes los dígitos pares y los impares. Se van comprobando
 * los dígitos de la siguiente manera: primer dígito del primer número,primer
 * dígito del segundo número, segundo dígito del primer número,segundo dígito 
 * del segundo número, tercer dígito del primer número… Para facilitar el eje
 * -rcicio,podemos suponer que el usuario introducirá dos números de la misma 
 * longitud y que siempre habrá al menos un dígito par y uno impar.Usa long en 
 * lugar de int donde sea necesario para admitir números largos.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio34Tema5 {
  public static void main (String[] args) {
    System.out.println("El programa pide 2 y luego los mezcle en dos números diferentes los dígitos pares y los impares.");
    System.out.print("Introduce un numero entero positivo por teclado: ");
    long numero1 = Integer.parseInt(System.console().readLine()) ;
    System.out.print("Introduce otro numero entero positivo por teclado: ");
    long numero2 = Integer.parseInt(System.console().readLine()) ;
    
    long voltear = 0;
    long voltearNum2 = 0;
    int longitud = 0;
    if ( numero1 == 0){
      longitud=1;
      }
    
    /**Volteo el primer numero**/
    while (numero1 > 0){
      
      voltear = (voltear * 10) + (numero1 %10);
      numero1 /= 10;
      longitud++;
    }

    /** Volteo el segundo numero**/
    while (numero2 > 0){
      voltearNum2 = (voltearNum2 * 10) + (numero2 %10);
      numero2 /= 10;
    }
    long numeroPares = 0;
    long numeroImpares = 0;
    int digito = 0;
    /**recorro los numeros volteados para sacar ambos resultados**/
    for (int a = 0; a < longitud; a++){
      digito = (int)(voltear %10);
      
      if ((digito % 2)==0){
        numeroPares = digito + (numeroPares * 10);
      }else{
        numeroImpares = digito + (numeroImpares * 10);
      }
      
      digito = (int)(voltearNum2 %10);
      
      if ((digito % 2)== 0){
        numeroPares = digito + (numeroPares * 10);
      }else {
        numeroImpares = digito + (numeroImpares * 10);
      }
      voltear = voltear /10;
      voltearNum2 = voltearNum2 /10;
    }
    System.out.println("El número formado por los dígitos pares es: " + numeroPares);
    System.out.println("El número formado por los dígitos impares es: " + numeroImpares);
  
  }
}
