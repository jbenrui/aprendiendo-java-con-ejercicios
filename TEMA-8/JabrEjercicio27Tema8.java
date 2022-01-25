import misfunciones.JabrFuncionesArrays;
import java.util.Scanner;
public class JabrEjercicio27Tema8 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tamaño del array:  ");
        int tamaño = Integer.parseInt(System.console().readLine()) ;
        System.out.print("Introduce minimo valor en el array: ");
        int minimo  = Integer.parseInt(System.console().readLine()) ;
        System.out.print("Introduce maximo valor en el array: ");
        int maximo  = Integer.parseInt(System.console().readLine()) ;
        System.out.println("_____________________________________________________________");
        int []array = JabrFuncionesArrays.generaArrayInt(tamaño, maximo, minimo);
        JabrFuncionesArrays.muestraArray(array);
        System.out.println("_____________________________________________________________");
        System.out.println(" ");
        System.out.println("Introduce las posiciones que vas ha rotar el array: ");
        System.out.print("El rango debe ser entre: 0  y "+(tamaño -1)+" .");
        int numPosiciones = sc.nextInt();
        System.out.println(" ");
        JabrFuncionesArrays.muestraArray(JabrFuncionesArrays.rotaIzquierdaArrayInt(array,numPosiciones));
    }
}
