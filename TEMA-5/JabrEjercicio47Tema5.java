/**
 * Ejercicio: 46
 * Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han
 * encargado realizar un programa que pinte un 8 por pantalla usando la letra
 * M. Se pide al usuario la altura, que debe ser un número entero impar mayor
 * o igual que 5. Si el número introducido no es correcto, el programa deberá
 * mostrar un mensaje de error. A continuación se muestran algunos ejemplos.
 * La anchura de la figura siempre será de 6 caracteres.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio47Tema5 {
  public static void main (String[] args) {
    System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
    int altura = Integer.parseInt(System.console().readLine()) ;
    int anchura = 6;
    int vuelta = 2;
    if (altura < 5) {
      System.out.println("La altura introducida no es correcta");
    }else if ((altura %2) == 0){
      System.out.println("La altura introducida no es correcta");
    }else{
      /**Cabeza del ocho **/
        for (int i = 0; i < anchura -1; i++){
          System.out.print("M");
        }
      while ( vuelta > 0){
        /**Cuerpo del ocho **/
        for (int i = 2; i < altura; i++ ){
          System.out.println("");
          System.out.print("M");
          for (int aux = 2; aux <= (anchura - 2);aux++){
            System.out.print(" ");
          } 
          System.out.print("M");
        }
        System.out.println("");
        /**Base del ocho **/
        for (int i = 1; i < anchura; i++){
          System.out.print("M");
        }
        vuelta--;
      }
    }
  }
}

