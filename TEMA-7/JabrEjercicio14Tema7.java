/**
 * Ejercicio: 14
 * Escribe un programa que pida 8 palabras y las almacene en un array.A continua
 * -ción, las palabras correspondientes a colores se deben almacenar al comienzo
 * y las que no son colores a continuación. Puedes utilizar tantos arrays auxili
 * -ares como quieras. Los colores que conoce el programa deben estar en otro ar
 * -ray y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
 * blanco y morado.
 * 
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio14Tema7 {
  public static void main (String[] args) {
    
     String[] palabra = new String[8];
    String[] resultado = new String[8];
    String[] color = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro ", "blanco", "morado"};
    int j = 0;
    System.out.print("Introduce 8 palabras seguidas cada una de ENTER: \n");
    for (int i = 0; i < palabra.length; i++) {
      palabra[i] = System.console().readLine();
      for (String c : color) {
        if (palabra[i].equals(c)) {
          resultado[i++] = c;
        }
      }
    }
    System.out.println("ARRAY ORIGINAL");
    for (int i = 0; i < palabra.length; i++) {
      System.out.printf("%-8d", i);
    }
    System.out.println();
    for (int i = 0; i < palabra.length; i++) {
      System.out.printf("%-8s", palabra[i]);
    }

    for (int i = 0; i < 8; i++) {
      boolean esColor = false;

      for (String c : color) {
        if (palabra[i].equals(c)) {
          esColor = true;
        }
      }

      if (!esColor) {
        resultado[j++] = palabra[i];
      }
    }
    System.out.println();
    System.out.println("ARRAY RESULTADO");
    for (int i = 0; i < palabra.length; i++) {
      System.out.printf("%-8d", i);
    }
    for (String r : resultado) {
      System.out.printf("%-8s", r);
    }

  }
}


