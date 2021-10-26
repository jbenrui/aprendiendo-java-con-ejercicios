/**
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio17Tema4 {
    public static void main (String[] args) {
      
      System.out.println("El programa te dira la ultima cifra del numero");
      System.out.print("Introduce el valor del numero: ");
      int n = Integer.parseInt(System.console().readLine());
      
      int ultimaCifra = (n % 10);
        System.out.printf("La ultima cifra es %d " ,ultimaCifra);
    }
  }
  
