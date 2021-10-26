/**
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio18Tema4 {
    public static void main (String[] args) {
      
      System.out.println("El programa te dira la primera cifra del numero, se permiten numeros hasta 5 cifras");
      System.out.print("Introduce el valor del numero: ");
      int n = Integer.parseInt(System.console().readLine());
      
      if ((n >= 0)&&(n < 10)){
        System.out.printf("La primera cifra es %d " ,n);
      } else if ((n >= 10)&&(n < 100)){
        int primeraCifra = (n / 10);
        System.out.printf("La primera cifra es %d " ,primeraCifra);
      }else if ((n >= 100)&&(n < 1000)){
        int primeraCifra = (n / 100);
        System.out.printf("La primera cifra es %d " ,primeraCifra);
      } else if ((n >= 1000)&&(n < 10000)){
        int primeraCifra = (n / 1000);
        System.out.printf("La primera cifra es %d " ,primeraCifra);
      }else if ((n >= 10000)&&(n < 100000)){
        int primeraCifra = (n / 10000);
        System.out.printf("La primera cifra es %d " ,primeraCifra);
      } else {
        System.out.print("La cifra introducida es mayor a 5 cifras.");
      }
    }
  }
