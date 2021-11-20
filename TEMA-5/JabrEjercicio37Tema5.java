/**
 * Ejercicio: 37
 * Realiza un conversor del sistema decimal al sistema de “palotes”.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio37Tema5 {
  public static void main (String[] args) {
    System.out.println("El programa nos un numero en un sistema de palotes (Ej: 12 = | - ||)");
    System.out.print("Introduce un numero por teclado: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine()) ;
    int numero = numeroIntroducido;
    int voltear = 0 ;
    System.out.print("El"+numero+" en decimal es el ");
    /**Sacar cifra del numero**/
    while (numero > 0){
      
      voltear = (voltear * 10) + (numero %10);
      numero/=10;
    }
    while (voltear > 0){
      int cifra = voltear % 10;
      switch (cifra){
        case 1:
          System.out.print(" | -");
        break;
        case 2:
          System.out.print(" || -");
        break;
        case 3:
          System.out.print(" ||| -");
        break;
        case 4:
          System.out.print(" |||| -");
        break;
        case 5:
          System.out.print(" ||||| -");
        break;
        case 6:
          System.out.print(" |||||| -");
        break;
        case 7:
          System.out.print(" ||||||| -");
        break;
        case 8:
          System.out.print(" |||||||| -");
        break;
        case 9:
          System.out.print(" ||||||||| -");
        break;
        default:
        System.out.print("  -");
        break;
        } 
      voltear /= 10;
    }
    System.out.print(" en el sistema palotes. ");
  }
}
