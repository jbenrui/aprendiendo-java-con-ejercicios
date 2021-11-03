/**
 * Realiza un programa que sea capaz de desplazar todos los dígitos de un número
 * de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría
 * a dar la vuelta y se colocaría a la derecha. Si el número tiene un solo dígito
 * , se queda igual.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicioExamenRepaso5 {
    public static void main (String[] args) {
      
      System.out.println("Se permiten números de hasta 8 cifras.");
      System.out.print("Introduce un número: ");
      int n = Integer.parseInt(System.console().readLine());
      
      // numeros de 1 cifra
      if ((n >= 0) && (n < 9)){
        System.out.println("La numero con el orden distinto es: "+n);
      // numeros de 2 cifra
      }else if ((n >= 10) && (n <= 99)){
        System.out.println("La numero con el orden distinto es: "+n %10 + n /10);
      // numeros de 3 cifra
      }else if ((n >= 100) && (n <= 999)){
        System.out.println("La numero con el orden distinto es: "+n %100 + n /100);
        // numeros de 4 cifra
      }else if ((n >= 1000) && (n <= 9999)){
        System.out.println("La numero con el orden distinto es: "+n %1000 + n /1000);
      // numeros de 5 cifra
      }else if ((n >= 10000) && (n <= 99999)){
        System.out.println("La numero con el orden distinto es: "+n %10000 + n /10000);
      // numeros de 6 cifra
      }else if ((n >= 100000) && (n <= 999999)){
        System.out.println("La numero con el orden distinto es: "+n %100000 + n /100000);
      // numeros de 7 cifra
      }else if ((n >= 1000000) && (n <= 9999999)){
        System.out.println("La numero con el orden distinto es: "+n %1000000 + n /1000000);
      // numeros de 8 cifra
      }else if ((n >= 10000000) && (n <= 99999999)){
        System.out.println("La numero con el orden distinto es: "+n %10000000 + n /10000000);
      }
  }
}
