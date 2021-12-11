/**
 * Ejercicio: 15
 * Un restaurante nos ha encargado una aplicación para colocar a los clientes en
 * sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales(mesa
 * llena). Cuando llega un cliente se le pregunta cuántos son. De momento el pro
 * -grama no está preparado para colocar a grupos mayores a 4, por tanto , si un
 * cliente dice por ejemplo que son un grupo de 6 ,  el programa dará el mensaje
 * “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e
 *  intente de nuevo”. Para el grupo que llega, se busca siempre la primera mesa
 * libre (con 0 personas). Si no quedan mesas libres, se busca donde haya un hue
 * -co para todo el grupo, por ejemplo si el grupo es de dos personas , se podrá
 * colocar donde haya una o dos personas. Inicialmente, las mesas se cargan con 
 * valores aleatorios entre 0 y 4. Cada vez que se sientan nuevos clientes se de
 * be mostrar el estado de las mesas. Los grupos no se pueden romper aunque haya
 * huecos sueltos suficientes. El funcionamiento del programa se ilustra a conti
 * nuación:
 * 
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio15Tema7 {
  public static void main (String[] args) {
    
    int [] ocupacion = new int[10];
    for (int i = 0; i < 10;i++){
      ocupacion[i] = (int)(Math.random()*5);
    }
    boolean estaOcupada = true;
    boolean sentado = true;
    int clientes = 1;
    while ( clientes > 0){
      /**Muestra el Indice**/
      System.out.println("\n┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
      System.out.print("│Mesa nº: ");
      for (int i = 0; i < 10;i++){
        System.out.printf("| %2d ",i+1);
      }
      System.out.println("│\n├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
      System.out.print("│Ocupación");
      
      /**Muestra el Valor del Array Inicial**/
      int numMesa = 0;
      while  (numMesa < 10){
        
        System.out.printf("| %2d ",ocupacion[numMesa]);
        numMesa++;
      }
      System.out.println("│\n└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
      System.out.println("");
      System.out.println("");
      /**Recorro las mesas en busca de alguna vacia**/
      numMesa=0;
      estaOcupada = true;
      while ( numMesa < 10){
        if ( ocupacion[numMesa] == 0){
          estaOcupada=false;
        }
        numMesa++;
      }
      System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): \n");
      clientes = Integer.parseInt(System.console().readLine());
      if (clientes > 4){
        System.out.print("“Lo siento, no admitimos grupos de "+clientes+", haga grupos de 4 personas como máximo e intente de nuevo” \n");
        
      }else if ( clientes < 0){
        System.out.print("Gracias,Hasta Pronto \n");
      }else if (!estaOcupada){
        numMesa=0;
        sentado = true;
        while ( sentado ){
          if ( ocupacion[numMesa] == 0){
            ocupacion[numMesa]=ocupacion[numMesa]+clientes;
            System.out.print("Por favor, siéntense en la mesa número "+(numMesa +1)+"\n");
            sentado=false;
          }
          numMesa++;
        }
      /**Si no hay mesas vacia**/
      }else if (estaOcupada){
        numMesa=0;
        boolean hueco = false;
        int numHueco=0; 
        while (numMesa < 10){
          if ( (clientes + ocupacion[numMesa]) <= 4 ){
            hueco = true;
            numHueco=numMesa+1;
          }
          numMesa++;
        }
        if (hueco){
          ocupacion[numHueco]+=clientes;
          System.out.print("Tendrán que compartir mesa. Por favor, siéntense en la mesa número "+numHueco+"\n");
        }else{
          System.out.println("Lo siento, en estos momentos no queda sitio.");
        }
      
      }
    }
  }
}
