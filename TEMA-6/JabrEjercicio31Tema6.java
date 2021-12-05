/**
 * Ejercicio: 31
 * Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la
 * partida, el jugador introduce la cantidad de dinero que quiere apostar. Se 
 * muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u
 * 11, el jugador gana la misma cantidad que apostó y termina la partida. Por
 * ej. si apostó 1000 € , gana otros 1000 € y acaba con 2000 € . Si entre los
 * dos dados suman 2 , 3 o 12 , el jugador pierde todo su dinero y termina la 
 * partida. Si no seda ninguno de los casos anteriores, es decir si sale 4,5,
 * 6, 8, 9 o 10, el juego entra en una segunda etapa.En esta etapa,el jugador
 * buscará volver a obtener ese número en los dados . Si consigue repetir ese
 * número, gana. Si sale un 7, pierde. Si sale otro número , tiene que seguir
 * tirando.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio31Tema6 {
  public static void main (String[] args) {
    System.out.print("Introduce la acantidad de la puesta (€): ");
    int apuesta = Integer.parseInt(System.console().readLine()) ;
    int dado1 = (int)(Math.random()*6)+1;
    int dado2 = (int)(Math.random()*6)+1;
    System.out.println("El primer dado ha sido un: "+dado1);
    System.out.println("El segundo dado ha sido un: "+dado2);
    int sumaDados = dado1 + dado2;
    System.out.println("La suma de los dado ha sido : "+sumaDados);
    
    int premio= apuesta;
    if ((sumaDados== 7)||(sumaDados==11)){
      premio = premio+ apuesta;
      System.out.println("Has ganado.");
      System.out.println("Has acabado con:"+premio+"€");
    }else if (((sumaDados== 2)||(sumaDados==3))||(sumaDados==12)){
      System.out.println("Has perdido.");
    }else{
      System.out.println("");
      System.out.println("Has entrado en la segunda etapa. ");
      System.out.println(".................................");
      do{
        
        dado1 = (int)(Math.random()*6)+1;
        dado2 = (int)(Math.random()*6)+1;
        System.out.println("El primer dado ha sido un: "+dado1);
        System.out.println("El segundo dado ha sido un: "+dado2);
        if ((dado1 + dado2)==sumaDados){
          premio = premio+ apuesta;
          System.out.println("Has ganado.");
          System.out.println("Has acabado con:"+premio+"€");
        }else if ((dado1 + dado2)==7){
          System.out.println("Has perdido.");
        }else{
          System.out.println("La suma de los dados ha sido "+(dado1+dado2));
          System.out.print("Vuelve a tirar (Press any key):");
          String tirada =(System.console().readLine()) ;
        }
      }while (((dado1 + dado2)!=7)&&(dado1+dado2)!=sumaDados);
    }
  }
}
