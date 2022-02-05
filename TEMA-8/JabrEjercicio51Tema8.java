import misfunciones.JabrFuncionesArrays;
import misfunciones.JabrFuncionesMatematicas;
public class JabrEjercicio51Tema8 {
    public static void main(String[] args){
        int[] array = JabrFuncionesArrays.generaArrayInt(10, 100, 2);
        JabrFuncionesArrays.muestraArray(array);
        System.out.println("");
        int numEnArray = 0;
        for (int i = 0; i < array.length; i++){
            numEnArray = array[i];
            JabrFuncionesMatematicas.esPrimo(numEnArray);
            JabrFuncionesMatematicas.esCapicua(numEnArray);
            if (JabrFuncionesMatematicas.esPrimo(numEnArray)){
                System.out.print("El "+numEnArray+ " es primo ");
            }else{
                System.out.print("El "+numEnArray+ " no es primo ");
            }
            if (JabrFuncionesMatematicas.esCapicua(numEnArray)){
                System.out.println("y es capicúa");
            }else{
                System.out.println("y no es capicúa");
            }
        }
    }
}
