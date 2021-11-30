/**
 * Ejercicio: 18
 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
 * sustituir el color blanco por colores más alegres. Realiza un programa que
 * genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
 * cada dormitorio) de tal forma que no se repita ninguno.Los colores entre los
 * que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo ,
 * violeta y naranja
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio18Tema6 {
  public static void main (String[] args) {
    System.out.println("El programa genera de forma aleatoria una secuencia de tres colores aleatorios ");
    System.out.println(" ");
    String colorTipo1="";
    String colorTipo2="";
    String colorTipo3="";
    int color=0;
    int i = 0;
    boolean repetir = true;
    while (repetir){
      repetir = false;
      color = (int)(Math.random()*6)+1;
      i++;
      switch (color){
        case 1:
          if( i == 1){
          colorTipo1="rojo";
          }else if (i == 2){
          colorTipo2="rojo";
          }else{
          colorTipo3="rojo";
          }
        break; 
        case 2:
          if( i == 1){
            colorTipo1="azul";
          }else if (i == 2){
            colorTipo2="azul";
          }else{
            colorTipo3="azul";
          }
        break; 
        case 3:
          if( i == 1){
            colorTipo1="verde";
          }else if (i == 2){
            colorTipo2="verde";
          }else{
            colorTipo3="verde";
          }
        break; 
        case 4:
          if( i == 1){
            colorTipo1="amarillo";
          }else if (i == 2){
            colorTipo2="amarillo";
          }else{
            colorTipo3="amarillo";
          }
        break;
        case 5:
          if( i == 1){
            colorTipo1="violeta";
          }else if (i == 2){
            colorTipo2="violeta";
          }else{
            colorTipo3="violeta";
          }
        break;
        case 6:
          if( i == 1){
            colorTipo1="naranja";
          }else if (i == 2){
            colorTipo2="naranja";
          }else{
            colorTipo3="naranja";
          }
        break;
        default:
      }
      if ((colorTipo1.equals(colorTipo2))||(colorTipo1.equals(colorTipo3))){
        repetir=true;
      }else if((colorTipo2.equals(colorTipo1))||(colorTipo2.equals(colorTipo3))){
        repetir=true;
      }else if((colorTipo3.equals(colorTipo1))||(colorTipo3.equals(colorTipo2))){
        repetir=true;
      }else if ( i < 3){
        repetir=true;
      }
      
    }
    System.out.println("El color de cada dormitorio sera: "+"1º dormitorio "+colorTipo1 + " 2º dormitorio " + colorTipo2 + " 3º dormitorio " +colorTipo3);
  }
}
