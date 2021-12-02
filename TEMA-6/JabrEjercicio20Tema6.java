/**
 * Ejercicio: 20
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 * pueda admitir. El ancho de la cuba no varía.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio20Tema6 {
  public static void main (String[] args) {
    System.out.println("El programa pinte por pantalla una cuba con cierta cantidad de agua.");
    System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
    int capacidad = Integer.parseInt(System.console().readLine()) ;
    int litrosContenidos=0;
    litrosContenidos=(int)(Math.random()*capacidad) +1;
    for (int i = 0; i < capacidad; i++){
      if (i < (capacidad - litrosContenidos)){
        System.out.println("*    *");
      }else{
        System.out.println("*====*");
      }
    }
    for (int i = 0; i < 6; i++){
      System.out.print("*");
    }
    System.out.print("\nLa cuba tiene una capacidad de " +capacidad+ " litros y contiene "+litrosContenidos+" litros de agua.");
  }
}
