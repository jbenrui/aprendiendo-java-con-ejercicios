/**
 * Ejercicio: 66
 * La Guardia Civil de Tráfico nos ha encargado un programa que pinte una señal
 * para desviar el tráfico hacia la derecha. La señal es una doble flecha con el
 * vértice apuntando a la derecha. Se pide al usuario la altura de la figura, que
 * debe ser un número impar mayor o igual que 3.La distancia entre cada flecha de 
 * asteriscos es siempre de 4 espacios.Si la altura introducida por el usuario no
 * es un número impar mayor o igual que 3, el programa debe mostrar un mensaje de
 * error.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio66Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduzca la altura de la A (un número mayor o igual a 3): ");
    int altura = Integer.parseInt(System.console().readLine()) ;
    if (((altura %2)==0)||(altura < 3)){
      System.out.print("La altura no es correcta, debe ser un número impar mayor o igual que 3.");
    }else{
    int espacioDelante = 0;
    int base = 1;
    int longitudLinea = 1;
      while (base <=altura ){

        for (int a = 0; a < espacioDelante; a++){
          System.out.print(" ");
        }
        System.out.print("*");
        for (int i = 0; i < 4 ; i++){
          System.out.print(" ");
        }
        System.out.print("*");
        System.out.println(" ");
      base++;
        if (base > altura/2+1){
          espacioDelante--;
        }else{
          espacioDelante++;
        }
      longitudLinea+=2;
      }
    }
  }
}
