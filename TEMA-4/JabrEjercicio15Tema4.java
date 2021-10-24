/**
 * Escribe un programa que pinte una pirámide rellena con un carácter introducido
 * por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
 * etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
 * de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
 * hacia la derecha.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio15Tema4 {
  public static void main (String[] args) {
    System.out.println("Introduce el carácter con el que quieres rellenar la piramide: ");
    System.out.print("El carácter deseado es: ");
    String c = (System.console().readLine() );
    System.out.println("Introduce el tipo de piramide que deseas: ");
    System.out.println("+--------------------------------------+");
    System.out.println("| 1 --Vertice apuntando hacia arriba   |");
    System.out.println("+--------------------------------------+");
    System.out.println("| 2 --Vertice apuntando hacia abajo    |");
    System.out.println("+--------------------------------------+");
    System.out.println("| 3 --Vertice apuntando hacia derecha  |");
    System.out.println("+--------------------------------------+");
    System.out.println("| 4 --Vertice apuntando hacia izquierda|");
    System.out.println("+--------------------------------------+");
    System.out.print("Tu opcion es: ");
    int opcion = Integer.parseInt(System.console().readLine() );
    switch (opcion){
      case 1:
      System.out.println("  "+ c);
      System.out.println(" "+c + c + c);
      System.out.println(c+ c + c + c + c);
      break;
      case 2:
      System.out.println(c+ c + c + c + c);
      System.out.println(" "+c + c + c);
      System.out.println("  "+ c);
      break;
      case 3:
      System.out.println(c);
      System.out.println(c + " " + c);
      System.out.println(c + " " + c +" " + c);
      System.out.println(c + " " + c);
      System.out.println(c);
      break;
      case 4:
      System.out.println(" "+" "+" " + " " + " " + c);
      System.out.println(" "+" " + " " + c +" "+ c);
      System.out.println(" " + c + " " + c +" "+ c);
      System.out.println(" "+" " + " " + c +" "+ c);
      System.out.println(" "+" "+" " + " " + " " + c);
      break;
    }
  }
}

