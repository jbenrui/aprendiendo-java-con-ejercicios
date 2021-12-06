/**
 * Ejercicio: 63
 * Realiza un programa que pinte dos pirámides rellenas hechas con asteriscos,
 * una al lado de la otra y separadas por un espacio en su base.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio63Tema5 {
  public static void main (String[] args) {
    System.out.print("Introduce la altura de la primera piramide por teclado: ");
    int alturaPiramide1 = Integer.parseInt(System.console().readLine()) ;
    System.out.print("Introduce la altura de la segunda piramide por teclado: ");
    int alturaPiramide2 = Integer.parseInt(System.console().readLine()) ;
    int espacioPiramide1 = alturaPiramide1-1;
    int espacioPiramide2 = alturaPiramide1;
    int linea=0;
    int lineaPiramide2=alturaPiramide1 - alturaPiramide2;
    int lineaPiramide1=alturaPiramide2 - alturaPiramide1;
    int base = 1;
    int basePiramide2=0;
    
    if (alturaPiramide1 >= alturaPiramide2){
      espacioPiramide1 = alturaPiramide1-1;
      espacioPiramide2 = alturaPiramide1;
      while (alturaPiramide1 > 0 ){
        /**Primera Piramide**/
        for (int a = 1; a <= espacioPiramide1; a++){
          System.out.print(" ");
          
        }
        
        for (int i = 0; i < base; i++){
          System.out.print("*");
        }
        /**Segunda Piramide**/
        if (linea >= lineaPiramide2){
          for (int a = 0; a <= espacioPiramide1; a++){
            System.out.print(" ");
          }
          for (int u = 0; u <= espacioPiramide2 -2 ; u++){
            System.out.print(" ");
          }
          for (int i = 0; i <= basePiramide2; i++){
            System.out.print("*");
          }
          basePiramide2+=2;
        }
        System.out.println(" ");
        alturaPiramide1--;
        linea++;
        espacioPiramide2--;
        espacioPiramide1--;
        base+=2;
      } 
    }else{
      basePiramide2=1;
      espacioPiramide1 = alturaPiramide1 -1;
      espacioPiramide2 = alturaPiramide2 -1;
      while (linea <= alturaPiramide2 ){
        if (linea < lineaPiramide1 ){
          for (int i = 1;i <= (alturaPiramide1*2)+2;i++){
            System.out.print(" ");
          }
        }else {
          for (int a = 1; a <= espacioPiramide1+1; a++){
          System.out.print(" ");
          
          }
          for (int i = 0;i < base;i++){
            System.out.print("*");
          }

          for (int j = 1;j <= espacioPiramide1 +2; j++){
            System.out.print(" ");
          }
          base+=2;
          espacioPiramide1--;
        }
        /**Segunda Piramide**/
        for (int a = 0; a <= espacioPiramide2; a++){
          System.out.print(" ");
          
        }
        
        for (int i = 0; i < basePiramide2; i++){
          System.out.print("*");
        }
        System.out.println(" ");
        espacioPiramide2--;
        basePiramide2+=2;
        linea++;
      } 
    }
  }
}
