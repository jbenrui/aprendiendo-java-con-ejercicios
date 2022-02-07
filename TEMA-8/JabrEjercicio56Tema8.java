public class JabrEjercicio56Tema8 {
    public static void main(String[] args) {
        int[][] a = {
        {45, 92, 14, 20, 25, 78},
        {35, 72, 24, 45, 42, 60},
        {32, 42, 64, 23, 41, 39},
        {98, 45, 94, 11, 18, 48}
        };
        for (int numero : corteza(a)) {
            System.out.print(numero + " "); //muestro los elementos del array unidimensional
        }

    }
    private static int[] corteza(int[][] n) { //paso como parametro el array bidimensional.
        int filas = n.length; //Guardo la longitud de las filas
        int columnas = n[0].length;//Guardo la longitud de las columnas
        int[] resultado = new int[2 * filas + 2 * columnas - 4]; //Calculo la longitud del array resultado que
        // es numero de filas en la corteza(2) * longitud de las mismas(variable que antes calcule.) + el numero de columnas en las cortezas(2),
        // * la longitud de la columna - 4 (1 posicion por cada columna y fila).
        int j = 0;
        // Fila superior
        for (int i = 0; i < columnas - 1; i++) { // - resto una para no llegar al final ya que este lo sacara el siguiente for.
            resultado[j++] = n[0][i]; //Saco la primera fila
        }
        // Columna derecha
        for (int i = 0; i < filas - 1; i++) {
            resultado[j++] = n[i][columnas - 1];//Saco la primera columna
        }
        // Fila inferior
        for (int i = columnas - 1; i > 0; i--) {
            resultado[j++] = n[filas - 1][i];//Saco la ultima fila
        }
        // Columna izquierda
        for (int i = filas - 1; i > 0; i--) {
            resultado[j++] = n[i][0];//Saco la ultima columna
        }
        return resultado; // devuelvo el array.
    }
}

