/**
 * Realiza un programa que calcule el coste mensual del servicio de almacenamiento en la nube de los
 * datos de nuestra empresa. El programa debe pedir el tipo de servicio (un número del 1 al 3) y el
 * número de gigabytes que se han transferido durante el mes. El tipo de servicio, según la velocidad de
 * transferencia, puede ser básico, estándar o premium; con un coste mínimo de 200, 500 y 800 euros al
 * mes respectivamente. El precio mínimo se cobra cuando la transferencia de datos ha sido de 40
 * gigabytes o menos. Si se han transferido más de 40 gigabytes, cada gigabyte extra se paga al 5% del
 * coste base, es decir a 10, 25 o 40 euros según el tipo de servicio. Por ejemplo, un servicio de tipo
 * básico con un tráfico de 20 gigabytes costaría 200 euros. Un servicio de tipo estándar con un tráfico
 * de 50 gigabytes costaría 750 euros (500 + 250).
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicioExamenRepaso4 {
  public static void main (String[] args) {
    System.out.println("Este programa calcula el coste mensual de almacenamiento en nube ");
    System.out.println("1 - Basico ");
    System.out.println("2 - Estándar");
    System.out.println("3 - Premium");
    System.out.print("Selecciona el tipo de servicio(1 - 3): ");
    int tipoServicio = Integer.parseInt(System.console().readLine());
    System.out.print("Cuanta cantidad has trasferido al mes?(La cantidad es en GB): ");
    int cantidadTransferida = Integer.parseInt(System.console().readLine());
    int precioServicio = 0;
    switch (tipoServicio){
      case 1:
      precioServicio = 200;
      break;
      case 2:
      precioServicio = 500;
      break;
      case 3:
      precioServicio = 800;
      break;
      default:
      System.out.print("No existe servicio");
    }
    double extraAPagar = 0;
    if (cantidadTransferida > 40){
        extraAPagar = ((cantidadTransferida - 40)* 0.05);
        extraAPagar = extraAPagar * precioServicio;
    }
    
    double total = precioServicio + extraAPagar;

    System.out.printf("Este mes te ha costado:                %.2f€",total);
  }
  
}

