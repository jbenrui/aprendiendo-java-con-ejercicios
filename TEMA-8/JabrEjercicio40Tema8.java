import misfunciones.JabrFuncionesMatematicas;
import misfunciones.JabrFuncionesArrays;
public class JabrEjercicio40Tema8 {
    public static void main (String[] args) {
        int tamaño = 10;
        int minimo = 1;
        int maximo = 100;
        int[] array = JabrFuncionesArrays.generaArrayInt(tamaño, maximo, minimo);
        JabrFuncionesArrays.muestraArray(array);
        System.out.println("");
        JabrFuncionesArrays.muestraArray(filtraCon7(array));
    }
    public static int[] filtraCon7(int[] array){
        int[] filtra7 = new int[array.length];
        long cifra = 0;
        for (int i = 0; i < filtra7.length; i++){
            long voltear = JabrFuncionesMatematicas.voltea(array[i]);
            while (voltear > 0 ){
                cifra = (voltear % 10);
                    if (cifra == 7){
                        filtra7[i] = array[i];
                    }
                voltear = voltear / 10;
            }
            
        }
        return filtra7;
    }
}
