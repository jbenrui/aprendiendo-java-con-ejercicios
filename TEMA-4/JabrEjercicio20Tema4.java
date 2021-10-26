/**
 * Realiza un programa que diga si un número entero positivo introducido por
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio20Tema4 {
    public static void main (String[] args) {
      
      System.out.println("El programa dira si un número entero positivo introducido por teclado es capicúa.");
      System.out.println("Se permiten números de hasta 5 cifras. Y como minimo de 2");
      System.out.print("Introduce un número: ");
      int n = Integer.parseInt(System.console().readLine());
      int digito = 0;
      int ultimaCifra;
      int primeraCifra;
      if (((n >= 10)&&(n < 100))||((n <= -10)&&(n > -100))){
        digito = 10;
        ultimaCifra =(n %10);
        primeraCifra =(n / digito);
        if (( primeraCifra == ultimaCifra )&&( ultimaCifra == primeraCifra )){
          System.out.printf("El %d es capicúa",n);
        }else {
          System.out.printf("El %d NO es capicúa",n);
        }
      } else if (((n >= 100)&&(n < 1000))||((n <= -100)&&(n > -1000))){
        digito = 100;
        ultimaCifra =(n %10);
        primeraCifra =(n / digito);
        if (( primeraCifra == ultimaCifra )&&( ultimaCifra == primeraCifra )){
          System.out.printf("El %d es capicúa",n);
        }else {
          System.out.printf("El %d NO es capicúa",n);
        }
        
      } else if (((n >= 1000)&&(n < 10000))||((n <= -1000)&&(n > -10000))){
        digito = 1000;
        ultimaCifra =(n %10);
        primeraCifra =(n / digito);
        if (( primeraCifra == ultimaCifra )&&( ultimaCifra == primeraCifra )){
          System.out.printf("El %d es capicúa",n);
        }else {
          System.out.printf("El %d NO es capicúa",n);
        }
      } else if (((n >= 10000)&&(n < 100000))||((n <= -10000)&&(n > -100000))){
        digito = 10000;
        ultimaCifra =(n %10);
        primeraCifra =(n / digito);
        if (( primeraCifra == ultimaCifra )&&( ultimaCifra == primeraCifra )){
          System.out.printf("El %d es capicúa",n);
        }else {
          System.out.printf("El %d NO es capicúa",n);
        }
        
      } else {
        System.out.println("La cifra introducida es mayor a 5 cifras o menor a 2 cifras.");
        System.out.print("Ejecuta de nuevo el programa e intruduzca un numero permitido.");
      }
    }
  }
