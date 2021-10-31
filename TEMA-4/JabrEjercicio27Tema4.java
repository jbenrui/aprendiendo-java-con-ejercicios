/**
 * Una pastelería nos ha pedido realizar un programa que haga presupuestos de
 * tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
 * manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
 * 16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
 * además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
 * segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
 * nombre; la nata suma 2.50 y la escritura del nombre 2.75.

 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio27Tema4 {
  public static void main (String[] args) {
    System.out.print("Elija un sabor (manzana,fresa o chocolate): ");
    String saborTarta = (System.console().readLine());
    
    double precioNata = 0;
    double precioNombre = 0;
    double precioChoco = 0;
    String añadirNata ;
    String añadirNombre ;
    double total ;
    
    switch(saborTarta.toLowerCase()){
      case "manzana":
      double precioManzana = 18;
      System.out.print("¿Quiere nata?(si o no): ");
      añadirNata = (System.console().readLine());
      
      System.out.print("¿Quiere ponerle un nombre?(si o no): ");
      añadirNombre = (System.console().readLine());
      
      System.out.printf("Tarta de manzana: %.2f €\n",precioManzana);
      if ((añadirNata.equals("si")) || (añadirNata.equals("s"))){
        precioNata = 2.50;
        System.out.printf("Con nata: %.2f €\n",precioNata);
      
      }
      if ((añadirNombre.equals("si")) || (añadirNombre.equals("s"))){
        precioNombre = 2.75;
        System.out.printf("Con nombre: %.2f €\n",precioNombre);
      }
      total = (precioManzana + precioNata + precioNombre);
      System.out.printf("Total: %.2f €\n",total);
      break;
      case "fresa":
      double precioFresa = 16;
      System.out.print("¿Quiere nata?(si o no): ");
      añadirNata = (System.console().readLine());
      
      System.out.print("¿Quiere ponerle un nombre?(si o no): ");
      añadirNombre = (System.console().readLine());
      
      System.out.printf("Tarta de fresa: %.2f €\n",precioFresa);
      if ((añadirNata.equals("si")) || (añadirNata.equals("s"))){
        precioNata = 2.50;
      System.out.printf("Con nata: %.2f €\n",precioNata);
      }
      if ((añadirNombre.equals("si")) || (añadirNombre.equals("s"))){
        precioNombre = 2.75;
        System.out.printf("Con nombre: %.2f €\n",precioNombre);
      }
      total = (precioFresa + precioNata + precioNombre);
      System.out.printf("Total: %.2f €\n",total);
      break;
      case "chocolate":
      if ((saborTarta.equals("chocolate")) || (saborTarta.equals("Chocolate"))){
        System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
        String tipoChoco = (System.console().readLine());
        
        if ((tipoChoco.equals("Negro")) || (tipoChoco.equals("negro"))){
          precioChoco = 14;
        } else if ((tipoChoco.equals("Negro")) || (tipoChoco.equals("negro"))){
          precioChoco = 15;
        } 
      }
      
      System.out.print("¿Quiere nata?(si o no): ");
      añadirNata = (System.console().readLine());
      
      System.out.print("¿Quiere ponerle un nombre?(si o no): ");
      añadirNombre = (System.console().readLine());
      
      System.out.printf("Tarta de choco: %.2f €\n",precioChoco);
      if ((añadirNata.equals("si")) || (añadirNata.equals("s"))){
        precioNata = 2.50;
        System.out.printf("Con nata: %.2f €\n",precioNata);
      }
      if ((añadirNombre.equals("si")) || (añadirNombre.equals("s"))){
        precioNombre = 2.75;
        System.out.printf("Con nombre: %.2f €\n",precioNombre);
      }
      total = (precioChoco + precioNata + precioNombre);
      System.out.printf("Total: %.2f €\n",total);
      break;
      default:
    }
    
    
  }
}
