/*
 * Escribe un programa que declare 5 variables de tipo char. A continuación, crea
 * otra variable como cadena de caracteres y asígnale como valor la concatenación 
 * de las anteriores 5 variables. Por último, muestra la cadena de caracteres
 * por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */


public class JabrEjercicio08Tema2 {
  public static void main (String[] args) {
    char letraJ = 'J';
    char letraO = 'o';
    char letraS = 's';
    char letraE = 'e';

    // La sigiente linea da error si intentamos sumar la variables
    // La solucion es añadirle unas "" como si estuviesemos sumando numeros 
    // enteros
    String nombreCompleto = "" + letraJ + letraO + letraS + letraE;
    
    System.out.println(nombreCompleto);
	}
}

