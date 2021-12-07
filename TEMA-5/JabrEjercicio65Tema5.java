/**
 * Ejercicio: 65
 * Escribe un programa que pinte por pantalla la letra A. El usuario debe introducir 
 * la altura total y la fila en la que debe aparecer el palito horizontal (contando
 * desde el vértice). La altura mínima es de 3 pisos. La fila donde va el palito
 * horizontal debe ser mayor que 1 y menor que la altura total. Si el usuario
 * introduce algún dato incorrecto, el programa debe mostrar un mensaje de error.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio65Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduzca la altura de la A (un número mayor o igual a 3): ");
    int altura = Integer.parseInt(System.console().readLine()) ;
    if (altura < 3){
      System.out.print("La altura introducida no es correcta.");
    }else{
      System.out.print("Introduzca la fila del palito horizontal (entre 2 y "+(altura -1)+"): ");
      int centro = Integer.parseInt(System.console().readLine()) ;
      if (altura == centro){
        System.out.print("La fila introducida no es correcta.");
      }else{
        int espacioDelante = altura -1;
        int base = 1;
        int longitudLinea = 1;
        while (base <=altura ){
          /**Pinta los espacios de delante de la A**/
          for (int a = 1; a <= espacioDelante; a++){
            System.out.print(" ");
            
          }
          for (int a = 1; a <= longitudLinea; a++ ){
            if (base == centro)//Cuando la base sea igual al centro, Pinta el palito horizontal.
              System.out.print("*");
            else{
              if ((a == 1) || (a == longitudLinea)){//Mientras a sea 1 o longitud pintara el asterisco
                System.out.print("*");
              } else {
                System.out.print(" ");//Pinta los espacios del centro
              }
            }
            
          }
          System.out.println(" ");
        base++;
        espacioDelante--;
        longitudLinea+=2;
        }
      }
    }
  }
}

