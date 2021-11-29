/**
 * Ejercicio: 14
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
 * El programa intentará adivinar el número que estás pensando - un número entre
 * 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el pro
 * -grama debe preguntar si el número que estás pensando es mayor o menor que el
 * que te acaba de decir.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio14Tema6 {
  public static void main (String[] args) {
    System.out.println("El programa adivina un número que introduce el usuario entre 0 y 100.");
    int contador = 5;
    int maximo = 0;
    int minimo = 199;
    int numAleatorio=0;
    int media = 0;
    System.out.print("Introduce un numero entero para que el programa lo adivine: ");
    int numIntroducido = Integer.parseInt(System.console().readLine());
    numAleatorio=(int)(Math.random()*100);
    for (int i = 1; i <= contador;i++){
      
      if (numAleatorio == numIntroducido){
        System.out.println("Has adivinado el numero enorabuena!!!");
        System.out.print("El numero era: "+numIntroducido);
        System.out.println("");
        i+=5;
      }else if(i < contador){
        System.out.println("El numero del programa es: "+numAleatorio);
        System.out.println("Sigue adivinando el numero.");
        System.out.println("Le quedan "+(contador - i)+" intentos.");
        if (numIntroducido < numAleatorio){
          System.out.println("El numero introducido es menor");
          System.out.println("");
          numAleatorio=(int)(Math.random()*numIntroducido);
        }else{
          System.out.println("El numero introducido es mayor");
          System.out.println("");
          int numAnterior=numAleatorio;
          if (i > 1){
            numAleatorio=(int)(Math.random()*(numAnterior - numIntroducido)) + numIntroducido;
          }
        }
      }else if(i == contador){
        System.out.println("Le quedan "+(contador - i)+" intentos.");
        System.out.println("No ha conseguido adivinar el numero :c");
        System.out.println("El numero del programa es: "+numAleatorio);
        System.out.print("El numero era: "+numIntroducido);
        System.out.println("");
      }
      
    }
  }
}
