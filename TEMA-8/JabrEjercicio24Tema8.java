import misfunciones.JabrFuncionesArrays;
import java.util.Scanner;
public class JabrEjercicio24Tema8 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tamaño del array:  ");
        int tamaño = Integer.parseInt(System.console().readLine()) ;
        System.out.print("Introduce minimo valor en el array: ");
        int minimo  = Integer.parseInt(System.console().readLine()) ;
        System.out.print("Introduce maximo valor en el array: ");
        int maximo  = Integer.parseInt(System.console().readLine()) ;
        System.out.println("_____________________________________________________________");
        System.out.println("");
        System.out.print("Introduce un numero para ver si esta en el array: ");
        int numeroIntroducido = sc.nextInt();
        int []array = JabrFuncionesArrays.generaArrayInt(tamaño, maximo, minimo);
        JabrFuncionesArrays.muestraArray(array);
        System.out.print("El numero "+ numeroIntroducido);
        JabrFuncionesArrays.estaEnArrayInt(array,numeroIntroducido);
    }
}
