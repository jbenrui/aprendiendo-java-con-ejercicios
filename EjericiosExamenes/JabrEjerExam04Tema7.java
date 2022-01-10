/**
 * Ejercicio Examen 2021
 * En ajedrez, el valor de las piezas se mide en peones según la siguiente tabla:
 * 
 * Realiza un programa que genere al azar las capturas que ha hecho un jugador 
 * durante una partida.El número de capturas será un valor aleatorio entre 0 y
 * 15. Hay que tener en cuenta que cada jugador tiene la posibilidad de capturar
 * algunas de las siguientes piezas (no más): 1 dama, 2 torres, 2 alfiles, 2caba
 * -llos y 8 peones. El nombre de las piezas se debe guardar en un array de la f
 * -orma pieza ={“Dama”, “Torre”, “Alfil”, “Caballo”, “Peón”} y el valor de cada
 * una de ellas en otro array de la forma valor = {9, 5, 3, 2, 1}. El alumno pue
 * -de utilizar más arrays si lo estima oportuno. Al final debe aparecer la punt
 * -uación total. Si hay algún problema con las cadenas de caracteres,se permite
 * cambiar “Peón” por “Peon”.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjerExam04Tema7 {
   public static void main(String[] args) {
    System.out.println("PROGRAMA MUESTRAS LAS CAPTURAS DE FICHAS DE UN JUGADOR DURANTE UNA PARTIDA.");
    System.out.println("---------------------------------------------------------------------------");
    System.out.println(" ");
    String[] piezas = {"Dama", "Torre", "Alfil", "Caballo", "Peón",};
    String[] fichas = new String [5];
    fichas[0] = "Dama";
    fichas[1] = "Torre";
    fichas[2] = "Alfil";
    fichas[3] = "Caballo";
    fichas[4] = "Peón";
    int[] valorFicha = new int [5];
    valorFicha[0] = 9;
    valorFicha[1] = 5;
    valorFicha[2] = 3;
    valorFicha[3] = 2;
    valorFicha[4] = 1;
    //Genera el numero de capturas totales
    int capturasTotales = (int)(Math.random()*16);
    int capturaJugador = 0;
    int indiceValor = 0;
    int[] contadorFichas = new int [5];
    int[] repetirFicha = new int [5];
    repetirFicha[0]=1;
    repetirFicha[1]=2;
    repetirFicha[2]=2;
    repetirFicha[3]=2;
    repetirFicha[4]=8;
    for (int i = 0; i < 5; i++){
      contadorFichas[indiceValor]=0;
    }
    //Mientras que las capturasTotales sean menor al aumentador de las capturas suma.
    while (capturaJugador < capturasTotales){
      indiceValor = (int)(Math.random()*5);
      //Si el valor de la ficha de la suma es mayor a la del aumentador de las capturas entonces genero otro valor .
      //Si las fichas es igual a las pizas y contadorFichas es Igual a RepetirFichas repetira el bucle hasta que para que salga otro indice.
      if ((fichas[indiceValor].equals(piezas))&&(contadorFichas[indiceValor] < repetirFicha[indiceValor])){
        contadorFichas[indiceValor]=contadorFichas[indiceValor]++;
      //Si no repite las fichas entonces hara:
      }else{
        //Si el valor de la ficha mas las capturasDelJugador son mayores a las capturas totales saco otro indice.
        if ((valorFicha[indiceValor]+capturaJugador)> capturasTotales){
          indiceValor = (int)(Math.random()*5);
        }else {
          //Si es menor lo sumo y muestro el resultado.
          capturaJugador+=valorFicha[indiceValor];
          System.out.println(fichas[indiceValor]+" ("+valorFicha[indiceValor]+" peones)");
        }
      }
      contadorFichas[indiceValor]=contadorFichas[indiceValor]++;
    }
    System.out.println("Puntos totales: "+capturasTotales+" peones.");
  }
}
