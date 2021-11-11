/**
 * Ejercicio: 21
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el cómputo.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio21Tema5 {
  public static void main (String[] args) {
    int n = 1;
    int contador = -1;
    double impar = 0;
    double mediaImpar = 0;
    int mayorPar = 0;
    while (n >= 0){
      System.out.print("Introduce un número por teclado: ");
      n = Integer.parseInt(System.console().readLine()) ;
      contador++;
      
        if ( n >= 0){
          int numPar = n % 2;
          if (numPar != 0){
          impar = impar + n;
          
          mediaImpar++;
          }else if ( n > mayorPar){
            mayorPar = n;
          }
        } 
      
    }
    
    System.out.println("Se han introducido " + contador +" numeros.");
    mediaImpar= impar / mediaImpar;
    System.out.printf("La media impar es: %.2f \n ",mediaImpar);
    System.out.println("El mayor de los pares es: "+ mayorPar +" .");
  }
}
