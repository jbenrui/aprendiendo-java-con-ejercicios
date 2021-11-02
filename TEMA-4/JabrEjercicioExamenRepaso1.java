/**
 * Escribe un programa que pida un número por teclado y que luego muestre la versión “complementaria”
 * de ese número de tal forma que cada dígito se cambia por su complementario (9 menos el dígito). Admite
 * numeros hasta 3 cifras
 * 
 */
public class JabrEjercicioExamenRepaso1 {
  
  public static void main (String[] args) {
    System.out.print("Introduce un numero entero: ");
    int n = Integer.parseInt(System.console().readLine());
    int complementario = 0;
    //numero de cifra 1
    if ((n >=0) && (n < 10)){
      complementario = 9 - n;
      System.out.printf("El complemtario de %d , es %d ",n, complementario);
    } else if ((n >= 10)&&(n < 100)){
      complementario = 100 - n;
      System.out.printf("El complemtario de %d , es %d ",n, complementario);
    //numero de 3 cifras
    } else if ((n >= 100)&&(n <= 1000)){
      complementario = 1000 - n;
      System.out.printf("El complemtario de %d , es %d ",n, complementario);
    }
        
  }
}

