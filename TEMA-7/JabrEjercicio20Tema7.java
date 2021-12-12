/**
 * Ejercicio: 20
 * Implementa un programa que calcule la denominación ordinal de los reyes de
 * una secuencia histórica. El programa solicitará la cantidad de reyes que se
 * van a introducir, y a continuación recibirá los nombres de los reyes. Prese
 * -ntará por pantalla dichos nombres, pero colocándoles el ordinal correspond
 * -iente. Así,por ejemplo, si hay dos Felipes en los nombres de los reyes, el
 * primero debería aparecer como Felipe 1º y el segundo como Felipe 2º.
 * 
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio20Tema7 {
  public static void main (String[] args) {
    System.out.print("Introduzca el número total de nombres de reyes: ");
    int numReyes = Integer.parseInt(System.console().readLine());
    String [] nomRey = new String[numReyes];
    int [] auxiliar = new int[numReyes];
    System.out.print("Vaya introduciendo los nombres de los reyes y pulsando INTRO. \n");
    for (int i = 0; i < numReyes;i++){
      nomRey[i] = System.console().readLine();
    }
    int contadorRey=0;
    for (int i = 0; i < numReyes  ;i++){
      for (int indice = 0; indice < numReyes;indice++){
        if (nomRey[i].equals(nomRey[indice])){
          if (i == 0){
            contadorRey= i +1;
            auxiliar[i]=contadorRey= i +1;
          }else{
            auxiliar[i]=i;
          }
        }
      }
    }
    System.out.println("Los reyes introducidos son: ");
    for (int i = 0; i < numReyes;i++){
      System.out.println(nomRey[i]+" "+auxiliar[i]+"º");
    }
  }
}
