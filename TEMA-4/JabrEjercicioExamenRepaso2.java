/**
 * Una empresa de promociones comerciales nos ha pedido hacer un programa que sea capaz 
 * de elaborar presupuestos de paquetes de regalo compuestos por tazas y llaveros
 * personalizados. Todos los paquetes promocionales llevan una taza y un llavero. Los precios
 * dependen de la cantidad de paquetes que se pidan, del número de colores del logotipo
 * impreso en las tazas y del material del llavero. En un presupuesto no se mezclan llaveros de
 * distintos materiales ni tazas con distinto número de colores. El pedido mínimo son 20
 * paquetes. Suponemos que el usuario introduce correctamente todos los datos. En este
 * ejercicio no hay que comprobar la validez de los mismos. A la cantidad final hay que sumarle
 * el IVA del 21%. Las tarifas se detallan a continuación:
 *    • El precio de cada taza es de 4,90 € para pedidos de entre 20 y 39 paquetes.
 *    • El precio de cada taza es de 3,90 € para pedidos de entre 40 y 99 paquetes.
 *    • El precio de cada taza es de 3,20 € para pedidos de 100 o más paquetes.
 *    • Los precios anteriores se aplican si la taza va impresa con 1, 2 o 3 colores. Si la taza se
 *      imprime con más de 3 colores sale un 20% más cara, dando igual que sean 4, 5, 6 o
 *      más colores.
 *    • Cada llavero de plástico cuesta 2 € para pedidos de menos de 50 unidades y 1,50 €
 *      para pedidos de 50 o más unidades.
 *    • Cada llavero metálico cuesta 3 € para pedidos de menos de 50 unidades y 2,50 € para
 *      pedidos de 50 o más unidades.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicioExamenRepaso2 {
  public static void main (String[] args) {
    System.out.print("Introduzca la cantidad de paquetes que desea: ");
    int numPaquetes = Integer.parseInt(System.console().readLine());
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
      }else if ((numPaquetes >= 40)&&(numPaquetes <= 99)){
        precioTaza = 3.20 + (3.20 * 0.2);
      }
    }
    // LLaveros
    System.out.print("1) llavero de plástico 2) llavero metálico: ");
    int llavero = Integer.parseInt(System.console().readLine());
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
