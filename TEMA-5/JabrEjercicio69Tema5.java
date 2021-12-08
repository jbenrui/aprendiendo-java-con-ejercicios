/**
 * Ejercicio: 69
 * Realiza un programa que pinte una pirámide maya.Por los lados,se trata de una
 * pirámide normal y corriente.Por el centro se van pintando líneas de asteriscos
 * de forma alterna (empezando por la superior): la primera se pinta, la segunda
 * no, la tercera sí, la cuarta no, etc. La terraza de la pirámide siempre tiene
 * 6 asteriscos, por tanto, las líneas centrales que se añaden a la pirámide nor
 * -mal tienen 4 asteriscos. El programa pedirá la altura. Se supone que el usua
 * -rio introducirá un número entero mayor o igual a 3;no es necesario comprobar
 * los datos de entrada.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio69Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduzca la altura de la piramide maya: ");
    int altura = Integer.parseInt(System.console().readLine()) ;
    int espacioDelante = altura -1;
    int base = 1;
    int espacioDentro = 2;
    int longitudLinea = 6;
    while (base <=altura ){
      /**Pinta los espacios de delante **/
      for (int a = 1; a <= espacioDelante; a++){
        System.out.print(" ");
        
      }
      
      for (int a = 0; a <= longitudLinea / 2; a++ ){
        if (base == 1){
          System.out.print("*");
          
        }else{
            System.out.print("*");
          }
        }
        if ((base % 2)==0){
          System.out.print("    ");
        }else{
          System.out.print("****");
        }
      for (int a = 0; a <= longitudLinea / 2; a++ ){
        if (base == 1){
          System.out.print("*");
          
        }else{
            System.out.print("*");
        }
      }
      
      System.out.println(" ");
    base++;
    espacioDelante--;
    longitudLinea+=2;
    }
  }
}

