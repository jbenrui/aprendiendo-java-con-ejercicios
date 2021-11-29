/**
 * Ejercicio: 16
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los 
 * siguientes requisitos:
 * 
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 * figuras posibles: corazón, diamante, herradura, campana y limón.
 * 
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, 
 * ha perdido”.
 * 
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bi
 * -en, ha recuperado su moneda”.
 * 
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena , ha ganado 
 * 10 monedas”.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio16Tema6 {
  public static void main (String[] args) {
    System.out.println("El programa simula una máquina tragaperras simplificada ");
    System.out.println(" ");
    String figuraTipo1="";
    String figuraTipo2="";
    String figuraTipo3="";
    int figura=0;
    for (int i = 0; i < 3; i++){
      figura = (int)(Math.random()*5)+1;
      switch (figura){
        case 1:
        if( i == 1){
        figuraTipo1="corazón";
        }else if (i == 2){
        figuraTipo2="corazón";
        }else{
        figuraTipo3="corazón";
        }
        break; 
        case 2:
          if( i == 1){
            figuraTipo1="diamante";
          }else if (i == 2){
            figuraTipo2="diamante";
          }else{
            figuraTipo3="diamante";
          }
        break; 
        case 3:
          if( i == 1){
            figuraTipo1="herradura";
          }else if (i == 2){
            figuraTipo2="herradura";
          }else{
            figuraTipo3="herradura";
          }
        break; 
        case 4:
          if( i == 1){
            figuraTipo1="campana";
          }else if (i == 2){
            figuraTipo2="campana";
          }else{
            figuraTipo3="campana";
          }
        break;
        case 5:
          if( i == 1){
            figuraTipo1="limón";
          }else if (i == 2){
            figuraTipo2="limón";
          }else{
            figuraTipo3="limón";
          }
        break;
        default:
      }
    }
    System.out.println( figuraTipo1 + " " + figuraTipo2 + " " +figuraTipo3);
    if ((figuraTipo1 == figuraTipo2)&&(figuraTipo2 != figuraTipo3)){
      System.out.println("Bien, ha recuperado su moneda");
    } else if ((figuraTipo1 == figuraTipo2)&&(figuraTipo2 == figuraTipo3)){
      System.out.println("Enhorabuena, ha ganado 10 monedas");
    }else{
      System.out.println("Lo siento, ha perdido");
    }
  }
}
