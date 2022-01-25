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
    public static int maximoArrayInt(int array[]){
        int max=0;
        int indice=0;
        while  (indice < array.length){
            if (indice == 0 ){
                max=array[indice];
            }else if (array[indice] >= max){
                max=array[indice];
            }
            indice++;
        }
        return max;
    }
    public static int mediaArrayInt(int array[]){
        int media=0;
        for (int i = 0; i < array.length;i++){
            media = media + array[i];
        }
        media /= array.length;
        return media;
    }
    public static void estaEnArrayInt(int array[],int numeroIntroducido){
        int contadorNum = 0;
        for (int i = 0; i < array.length;i++){
            if (numeroIntroducido == array[i]){
                contadorNum++;
            }
        }
        if (contadorNum > 0){
            System.out.print(" Esta en el array");
        }else{
            System.out.print(" NO esta en el array");
        }
    }
    public static int posicionEnArray(int array[],int numeroIntroducido){
        for (int i = 0; i < array.length;i++){
            if (numeroIntroducido == array[i]){
                return i;
            }
        }
        return -1;
    }
    public static int[] volteaArrayInt(int array[]){
        int [] arrayVolteado = new int [array.length];
        for (int i= 0; i < arrayVolteado.length; i++){
            arrayVolteado[i] = array[arrayVolteado.length -1 -i];
            //Ej.: en un array de 10 elementos, arrayVolteado[0] = array[arrayVolteado.lenght = 10, 10 - 1 - 0 = 9], arrayVolteado[1] = array[8 (i = 2)]
        }
        return arrayVolteado;
    }
    public static int[] rotaDerechaArrayInt(int array[], int numPosicion){
        int [] arrayRotado = new int [array.length];
        for (int i= 0; i < arrayRotado.length; i++){
            if (i < numPosicion){
                arrayRotado[i] = array[(array.length -numPosicion) +i]; //(en un array de 10)Si el indice es menor a la posicion, guardo la posicion de los numeros , para ello resto la longitud del array - las posiciones y sumo el indice. 
            }else {
                arrayRotado[i] = array[i -numPosicion];//Esto es para que el rango se reduzca y asi solo coger los indicados.
            }
            
            
        }
        return arrayRotado;
    }
    public static int[] rotaIzquierdaArrayInt(int array[], int numPosiciones){
        int numPosicion = array.length - numPosiciones;
        return JabrFuncionesArrays.rotaDerechaArrayInt(array, numPosicion);
    }
}
