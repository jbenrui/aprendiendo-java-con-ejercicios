package misfunciones;

public class JabrFuncionesArrays {
    public static int[] generaArrayInt(int tamaño, int maximo, int minimo){

        int[] array = new int[tamaño];

        for (int i = 0 ; i < tamaño ; i++){
            array[i] = (int)(Math.random()*(maximo - minimo))+minimo; //Si restas maximo con el minimo reduces el intervalo.
        }
        return array;
    }
    public static void muestraArray(int array[]){
        for (int i = 0 ; i < array.length ; i++){
            System.out.println("Array nº " + i + ": " + array[i]+" ");
        }
    }
    public static int minimoArrayInt(int array[]){
        int minimo=0;
        int indice=0;
        while  (indice < array.length){
            if (indice == 0 ){
                minimo=array[indice];
            }else if (array[indice] <= minimo){
                minimo=array[indice];
            }
            indice++;
        }
        return minimo;
    }
}
