/**
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
 * 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
 * horas, los minutos no se deben introducir por teclado
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio2Tema4 {
  public static void main (String[] args) {
    System.out.println("Usa el siguiente formato de horas. 0 a 23");
    System.out.println("Otro formato no servira para el programa queda avisado");
    //He supuesto que el programa controla en cierto modo la llegada del trabaja
    //-dor a la empresa y le da un saludo segun el tramo de hora.
     
    System.out.print("Introduce el la hora de su llegada al trabajo: ");
    int horaDeLlegada = Integer.parseInt(System.console().readLine() );;
    
    if ((horaDeLlegada >= 6) && (horaDeLlegada <= 12)) {
      System.out.println("Buenos Días");
    }
    
    if ((horaDeLlegada >= 13) && (horaDeLlegada <= 20)) {
      System.out.println("Buenas Tardes");
    }
    
    if (((horaDeLlegada >= 21 ) && (horaDeLlegada <= 23)) || ((horaDeLlegada >= 5 ) && (horaDeLlegada <= 0))){
      System.out.println("Buenas Noches");
      //No funciona bien este if
    }
    if ((horaDeLlegada >= 24 ) && (horaDeLlegada <= 0)) {
      System.out.println("Use la franja de horario correcta");
      //no saca el mensaje de error
    }
  }
}
