/**
 * Ejercicio: 68
 * Escribe un programa que pida un número por teclado y que luego lo “disloque” de
 * tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si es impar.
 * Usa long en lugar de int donde sea necesario para admitir números largos.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio68Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número: ");
    long numeroIntroducido = Integer.parseInt(System.console().readLine()) ;
    long numero = numeroIntroducido;
    long numResultado = 0;
    int digito = 0;
    int longitud= 0;
    long voltear = 0;
    /**Volteo el numero**/
    while (numero > 0){
      
      voltear = (voltear * 10) + (numero %10);
      numero /= 10;
      longitud++;
    }
    /**Recorro el numero**/
    for (int i = 0; i < longitud; i++){
      digito = (int)(voltear %10);
      if ((digito % 2)==0){
        digito++;
        numResultado=(numResultado * 10)+digito;
      }else{
        digito--;
        numResultado=(numResultado * 10)+digito;
      }
      
      voltear/=10;
    }
    System.out.println("Dislocando el "+numeroIntroducido+" sale el "+numResultado);
  }
}
