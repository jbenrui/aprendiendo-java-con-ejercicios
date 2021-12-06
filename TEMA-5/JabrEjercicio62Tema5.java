/**
 * Ejercicio: 62
 * Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8 y el 9.
 * Los números de la mala suerte son el resto: el 0, el 1, el 2, el 4, el 5 y el 6. Un
 * número es afortunado si contiene más números de la suerte que de la mala suerte. Re
 * -aliza un programa que diga si un número introducido por el usuario es afortunado o
 * no.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio62Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número: ");
    long NumeroIntroducido = Integer.parseInt(System.console().readLine()) ;
    long numero = NumeroIntroducido;
    int contadorSuerte = 0;
    int contadorMalaSuerte=0;
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
      if ((((digito == 3)||(digito == 7))||(digito == 8))||(digito == 9)){
        contadorSuerte++;
      }else{
        contadorMalaSuerte++;
      }
      
      voltear/=10;
    }
    if (contadorSuerte > contadorMalaSuerte){
      System.out.println("El " +NumeroIntroducido+ " es un número afortunado.");
    }else{
      System.out.println("El " +NumeroIntroducido+ " NO es un número afortunado.");
    }
    
  }
}

