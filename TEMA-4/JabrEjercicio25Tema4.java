/**
 * La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
 * máxima calidad y nos ha pedido hacer un configurador que calcule el precio
 * según el alto y el ancho. El precio base de una bandera es de un céntimo de
 * euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
 * se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
 * son 3.25 €. El IVA ya está incluido en todas las tarifas.

 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio25Tema4 {
  public static void main (String[] args) {
    System.out.println("Tienda Online BanderaDeEspaña.es");
    System.out.println("-------------------------------------- ");
    System.out.println("       Calculador de Precios          ");
    System.out.print("Introduce el alto de la bandera: ");
    double altoBandera = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el ancho de la bandera: ");
    double anchoBandera = Double.parseDouble(System.console().readLine());
    System.out.print("¿Quiere el escudo bordado? (s/n): ");
    String escudoBordado = (System.console().readLine() );;
    double cm2 = altoBandera * anchoBandera;
    double preciocm2 = cm2 * 0.010;
    if (escudoBordado.equals("s")){
      double escudoPrecio = 2.50;
      System.out.println("Gracias. Aquí tiene el desglose de su compra.");
      System.out.println("Bandera de  ("+(int)cm2+" cm²):         "+preciocm2+"€");
      System.out.println("Sin escudo:                    "+escudoPrecio+"€");
      System.out.println("Gastos de envío:              3,25€");
      System.out.println("Total:                        "+(preciocm2 + 3.25 + escudoPrecio)+"€");
    } else {
      System.out.println("Gracias. Aquí tiene el desglose de su compra.");
      System.out.println("Bandera de  ("+(int)cm2+" cm²):         "+preciocm2+"€");
      System.out.println("Sin escudo:                    0,00€");
      System.out.println("Gastos de envío:              3,25€");
      System.out.println("Total:                        "+(preciocm2 + 3.25)+"€");
    }
  }
}    
