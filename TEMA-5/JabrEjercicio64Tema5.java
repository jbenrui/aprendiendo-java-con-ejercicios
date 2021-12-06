/**
 * Ejercicio: 64
 * scribe un programa que pinte por pantalla un rectángulo hueco de 6 caracteres
 * de ancho por 3 de alto y, a continuación, un menú que permita agrandarlo,achi
 * -carlo o cambiar su orientación. Cada vez que el rectángulo se agranda, se in
 * -crementa en 1 tanto su anchura como su altura. Cuando se achica, se decremen
 * -ta en 1 su anchura y altura. Por último, cuando se cambia la orientación,los
 * valores de anchura y altura se intercambian.El valor mínimo de la altura o la
 * anchura es 2.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio64Tema5 {
  public static void main (String[] args) {
    System.out.println("El programa pinta por pantalla un rectángulo y el usuario puede interactuar.");
    int anchura=6;
    int altura=3;
    System.out.println("");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println("");
      
    int opcion = 0;
    while(opcion != 4){
      /**Cabeza del rectangulo **/
      for (int i = 0; i < anchura ; i++){
        System.out.print("*");
      }
      /**Cuerpo del rectangulo **/
      for (int i = 0; i < altura-2; i++ ){
        System.out.println("");
        System.out.print("*");
        for (int aux = 0; aux < (anchura - 2);aux++){
          System.out.print(" ");
        } 
        System.out.print("*");
      }
      System.out.println("");
      /**Base del rectangulo **/
      for (int i = 0; i < anchura; i++){
        System.out.print("*");
      }
      System.out.println("");
      
      System.out.println("1. Agrandarlo");
      System.out.println("2. Achicarlo");
      System.out.println("3. Cambiar la orientación");
      System.out.println("4. Salir");
      System.out.println("Indique qué quiere hacer con el rectángulo: ");
      opcion = Integer.parseInt(System.console().readLine());
      switch(opcion){
        case 1:
          altura++;
          anchura++;
        break;
        case 2:
          if((altura >= 2)&&(anchura>=2)){
            altura--;
            anchura--;
          }
        break;
        case 3:
          int aux= anchura;
          anchura=altura;
          altura=aux;
        break;
        default:
      }
    }
  }
}
