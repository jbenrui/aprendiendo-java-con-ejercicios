/**
 * Ejercicio: 28
 * Realiza una versión del programa “Hola mundo”.Se debe mostrar la palabra HOLA
 * (todo en mayúsculas) hecha con asteriscos.La altura de la palabra debe ser un
 * número impar generado al azar entre el 3 y el 13 ambos incluidos.Los palos ho
 * -rizontales de la H y de la A están justo a la mitad de la altura. La anchura
 * de las letras siempre es la misma. Aunque, en este caso , sólo hay 6 posibles
 * HOLAs de distinta altura,el programa debe hacerse de tal forma que sea muy fá
 * -cil adaptarlo a otros rangos de altura, por ej. entre 7 y 33. Por tanto, no 
 * se da por válido escribir 6 sentencias if, cada una pintando la correspondien
 * te figura completa.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio28Tema6 {
  public static void main (String[] args) {
    System.out.println("El programa pinta el mensaje HOLA con una altura aleatoria.");
    int altura=(int)(Math.random()* 13)+3;
    if ((altura %2 )==0){
      altura++;
    }
    for (int i = 1; i <= altura; i++ ){
      if (i == 1){
        System.out.print("*    *   ****    *        **** ");
      }else if (i < altura /2 +1){
        System.out.print("*    *  *    *   *       *    * ");
      }else if (i == altura /2 +1){
        System.out.print("******  *    *   *       ****** ");
      }else if ((i > altura /2)&&(i < altura)){
        System.out.print("*    *  *    *   *       *    * ");
      }else if (i == altura ){
        System.out.print("*    *   ****    ******  *    * ");
      }
      
      System.out.println("");
    }
  }
}
