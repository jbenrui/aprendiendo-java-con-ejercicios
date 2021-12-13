/**
 * Ejercicio: 22
 * Realiza un programa que sea capaz de recolocar los números de un array de fuera
 * hacia adentro.En primer lugar,el programa pedirá al usuario el tamaño del array.
 * A continuación generará un array con ese tamaño con números enteros aleatorios 
 * entre 0 y 200 ambos incluidos. Seguidamente el programa irá colocando desde fuera
 * hacia adentro los números de tal forma que el primero se coloca en la primera pos
 * -ición, el segundo en la última, el tercero en la segunda, el cuarto en la penúlt
 * -ima, el quinto en la tercera, en sexto en la antepenúltima, etc. Se debe mostrar
 * por pantalla tanto el array original como el array resultado.
 * 
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio22Tema7 {
  public static void main (String[] args) {
    System.out.print("Introduzca el tamaño del array: ");
    int tamaño = Integer.parseInt(System.console().readLine());
    System.out.println("Array original: ");
    System.out.print("Indice ");
    int [] numero = new int[tamaño];
     for (int i = 0; i < tamaño;i++){
      System.out.printf(" %3d|",i);
    }
    System.out.println(" ");
    System.out.print("Valor  ");
    for (int i = 0; i < tamaño;i++){
      numero[i] = (int)(Math.random()*201);
      System.out.printf(" %3d|",numero[i]);
    }
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Array resultado: ");
    System.out.print("Indice ");
     for (int i = 0; i < tamaño;i++){
      System.out.printf(" %3d|",i);
    }
    System.out.println(" ");
    System.out.print("Valor  ");
    System.out.printf(" %3d|",numero[0]);
    int [] numerosHaciaDentro = new int[tamaño];
    int [] numerosHaciaFuera = new int[tamaño];
    int indice2=0;
    int indice3=0;
    for (int i = 0; i < tamaño; i++){
      switch (i){
        case 0:
        break;
        default:
        //Los numeros que sean pares se mostraran de menor a mayor ("Hacia Dentro")
          if ((numero[i]%2)==0){
            numerosHaciaDentro[indice2]=numero[i];
            indice2++;
          }else{
        //Y los que sean impares hacia fuera de mayor a menor 
            numerosHaciaFuera[indice3]=numero[i];
            indice3++;
          }
        break;
      }
    }
    
    /** Primero muestro los numeros pares de menor a mayor **/
    for (int i = 0; i < indice2; i++){
      System.out.printf(" %3d|",numerosHaciaDentro[i]);
    }
    /** Primero muestro los numeros pares de mayor a menor **/
    for (int i = indice3 -1; i >= 0; i--){
      System.out.printf(" %3d|",numerosHaciaFuera[i]);
    }
  }
}


