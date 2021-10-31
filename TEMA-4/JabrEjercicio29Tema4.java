/**
 * Realiza un programa que calcule el precio de un desayuno. El programa
 * preguntará primero qué ha tomado el usuario de comer: palmera, donut o
 * pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
 * programa debe preguntar además si era con aceite o con tortilla; el primero
 * vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
 * café a 1’50 y 1’20 respectivamente.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio29Tema4 {
  public static void main (String[] args) {
    System.out.print("¿Que ha tomado para desayunar? (palmera,donut o pitufo): ");
    String comida = (System.console().readLine());
    String bebida = "";
    double preciobebida = 0 ;
    double preciodesayuno = 0 ;
    double total ;
    //Comida
    if (comida.equals("pitufo")){
      System.out.print("¿Con qué se ha tomado el pitufo?(aceite o tortilla): ");
      String tipoPitufo = (System.console().readLine());
      System.out.print("¿Que ha tomado de beber? (zumo o cafe): ");
      bebida = (System.console().readLine());
      if ((tipoPitufo.equals("aceite")) || (tipoPitufo.equals("Aceite"))){
        preciodesayuno = 1.20;
        System.out.printf("Pitufo con aceite: %.2f €\n",preciodesayuno);
      } else if ((tipoPitufo.equals("tortilla")) || (tipoPitufo.equals("Tortilla"))){
        preciodesayuno = 1.60;
        System.out.printf("Pitufo con tortilla: %.2f €\n",preciodesayuno);
      } 

    } else if (comida.equals("palmera")) {
      preciodesayuno = 1.40;
      System.out.print("¿Que ha tomado de beber? (zumo o cafe): ");
      bebida = (System.console().readLine());
      System.out.printf("Palmera:   %.2f €\n",preciodesayuno);
    } else if (comida.equals("donut")) {
      preciodesayuno = 1;
      System.out.print("¿Que ha tomado de beber? (zumo o cafe): ");
      bebida = (System.console().readLine());
      System.out.printf("Donut:   %.2f €\n",preciodesayuno);
    }
    //Bebida
    if ((bebida.equals("cafe"))||(bebida.equals("café"))){
      preciobebida = 1.20;
      
    } else if (bebida.equals("zumo")){
      preciobebida = 1.50;
    }
    total = preciobebida + preciodesayuno;
    System.out.printf("%s :  %.2f €\n",bebida,preciobebida);
    System.out.printf("Total desayuno:   %.2f €\n",total);
  }
}
