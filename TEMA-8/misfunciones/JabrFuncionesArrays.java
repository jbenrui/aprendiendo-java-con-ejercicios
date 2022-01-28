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
            System.out.print(array[i]+" ");
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
    //A partir de aqui genero arrays bidimensionales
    public static int[][] generaArrayBiInt(int sizeX, int sizeY, int maximo , int minimo){

        int[][] array = new int[sizeX][sizeY];

        for (int i = 0 ; i < sizeX ; i++){
            for (int j = 0; j < sizeY; j++){
                array[i][j] = (int)(Math.random()*(maximo - minimo))+minimo; //Si restas maximo con el minimo reduces el intervalo.
            }
            
        }
        return array;
    }
    public static int filasArrayIntBi(int x[][]) {
        return x.length;
    }
    public static int columnasArrayIntBi(int x[][]) {
        return x[0].length;
    }

    public static void muestraArrayBiInt(int arrayBi[][]){
        for (int i = 0 ; i < JabrFuncionesArrays.filasArrayIntBi(arrayBi) ; i++){
            for (int j = 0; j < JabrFuncionesArrays.columnasArrayIntBi(arrayBi); j++){
                System.out.print(arrayBi[i][j]+" "); //Si restas maximo con el minimo reduces el intervalo.
            }
            System.out.println("");
        }
    }
    public static void filaDeArrayBiInt(int arrayBi[][],int fila){
            for (int j = 0; j < JabrFuncionesArrays.columnasArrayIntBi(arrayBi); j++){
                System.out.print(arrayBi[fila][j]+" ");
            }
            System.out.println("");
    }
    public static void columnaDeArrayBiInt(int arrayBi[][],int columna){
        for (int j = 0; j < JabrFuncionesArrays.filasArrayIntBi(arrayBi); j++){
            System.out.println(arrayBi[j][columna]+" ");
        }
        System.out.println("");
    }
    public static int[] coordenadasEnArrayBiInt(int arrayBi[][],int numeroEnArray){
        int contador = 0;
        for (int i = 0 ; i < JabrFuncionesArrays.filasArrayIntBi(arrayBi) ; i++){
            for (int j = 0; j < JabrFuncionesArrays.columnasArrayIntBi(arrayBi); j++){
                if (numeroEnArray == arrayBi[i][j]){
                    contador++;
                    if (contador == 1){
                        int [] cordenadas = { i , j};
                        return cordenadas;
                    }
                }
            }
            System.out.println("");
        }
        int[] cordenadas = { -1 , -1};
        return cordenadas;
    }
    public static void esPuntoDeSilla(int arrayBi[][]){
        int[] array = new int[arrayBi.length];
        for (int indice= 0; indice < JabrFuncionesArrays.columnasArrayIntBi(arrayBi); indice++){
            for (int jindice = 0; jindice < JabrFuncionesArrays.columnasArrayIntBi(arrayBi); jindice++){
                array[indice]=arrayBi[indice][jindice];
            }
        }
        int minimoEnfila = -1;
        for (int i = 0 ; i < array.length ; i++){
            minimoEnfila = JabrFuncionesArrays.minimoArrayInt(array);
        }
        int tamaño = columnasArrayIntBi(arrayBi);
        int[] arraycolumna = new int[tamaño];
        for (int t= 0; t < JabrFuncionesArrays.columnasArrayIntBi(arrayBi); t++){
            for (int v = 0; v < JabrFuncionesArrays.columnasArrayIntBi(arrayBi); v++){
                arraycolumna[v]=arrayBi[v][t];
            }
        }
        int maximoEnColumna = -1;
        for (int j = 0; j < arraycolumna.length; j++){
            maximoEnColumna = JabrFuncionesArrays.maximoArrayInt(arraycolumna);
        }
        if(minimoEnfila == maximoEnColumna){
            System.out.println("Es PUNTO DE SILLA !!!");
        }else{
            System.out.println("no hay punto de silla");
        }
    }
}
