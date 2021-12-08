/**
 * Ejercicio: 3
 * Escribe un programa que lea 10 números por teclado y que luego los muestre en
 * orden inverso, es decir, el primero que se introduce es el último en mostrarse
 * y viceversa.
 * 
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio03Tema7 {
  public static void main (String[] args) {
    
    System.out.print("Introduce 10 numeros y el programa te muestra el orden inverso: ");
    int [] numero = new int[10];
    for (int i = 0; i < 9;i++){
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.print(numero[0]+" ");
    
    for (int a = 8; a >= 0;a--){
      System.out.print(numero[a]+" ");
    }
    
  }
}
