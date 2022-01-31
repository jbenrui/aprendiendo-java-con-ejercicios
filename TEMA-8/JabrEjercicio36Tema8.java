import misfunciones.JabrFuncionesMatematicas;
import misfunciones.JabrFuncionesArrays;
public class JabrEjercicio36Tema8 {
    public static void main (String[] args) {
        int tamaño = 10;
        int minimo = 1;
        int maximo = 100;
        int[] array = JabrFuncionesArrays.generaArrayInt(tamaño, maximo, minimo);

        JabrFuncionesArrays.muestraArray(filtraPrimos(array));
    }
    public static int[] filtraPrimos(int[] array){
        int[] filtraPrimo = new int[array.length];
        for (int i = 0; i < filtraPrimo.length; i++){
            if (JabrFuncionesMatematicas.esPrimo(array[i])){
                filtraPrimo[i] = array[i];
            }else{
                filtraPrimo[i] = -1;
            }
        }
        return filtraPrimo;

    }
}
