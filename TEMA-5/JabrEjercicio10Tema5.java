/**
 * Ejercicio: 10
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori , el programa no  sabe cuántos números se
 * introducirán.  El usuario indicará que ha terminado  de introducir los datos
 * cuando meta un número negativo.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio10Tema5 {
  public static void main (String[] args) {
    
    int media =-1;
    double resultado = 0;
    System.out.println("Introduce numeros para sacar una media, cuando quieras parar pon un numero negativo");
    for (double n = 0;n >= 0;media++){
      System.out.print("Introduce un numero para sacar una media: ");
      n = Double.parseDouble(System.console().readLine()) ;
      if (n > 0){
        resultado = resultado + n;
      }
    }
    System.out.printf("La media de los numeros introducidos es: %.2f",(resultado / media));
  }
}
