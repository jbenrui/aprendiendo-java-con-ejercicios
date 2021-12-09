/**
 * Ejercicio: 8
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a
 * base de asteriscos o cualquier otro carácter.
 * 
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio08Tema7 {
  public static void main (String[] args) {

    System.out.print("Introduce la temperatura media de los 12 meses de un año\n");
    int [] temperaturaMedia = new int[12];
    for (int i = 0; i < 12;i++){
      System.out.printf("%3d º mes: ",(i+1));
      temperaturaMedia[i] = Integer.parseInt(System.console().readLine());
    }
    int indice = 0;
    while  (indice < 12){
      switch (indice){
        case 0:
        System.out.printf("%10s ","Enero");
        break;
        case 1:
        System.out.printf("%10s ","Febrero");
        break;
        case 2:
        System.out.printf("%10s ","Marzo");
        break;
        case 3:
        System.out.printf("%10s ","Abril");
        break;
        case 4:
        System.out.printf("%10s ","Mayo");
        break;
        case 5:
        System.out.printf("%10s ","Junio");
        break;
        case 6:
        System.out.printf("%10s ","Julio");
        break;
        case 7:
        System.out.printf("%10s ","Agosto");
        break;
        case 8:
        System.out.printf("%10s ","Septiembre");
        break;
        case 9:
        System.out.printf("%10s ","Octubre");
        break;
        case 10:
        System.out.printf("%10s ","Noviembre");
        break;
        case 11:
        System.out.printf("%10s ","Diciembre");
        break;
        
      }
      for (int i = 0; i < temperaturaMedia[indice]; i++){
        System.out.print("□ ");
      }
      System.out.println("");
      System.out.println("");
      indice++;
    }
 
  }
}
