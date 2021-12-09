/**
 * Ejercicio: 5
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 * 
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio05Tema7 {
  public static void main (String[] args) {
    
    System.out.print("Introduce 10 numeros y el programa te muestra el maximo y el minimo: ");
    int [] numero = new int[10];
    for (int i = 0; i < 10;i++){
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    int maximo=0;
    int minimo=0;
    int indice=0;
    while  (indice < 10){
      if (indice == 0 ){
        minimo=numero[indice];
      }else if (maximo <= numero[indice]){
        maximo=numero[indice];
        
      }else if (numero[indice] <= minimo){
        minimo=numero[indice];
      }
      indice++;
    }
    for (int i = 0; i < 10;i++){
      if (numero[i] >= maximo){
        System.out.print(maximo+" Maximo ");
        
      }else if (numero[i] <= minimo){
        System.out.print(minimo+" Minimo ");
      }else{
        System.out.print(numero[i]+" ");
      }
    }  
  }
}

