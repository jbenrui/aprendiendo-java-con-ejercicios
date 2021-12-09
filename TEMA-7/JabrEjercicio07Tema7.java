/**
 * Ejercicio: 7
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces por
 * teclado dos valores y a continuación cambiará todas las ocurrencias del primer
 * valor por el segundo en la lista generada anteriormente. Los números que se
 * han cambiado deben aparecer entrecomillados.
 * 
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio07Tema7 {
  public static void main (String[] args) {
    
    System.out.print("el programa genera 100 números aleatorios del 0 al 20 y que los muestre por pantalla separados por espacios. \n");
    int [] lista = new int[100];
    for (int i = 0; i < 100;i++){
      lista[i] = (int)(Math.random()*20);
      System.out.print(lista[i]+" ");
      
    }
    System.out.print("\n\nIntroduce 2 numeros y el programa rota los elementos de ese array: \n");
    int [] numeroSustituto = new int[2];
    for (int i = 0; i < 2;i++){
      numeroSustituto[i] = Integer.parseInt(System.console().readLine());
    }
    int indice = 0;
    while  (indice < 100){
      if (lista[indice] == numeroSustituto[0] ){
        System.out.print("\""+numeroSustituto[1]+"\" ");
      }else{
        System.out.print(lista[indice]+" ");
      }
      indice++;
    }
 
  }
}

