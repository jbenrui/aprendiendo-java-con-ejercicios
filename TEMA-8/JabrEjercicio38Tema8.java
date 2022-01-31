import misfunciones.JabrFuncionesMatematicas;
import misfunciones.JabrFuncionesArrays;
public class JabrEjercicio38Tema8{
    public static void main (String[] args) {
        int tamaño = 10;
        int minimo = 1;
        int maximo = 100;
        int[] array = JabrFuncionesArrays.generaArrayInt(tamaño, maximo, minimo);

        JabrFuncionesArrays.muestraArray(filtraCapicuas(array));
    }
    public static int[] filtraCapicuas(int[] array){
        int[] filtraCapicua = new int[array.length];
        for (int i = 0; i < filtraCapicua.length; i++){
            if (JabrFuncionesMatematicas.esCapicua(array[i])){
                filtraCapicua[i] = array[i];
            }else{
                filtraCapicua[i] = -1;
            }
        }
        return filtraCapicua;
    }
}