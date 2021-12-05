/**
 * Ejercicio: 29
 * Realiza un programa que muestre la previsión del tiempo para mañana en
 * Málaga. Las temperaturas máxima y mínima se deben generar de forma
 * aleatoria entre los intervalos máximos y mínimos absolutos medidos en las
 * últimas décadas para cada estación. La probabilidad de que esté soleado
 * o nublado en cada estación se proporciona a continuación. Obviamente, la
 * temperatura mínima deberá ser menor o igual que la temperatura máxima.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio29Tema6 {
  public static void main (String[] args) {
    System.out.println("El programa pinta el mensaje HOLA con una altura aleatoria.");
    int temperatura1=0; 
    int temperatura2=0;
    int probSoleadoNublado=(int)(Math.random()*10);
    String estadoCielo="";
    System.out.println("1. Primavera");
    System.out.println("2. Verano");
    System.out.println("3. Otoño");
    System.out.println("4. Invierno");
    System.out.print("Seleccione la estación del año (1-4): ");
    int estacion = Integer.parseInt(System.console().readLine()) ;
    System.out.println("Previsión del tiempo para mañana");
    System.out.println("--------------------------------");
    switch (estacion){
      case 1:
        temperatura1 =(int)(Math.random()* 16 + 15);
        temperatura2 =(int)(Math.random()* 16 + 15);
        switch(probSoleadoNublado){
          case 1:
            estadoCielo="Nublado";
          break;
          case 2:
            estadoCielo="Nublado";
          break;
          case 3:
            estadoCielo="Nublado";
          break;
          case 4:
            estadoCielo="Nublado";
          break;
          default:
            estadoCielo="Soleado";
          break;
        }
      break;
      case 2:
        temperatura1 =(int)(Math.random()* 21 + 25);
        temperatura2 =(int)(Math.random()* 21 + 25);
        switch(probSoleadoNublado){
          case 1:
            estadoCielo="Nublado";
          break;
          case 2:
            estadoCielo="Nublado";
          break;
          default:
            estadoCielo="Soleado";
          break;
        }
      break;
      case 3:
        temperatura1 =(int)(Math.random()* 11 + 30);
        temperatura2 =(int)(Math.random()* 11 + 30);
        switch(probSoleadoNublado){
          case 1:
            estadoCielo="Nublado";
          break;
          case 2:
            estadoCielo="Nublado";
          break;
          case 3:
            estadoCielo="Nublado";
          break;
          case 4:
            estadoCielo="Nublado";
          break;
          default:
            estadoCielo="Soleado";
          break;
        }
      break;
      case 4:
        temperatura1 =(int)(Math.random()* 25);
        temperatura2 =(int)(Math.random()* 25);
        switch(probSoleadoNublado){
          case 1:
            estadoCielo="Soleado";
          break;
          case 2:
            estadoCielo="Soleado";
          break;
          default:
            estadoCielo="Nublado";
          break;
        }
      break;
      default:
      
    }
    if (temperatura1 <= temperatura2){
      System.out.println("Temperatura mínima: "+temperatura1);
      System.out.println("Temperatura maxima: "+temperatura2);
    }else if (temperatura2 <= temperatura1){
      System.out.println("Temperatura mínima: "+temperatura2);
      System.out.println("Temperatura maxima: "+temperatura1);
    }
    temperatura2 =(int)(Math.random()* 45)+25;
  }
}
