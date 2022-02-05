import misfunciones.JabrFuncionesArrays;
public class JabrEjercicio53Tema8 {
    public static void main(String[] args){
        int[][] a = JabrFuncionesArrays.generaArrayBiInt(4, 6, 100, 1);
        JabrFuncionesArrays.muestraArrayBiInt(a);
        System.out.print("Introduce una posicion del array: ");
        int posicion = Integer.parseInt(System.console().readLine()) ;
        System.out.print("nEsimo(a, " + posicion + ") devuelve "+  nEsimo(a, posicion));
    }
    public static int nEsimo(int[][] n, int posicion) {
        int filas = n.length;
        int columnas = n[0].length;
        if ((posicion < 0) || (posicion > filas * columnas - 1)) { //Si la posicion es menor a 0 o mayor a las filas por columnas devolvera un -1
            return -1;
        } else {
            return n[posicion / columnas][posicion % columnas];// Divido la posicon entre las columnas para sacar el indice de las filas y hago el modulo de la posicion entre las columnas para sacar el indice de la columna.
        }
    }
}