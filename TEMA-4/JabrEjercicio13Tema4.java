/**
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio13Tema4 {
  public static void main (String[] args) {
    System.out.println("Introduce 3 numeros uno por uno y del tipo entero");
    
    System.out.print("Dime el primer numero: ");
    int n1 = Integer.parseInt(System.console().readLine() );
    System.out.print("Dime el segundo numero: ");
    int n2 = Integer.parseInt(System.console().readLine() );
    System.out.print("Dime el tercer numero: ");
    int n3 = Integer.parseInt(System.console().readLine() );
    
    if ((n1 > n2) && (n2 > n3)){
      System.out.print("Orden: "+n1+"-"+n2+"-"+n3);
    } else if ((n2 > n1) && (n1 > n3)){
      System.out.print("Orden: "+n2+"-"+n1+"-"+n3);
    } else if ((n3 > n2) && (n2 > n1)){
      System.out.print("Orden: "+n3+"-"+n2+"-"+n1);
    } else if ((n1 > n3) && (n3 > n2)){
      System.out.print("Orden: "+n1+"-"+n3+"-"+n2);
    } else if ((n3 > n1 ) && (n1 > n2)){
      System.out.print("Orden: "+n3+"-"+n1+"-"+n2);
    } else if ((n2 > n3)&&(n3 > n1)){
      System.out.print("Orden: "+n2+"-"+n3+"-"+n1);
    }
  }
}
