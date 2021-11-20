/**
 * Ejercicio: 32
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
    int numero1 = Integer.parseInt(System.console().readLine()) ;
    System.out.print("Introduce otro numero entero positivo por teclado: ");
    int numero2 = Integer.parseInt(System.console().readLine()) ;
    int esPar = 0 ;
    int esParNum2 = 0 ;
    int esImpar = 0;
    int esImparNum2 = 0;
    int voltear = 0;
    int voltearNum2 = 0;
    int sumaPares = 0;
    int numCifra = 0;
    int numCifra2 = 0;
    System.out.print("Dígitos pares: ");
    /**saco la cifra de los numeros pares **/
    while (numero1 > 0){
      
      voltear = (voltear * 10) + (numero1 %10);
      numero1 /= 10;
    }
    while (voltear > 0){
      numCifra = voltear %10; 
      esPar = numCifra %2;
      if ( esPar == 0){
        System.out.print(numCifra+"");
      }
      if (esPar != 0){
        esImpar= numCifra + (esImpar*10);
        }
      
      voltear /= 10; //voy dividiendo el numero para que vaya reduciendo el numero.
    }
    while (numero2 > 0){
      voltearNum2 = (voltearNum2 * 10) + (numero2 %10);
      numero2 /= 10;
    }
    while (voltearNum2 > 0){
      numCifra2 = voltearNum2 %10; 
      esParNum2 = numCifra2 %2;
      if ( esParNum2 == 0){
        System.out.print(numCifra2);
      }
      if (esParNum2 != 0){
        esImparNum2= numCifra2 + (esImparNum2*10);
        
        }
      voltearNum2 /= 10; //voy dividiendo el numero para que vaya reduciendo el numero.
    }
    System.out.println(" ");
    System.out.print("Digitos Impares: "+ esImpar+""+ esImparNum2);
  }
}
