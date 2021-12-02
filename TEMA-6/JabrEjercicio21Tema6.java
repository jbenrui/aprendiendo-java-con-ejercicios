/**
 * Ejercicio: 21
 * Realiza un programa que genere una secuencia de cinco monedas de curso
 * legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
 * 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
 * posiciones posibles son cara y cruz.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio21Tema6 {
  public static void main (String[] args) {
    System.out.println("Realiza un programa que genere una secuencia de cinco monedas de curso legal lanzadas al aire.");
    System.out.println(" ");
    String moneda1="";
    String moneda2="";
    String moneda3="";
    String moneda4="";
    String moneda5="";
    int tirada=0;
    for (int moneda = 5; moneda > 0; moneda--){
      tirada=(int)(Math.random()*2) +1;
      switch (tirada){
        case 1:
        if(moneda == 1){
          moneda1="cara";
        }else if (moneda == 2){
          moneda2="cara";
        }else if (moneda == 3){
          moneda3="cara";
        }else if (moneda == 4){
          moneda4="cara";
        }else if (moneda == 5){
          moneda5="cara";
        }
        break; 
        case 2:
          if(moneda == 1){
          moneda1="cruz";
        }else if (moneda == 2){
          moneda2="cruz";
        }else if (moneda == 3){
          moneda3="cruz";
        }else if (moneda == 4){
          moneda4="cruz";
        }else if (moneda == 5){
          moneda5="cruz";
        }
        break; 
        default:
      }
    }
    System.out.println("2 céntimos - "+moneda1);
    System.out.println("20 céntimos - "+moneda2);
    System.out.println("50 céntimos - "+moneda3);
    System.out.println("1 euro - "+moneda4);
    System.out.println("2 euros - "+moneda5);
  }
}

