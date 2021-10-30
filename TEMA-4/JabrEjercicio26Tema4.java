/**
 * Realiza un programa que calcule el precio de unas entradas de cine en función
 * del número de personas y del día de la semana. El precio base de una entrada
 * son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
 * jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
 * Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
 * grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
 * que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
 * 1 individual que son 41 euros (33 + 8).
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio26Tema4 {
  public static void main (String[] args) {
    System.out.println("Venta de entradas CineCampa");
    System.out.println("-------------------------------------- ");
    System.out.print("Introduce el numero de entradas: ");
    int numEntradas = Integer.parseInt(System.console().readLine());
    System.out.print("Dia de la semana: ");
    String diaSemana = (System.console().readLine());
    System.out.print("¿Tiene tarjeta CineCampa?(s/n): ");
    String tarjetaSocio = (System.console().readLine());
    System.out.println(" ");
    double entradaIndividual = 8;
    int entradaPareja = 0;
    double precioPareja = 0;
    double descuento = 0;
    
    switch(diaSemana.toLowerCase()){
      case "lunes":
      System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
      System.out.println("Entradas individuales:                    "+numEntradas+" ");
      System.out.println("Precio por entrada individual:            "+entradaIndividual+"€");
      System.out.println("Total:                                    "+(entradaIndividual * numEntradas )+"€");
      if (tarjetaSocio.equals("s")){
        descuento = (entradaIndividual * 0.1)* numEntradas;
        System.out.println("Descuento:                                 "+descuento+"€");
        System.out.println("A pagar:                                  "+(entradaIndividual * numEntradas - descuento)+"€");
        
      }else{
        System.out.println("Descuento:                                 "+descuento+"€");
        System.out.println("A pagar:                                  "+(entradaIndividual * numEntradas )+"€");
      }
      break;
      case "martes":
      System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
      System.out.println("Entradas individuales:                    "+numEntradas+" ");
      System.out.println("Precio por entrada individual:            "+entradaIndividual+"€");
      System.out.println("Total:                                    "+(entradaIndividual * numEntradas )+"€");
      if (tarjetaSocio.equals("s")){
        descuento = (entradaIndividual * 0.1)* numEntradas;
        System.out.println("Descuento:                                 "+descuento+"€");
        System.out.println("A pagar:                                  "+(entradaIndividual * numEntradas - descuento)+"€");
        
      }else{
        System.out.println("Descuento:                                 "+descuento+"€");
        System.out.println("A pagar:                                  "+(entradaIndividual * numEntradas )+"€");
      }
      break;
      case "miercoles":
      entradaIndividual = 5;
      System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
      System.out.println("Entradas individuales:                    "+numEntradas+" ");
      System.out.println("Precio por entrada individual:            "+entradaIndividual+"€");
      System.out.println("Total:                                    "+(entradaIndividual * numEntradas )+"€");
      if (tarjetaSocio.equals("s")){
        descuento = (entradaIndividual * 0.1)* numEntradas;
        System.out.println("Descuento:                                 "+descuento+"€");
        System.out.println("A pagar:                                  "+(entradaIndividual * numEntradas - descuento)+"€");
        
      }else{
        System.out.println("Descuento:                                 "+descuento+"€");
        System.out.println("A pagar:                                  "+(entradaIndividual * numEntradas )+"€");
      }
      break;
      case "jueves":
        if ((numEntradas %2) == 0){
          entradaPareja = numEntradas / 2;
          precioPareja = 11;
          System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
          System.out.println("Entradas de Parejas:                      "+entradaPareja+" ");
          System.out.println("Precio por entrada de Pareja:             "+precioPareja+"€");
          System.out.println("Total:                                    "+(entradaPareja * precioPareja)+"€");
          if (tarjetaSocio.equals("s")){
            descuento = (precioPareja * 0.1)* entradaPareja;
            System.out.println("Descuento:                                 "+descuento+"€");
            System.out.println("A pagar:                                  "+(entradaPareja * precioPareja - descuento)+"€");
        
          }else{
            System.out.println("Descuento:                                 "+descuento+"€");
            System.out.println("A pagar:                                  "+(entradaPareja * precioPareja + entradaIndividual)+"€");
          }
        } else {
          entradaPareja = (numEntradas - 1)/ 2;
          precioPareja = 11;
          entradaPareja = numEntradas / 2;
          precioPareja = 11;
          System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
          System.out.println("Entradas de Parejas:                      "+entradaPareja+" ");
          System.out.println("Precio por entrada de Pareja:             "+precioPareja+"€");
          System.out.println("Entradas individuales:                    "+( 1 )+" ");
          System.out.println("Precio por entrada individual:            "+entradaIndividual+"€");
          System.out.println("Total:                                    "+(entradaPareja * precioPareja + entradaIndividual)+"€");
          if (tarjetaSocio.equals("s")){
            descuento = (precioPareja * 0.1)* entradaPareja;
            System.out.println("Descuento:                                "+descuento+"€");
            System.out.println("A pagar:                                  "+(entradaPareja * precioPareja + entradaIndividual - descuento - 0.8)+"€");//el 0.8 es del descuento individual (entradaIndividual * 0.1)
        
          }else{
            System.out.println("Descuento:                                "+descuento+"€");
            System.out.println("A pagar:                                  "+(entradaPareja * precioPareja + entradaIndividual)+"€");
          }
        }
      break;
      case "viernes":
        System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
        System.out.println("Entradas individuales:                    "+numEntradas+" ");
        System.out.println("Precio por entrada individual:            "+entradaIndividual+"€");
        System.out.println("Total:                                    "+(entradaIndividual * numEntradas )+"€");
        if (tarjetaSocio.equals("s")){
          descuento = (entradaIndividual * 0.1)* numEntradas;
          System.out.println("Descuento:                                 "+descuento+"€");
          System.out.println("A pagar:                                  "+(entradaIndividual * numEntradas - descuento)+"€");
        
        }else{
          System.out.println("Descuento:                                 "+descuento+"€");
          System.out.println("A pagar:                                  "+(entradaIndividual * numEntradas )+"€");
        }
      break;
      case "sabado":
        System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
        System.out.println("Entradas individuales:                    "+numEntradas+" ");
        System.out.println("Precio por entrada individual:            "+entradaIndividual+"€");
        System.out.println("Total:                                    "+(entradaIndividual * numEntradas )+"€");
        if (tarjetaSocio.equals("s")){
        descuento = (entradaIndividual * 0.1)* numEntradas;
        System.out.println("Descuento:                                 "+descuento+"€");
        System.out.println("A pagar:                                  "+(entradaIndividual * numEntradas - descuento)+"€");
        
        }else{
        System.out.println("Descuento:                                 "+descuento+"€");
        System.out.println("A pagar:                                  "+(entradaIndividual * numEntradas )+"€");
        }
      break;
      case "domingo":
      System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
      System.out.println("Entradas individuales:                    "+numEntradas+" ");
      System.out.println("Precio por entrada individual:            "+entradaIndividual+"€");
      System.out.println("Total:                                    "+(entradaIndividual * numEntradas )+"€");
        if (tarjetaSocio.equals("s")){
          descuento = (entradaIndividual * 0.1)* numEntradas;
          System.out.println("Descuento:                                 "+descuento+"€");
          System.out.println("A pagar:                                  "+(entradaIndividual * numEntradas - descuento)+"€");
        
        }else{
          System.out.println("Descuento:                                 "+descuento+"€");
          System.out.println("A pagar:                                  "+(entradaIndividual * numEntradas )+"€");
        }
      break;
      default:
          System.out.print("No existe ese dia");
      }
  } 
}
