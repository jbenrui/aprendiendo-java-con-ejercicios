/**
 * Ejercicio: 1
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio01Tema6 {
  public static void main (String[] args) {
    System.out.println("El programa muestra la tirada de 3 dados y nos dira la suma total.");
    int contador = 3;
    int sumaTiradas=0;
    for (int i = 1; i <= contador;i++){
      int tiradas=(int)(Math.random()*7);
      sumaTiradas= sumaTiradas +tiradas;
      System.out.println("Tirada " + i +"º : "+ tiradas);
      
    }
    System.out.println("La suma total de las tiradas es "+sumaTiradas+".");
    
  }
}
