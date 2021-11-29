/**
 * Ejercicio: 13
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio13Tema6 {
  public static void main (String[] args) {
    System.out.println("Este programa simule la tirada de dos dados");
    System.out.println("");
    int dado1 = 0;
    int dado2 = 1;
    while (dado1 != dado2){
      dado1=(int)(Math.random()*6)+1;
      dado2=(int)(Math.random()*6)+1;
      switch (dado1){
        case 1:
          System.out.print("⚀ ");
        break;
        case 2:
          System.out.print("⚁ ");
        break;
        case 3:
          System.out.print("⚂ ");
        break;
        case 4:
          System.out.print("⚃ ");
        break;
        case 5:
          System.out.print("⚄ ");
        break;
        case 6:
          System.out.print("⚅ ");
        break;
        default:
      } 
      switch (dado2){
        case 1:
          System.out.print("⚀ ");
        break;
        case 2:
          System.out.print("⚁ ");
        break;
        case 3:
          System.out.print("⚂ ");
        break;
        case 4:
          System.out.print("⚃ ");
        break;
        case 5:
          System.out.print("⚄ ");
        break;
        case 6:
          System.out.print("⚅ ");
        break;
        default:
      } 
      System.out.println("");
      System.out.println("");
    }
  }
}

