/**
 * Ejercicio: 9
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 * 
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio09Tema7 {
  public static void main (String[] args) {
    
    System.out.print("Introduce 8 numeros y el programa te muestra el los impares y pares:\n");
    int [] numero = new int[8];
    for (int i = 0; i < 8;i++){
      System.out.printf("%2dº numero: ",(i+1));
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    int indice = 0;
    while  (indice < 8){
      if ((numero[indice] % 2)== 0){
        System.out.print(numero[indice]+"Par ");
        
      }else {
        System.out.print(numero[indice]+"Impar ");
      }
      indice++;
    } 
  }
}

