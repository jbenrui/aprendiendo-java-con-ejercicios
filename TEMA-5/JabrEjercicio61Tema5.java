/**
 * Ejercicio: 61
 * Escribe un programa que pinte por pantalla la letra V. El ancho del palo de
 * la V es siempre de 3 asteriscos. El usuario debe introducir la altura. La altura
 * mínima es de 3 pisos. Si el usuario introduce una altura menor, el programa
 * debe mostrar un mensaje de error.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio61Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduzca la altura de la V (mayor o igual a 3): ");
    int altura = Integer.parseInt(System.console().readLine()) ;
    int anchura = 3;
    int base = 0;
    int espaciosDelante = 0;
    
    if (altura < 3){
      System.out.print("La altura debe ser mayor o igual a 3. ");
    }else{
      while (altura  > 0){
        /**Espacios por delante**/
        for (int i = 0;i < espaciosDelante;i++){
          System.out.print(" ");
        }
        /**Primera parte de la V**/
        for (int i = 0; i < anchura;i++){
        System.out.print("*");
        }
        /**Espacios Dentras**/
        for (int i = 0;i < altura -1;i++){
          System.out.print(" ");
        }
        /**Espacios por delante**/
        for (int i = 0;i < altura -1;i++){
          System.out.print(" ");
        }
        /**Segunda parte de la V**/
        for (int i = 0; i < anchura;i++){
        System.out.print("*");
        }
        System.out.println("");
        altura--;
        espaciosDelante++;
      }
    }
  }
}
