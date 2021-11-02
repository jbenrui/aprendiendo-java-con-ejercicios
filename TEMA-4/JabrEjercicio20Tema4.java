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
      int segundaCifra;
      int terceraCifra;
      int cuartaCifra;
      //numero de 2 cifras
      if (((n >= 10)&&(n < 100))||((n <= -10)&&(n > -100))){
        digito = 10;
        ultimaCifra =(n %10);
        primeraCifra =(n / digito);
        
        if (( primeraCifra == ultimaCifra )&&( ultimaCifra == primeraCifra )){
          System.out.printf("El %d es capicúa",n);
        }else {
          System.out.printf("El %d NO es capicúa",n);
        }
      //numero de 3 cifras
      } else if (((n >= 100)&&(n < 1000))||((n <= -100)&&(n > -1000))){
        ultimaCifra =(n %10);
        primeraCifra =(n / 100);
        if (( primeraCifra == ultimaCifra )&&( ultimaCifra == primeraCifra )){
          System.out.printf("El %d es capicúa",n);
        }else {
          System.out.printf("El %d NO es capicúa",n);
        }
        
      //numero de 4 cifras
      } else if (((n >= 1000)&&(n < 10000))||((n <= -1000)&&(n > -10000))){
        ultimaCifra = n % 10;
        primeraCifra = n / 1000;
        segundaCifra = (n / 100) % 10;  
        terceraCifra = (n /10) % 10;
        if (( primeraCifra == ultimaCifra )&&( segundaCifra == terceraCifra )){
          System.out.printf("El %d es capicúa",n);
        }else {
          System.out.printf("El %d NO es capicúa",n);
        }
        
      //numero de 5 cifras
      } else if (((n >= 10000)&&(n < 100000))||((n <= -10000)&&(n > -100000))){
        ultimaCifra =(n %10);
        primeraCifra =(n / 10000);
        segundaCifra = (n / 1000) % 10; 
        cuartaCifra = (n /10) % 10;
        if (( primeraCifra == ultimaCifra )&&( segundaCifra == cuartaCifra )){
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
