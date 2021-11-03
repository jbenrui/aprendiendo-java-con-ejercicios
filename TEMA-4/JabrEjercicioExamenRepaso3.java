/**
 * Mejora el programa anterior de tal forma que se compruebe la validez de todos los datos
 * introducidos. Si alguno de los datos es incorrecto, el programa debe seguir preguntando hasta
 * que el usuario meta un dato correcto.
 * 
 * 
 */
public class JabrEjercicioExamenRepaso3 {
  public static void main (String[] args) {
    System.out.print("Introduzca la cantidad de paquetes que desea: ");
    int numPaquetes = Integer.parseInt(System.console().readLine());
    if (numPaquetes < 20){
      System.out.println("El pedido mínimo es de 20 paquetes.");
    }
    System.out.print("Número de colores de la impresión de la taza: ");
    int numColor = Integer.parseInt(System.console().readLine());
    
    // TAZAS
    double precioTaza = 0;
    if ((numColor == 1)||(numColor == 2)||(numColor == 3)){
      if ((numPaquetes >= 20)&&(numPaquetes <= 39)) {
        precioTaza = 4.90;
      }else if ((numPaquetes >= 40)&&(numPaquetes <= 99)){
        precioTaza = 3.90;
      }else if (numPaquetes >= 100){
        precioTaza = 3.20;
      }
    }else {
      if ((numPaquetes >= 20)&&(numPaquetes <= 39)) {
        precioTaza = 4.90 + (4.90 * 0.2);
      }else if ((numPaquetes >= 40)&&(numPaquetes <= 99)){
        precioTaza = 3.90 + (3.90 * 0.2);
      }else if (numPaquetes >= 100){
        precioTaza = 3.20 + (3.20 * 0.2);
      } 
    }
    // LLaveros
    System.out.print("1) llavero de plástico 2) llavero metálico: ");
    int llavero = Integer.parseInt(System.console().readLine());
    if ((llavero != 1)&&(llavero != 2)){
      System.out.print("La opcion que has seleccionado no existe.");
    }
    double precioLlavero = 0 ;
    if (llavero == 1){
      if(numPaquetes <= 50){ 
        precioLlavero = 2.00;
      }else if (numPaquetes > 50){
        precioLlavero = 1.50;
      }
    } else if (llavero == 2){
      if(numPaquetes <= 50){ 
        precioLlavero = 3.00;
      }else if (numPaquetes > 50){
        precioLlavero = 2.50;
      }
    }
    double total = ((numPaquetes * precioLlavero)+(numPaquetes * precioTaza))*0.21 + (numPaquetes * precioLlavero)+(numPaquetes * precioTaza);
    System.out.printf("Taza (más de 3 col.): %d unidades\n",numPaquetes);
    System.out.printf("Precio unitario            %8.2f €\n",precioTaza);
    System.out.printf("Total tazas                %8.2f €\n",(numPaquetes * precioTaza));
    System.out.printf("Llaveros (c.u. )           %8.2f €\n",precioLlavero);
    System.out.printf("Total llaveros             %8.2f €\n",(numPaquetes * precioLlavero));
    System.out.printf("Tazas más llaveros         %8.2f €\n",((numPaquetes * precioLlavero)+(numPaquetes * precioTaza)));
    System.out.printf("IVA                        %8.2f €\n",((numPaquetes * precioLlavero)+(numPaquetes * precioTaza))*0.21);
    System.out.printf("TOTAL                      %8.2f €\n",total);
  }
}
