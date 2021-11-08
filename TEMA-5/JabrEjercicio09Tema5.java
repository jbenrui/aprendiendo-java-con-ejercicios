/**
 * Ejercicio: 9
 * Realiza un programa que nos diga cuántos dígitos tiene  un número introducido
 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente,con
 * la salvedad de que el anterior estaba limitado a números de 5 dígitos como má
 * -ximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles ;  de
 * esta manera, la única limitación en el número de dígitos la establece el tipo
 * de dato que se utilice (int o long).
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio09Tema5 {
  public static void main (String[] args) {
    int digito =1, n, num;
    System.out.print("Introduce un número por teclado: ");
    num = Integer.parseInt(System.console().readLine()) ;
    n = num;
    while (n > 10){
      n = n / 10; //Divide el numero entre 10 y guarda el resultado en n y vuelve a dividirlo.
      digito ++;
      
    }
    System.out.printf("El número %d tiene %d digitos.\n",num,digito);
  }
}

