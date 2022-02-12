public class bordeHomogeneo {
    public static void main (String[] args){
        int[][] array = new int[5][5];
        array[0][0] = 0; 
        array[0][1] = 0; 
        array[0][2] = 0; 
        array[0][4] = 0; 
        array[1][0] = 0;
        array[1][1] = 3;
        array[1][2] = 5;
        array[1][3] = 4;    
        array[1][4] = 0;       
        array[2][0] = 0; 
        array[2][1] = 5;
        array[2][2] = 6;  
        array[2][3] = 6;  
        array[2][4] = 0;  
        array[3][0] = 0; 
        array[3][1] = 7;
        array[3][2] = 8;  
        array[3][3] = 9;  
        array[3][4] = 0;  
        array[4][0] = 0; 
        array[4][1] = 0;
        array[4][2] = 0;  
        array[4][3] = 0;  
        array[4][4] = 0; 
        muestraArrayBiInt(array);
        
        if (tieneBordeHomogeneo(array)){
            System.out.println("Tiene el borde Homogeneo"); //Si es verdadero :
        }else{
            System.out.println("NO tiene el Borde Homogeo");//Si es falso :
        }
    }
    public static void muestraArrayBiInt(int arrayBi[][]){
        for (int i = 0 ; i < arrayBi.length ; i++){
            for (int j = 0; j < arrayBi[0].length; j++){
                System.out.print(arrayBi[i][j]+" ");
            }
            System.out.println("");
        }
    }
    private static boolean tieneBordeHomogeneo(int[][] array) { //paso como parametro el array bidimensional.
        int filas = array.length; //Guardo la longitud de las filas
        int columnas = array[0].length;//Guardo la longitud de las columnas
        int[] resultado = new int[2 * filas + 2 * columnas - 4]; //Calculo la longitud del array resultado que
        // es numero de filas en la corteza(2) * longitud de las mismas(variable que antes calcule.) + el numero de columnas en las cortezas(2),
        // * la longitud de la columna - 4 (1 posicion por cada columna y fila).
        int j = 0;
        // Fila superior
        for (int i = 0; i < columnas - 1; i++) { // - resto una para no llegar al final ya que este lo sacara el siguiente for.
            resultado[j++] = array[0][i]; //Saco la primera fila
        }
        // Columna derecha
        for (int i = 0; i < filas - 1; i++) {
            resultado[j++] = array[i][columnas - 1];//Saco la primera columna
        }
        // Fila inferior
        for (int i = columnas - 1; i > 0; i--) {
            resultado[j++] = array[filas - 1][i];//Saco la ultima fila
        }
        // Columna izquierda
        for (int i = filas - 1; i > 0; i--) {
            resultado[j++] = array[i][0];//Saco la ultima columna
        }
        boolean BordeHomogeo = true;
        int indice = 0;
        while ((indice < resultado.length)&&(BordeHomogeo)){ // Mientras el indice sea menor a la longitud del array resultado y sea verdadero
            if (resultado[indice++] != 0){ //Compruebo mientras recorro el array que todos sean 0, y si hay algun otro numero devolvera false
                BordeHomogeo = false;//Por lo que rompera el bucle
            }
        }

        return BordeHomogeo; // devuelvo si es verdadero o falso


    }
}
