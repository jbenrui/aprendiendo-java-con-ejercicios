/**
 * Ejercicio: 18
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio18Tema5 {
  public static void main (String[] args) {
    int num1 = 0;
    int num2 = 0;
    while (num1 == num2){
      System.out.print("Introduce un número por teclado: ");
      num1 = Integer.parseInt(System.console().readLine()) ;
      System.out.print("Introduce otro número por teclado: ");
      num2 = Integer.parseInt(System.console().readLine());

      if (num1 > num2){
        while( num2 < num1 ){
          System.out.print(num2 + " "); 
          num2+=7; 
        }
        System.out.print(num1 + " "); 
      }else if (num2 > num1){
        while( num1 < num2 ){
          System.out.print(num1 + " ");
          num1+=7;
        }
        System.out.print(num2);
      }else {
        System.out.println("Los numeros son iguales.");
      }
    }
  }
}


