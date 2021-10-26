/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
 * puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio19Tema4 {
    public static void main (String[] args) {
      
      System.out.println("El programa te dira la primera cifra del numero, se permiten numeros hasta 5 cifras");
      System.out.print("Introduce el valor del numero: ");
      int n = Integer.parseInt(System.console().readLine());
      int digito = 0;
      if (((n >= 0)&&(n < 10))||((n < 0)&&(n > -10))){
        digito = 1;
        System.out.printf("El numero es de un digito %d " ,digito);
      } else if (((n >= 10)&&(n < 100))||((n <= -10)&&(n > -100))){
        digito = 2;
        System.out.printf("El numero es de un digito %d " ,digito);
      } else if (((n >= 100)&&(n < 1000))||((n <= -100)&&(n > -1000))){
        digito = 3;
        System.out.printf("El numero es de un digito %d " ,digito);
      } else if (((n >= 1000)&&(n < 10000))||((n <= -1000)&&(n > -10000))){
        digito = 4;
        System.out.printf("El numero es de un digito %d " ,digito);
      } else if (((n >= 10000)&&(n < 100000))||((n <= -10000)&&(n > -100000))){
        digito = 5;
        System.out.printf("El numero es de un digito %d " ,digito);
      } else {
        System.out.print("La cifra introducida es mayor a 5 cifras.");
      }
    }
  }
