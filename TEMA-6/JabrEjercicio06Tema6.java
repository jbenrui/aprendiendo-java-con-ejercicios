/**
 * Ejercicio: 6
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario de
 * -be adivinarlo y tiene para ello 5 oportunidades.Después de cada intento fall
 * -ido,el programa dirá cuántas oportunidades quedan y si el número introducido 
 * es menor o mayor que el número secreto.

 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio06Tema6 {
  public static void main (String[] args) {
    System.out.println("El programa piensa un número al azar entre 0 y 100 y el usuario debe adivinarlo.");
    int contador = 5;
    int maximo = 0;
    int minimo = 199;
    int numAleatorio=0;
    int media = 0;
    numAleatorio=(int)(Math.random()*100);
    for (int i = 1; i <= contador;i++){
      int numIntroducido = Integer.parseInt(System.console().readLine()) ;
      if (numAleatorio == numIntroducido){
        System.out.println("Has adivinado el numero enorabuena!!!");
        System.out.print("El numero era: "+numAleatorio);
      }else if(i < contador){
        System.out.println("Sigue adivinando el numero.");
        System.out.println("Te quedan "+(contador - i)+" intentos.");
        if (numAleatorio > numIntroducido){
          System.out.println("El numero es mayor al introducido");
        }else{
          System.out.println("El numero es menor al introducido");
        }
      }else if(i == contador){
        System.out.println("Te quedan "+(contador - i)+" intentos.");
        System.out.println("No has adivinado el numero :c");
        System.out.print("El numero era: "+numAleatorio);
      }
      
    }
  }
}


