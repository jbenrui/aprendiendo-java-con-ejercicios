/**
 * Escribe un programa que calcule el precio final de un producto según su
 * base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 * reducido o superreducido) y el código promocional. Los tipos de IVA general,
 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
 * promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
 * muestran los valores correctos, aunque los números no estén tabulados.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio23Tema4 {
  public static void main (String[] args) {
    System.out.print("Introduce la base Imponible del producto: ");
    double precioSinIVA = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el tipo de IVA (generico,reducido,superreducido): ");
    String tipoIVA = (System.console().readLine());
    int IVA = 0;
    switch (tipoIVA.toLowerCase()){
      case "generico":
      IVA = 21;
      break;
      case "reducido":
      IVA = 10;
      break;
      case "superreducido":
      IVA = 4;
      break;
    }
    System.out.print("Introduce un codigo de promocion(nopro,mitad,meno5,5porc): ");
    String promo = (System.console().readLine());
      double aumentoIVA = (((double)precioSinIVA * (double)IVA)/100);
      double precioIVA = (precioSinIVA + aumentoIVA);
    
    if (promo.equals("nopro")){
      System.out.printf("Base imponible:           %8.2f\n",precioSinIVA);
      System.out.printf("IVA(%d):                  %8.2f\n",IVA,aumentoIVA);
      System.out.printf("Precio con IVA:           %8.2f\n",precioIVA );
      System.out.println("Cód. promo."+"("+promo+"):          ");
      System.out.printf("Total:                    %8.2f\n",precioIVA);
    } else if (promo.equals("mitad")){
      System.out.printf("Base imponible:           %8.2f\n",precioSinIVA);
      System.out.printf("IVA(%d):                  %8.2f\n",IVA,aumentoIVA);
      System.out.printf("Precio con IVA:           %8.2f\n",precioIVA );
      System.out.println("Cód. promo."+"("+promo+"):         -"+(precioIVA / 2));
      System.out.println("Total:                       "+(precioIVA / 2));
    }else if (promo.equals("meno5")){
      System.out.printf("Base imponible:           %8.2f\n",precioSinIVA);
      System.out.printf("IVA(%d):                  %8.2f\n",IVA,aumentoIVA);
      System.out.printf("Precio con IVA:           %8.2f\n",precioIVA );
      System.out.println("Cód. promo."+"("+promo+"):         -"+(precioIVA - 5));
      System.out.println("Total:                       "+(precioIVA - 2));
    }else if (promo.equals("5porc")){
      System.out.printf("Base imponible:           %8.2f\n",precioSinIVA);
      System.out.printf("IVA(%d):                  %8.2f\n",IVA,aumentoIVA);
      System.out.printf("Precio con IVA:           %8.2f\n",precioIVA );
      System.out.println("Cód. promo."+"("+promo+"):         -"+(precioIVA * 0.05));
      System.out.printf("Total:                    %8.2f\n",(precioIVA-(precioIVA * 0.05)));
    } else {
      System.out.print("Ese codigo promocional no existe.");

    }
  }
  
}
