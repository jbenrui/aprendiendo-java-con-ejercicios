import misfunciones.JabrFuncionesArrays;
public class JabrEjercicio33Tema8 {
    public static void main(String[] args){
        int sizeX= 8;
        int sizeY= 8;
        int minimo  = 10;
        int maximo  = 100;
        System.out.println("________________________________________ ");
        int arrayBi [][] = JabrFuncionesArrays.generaArrayBiInt(sizeX, sizeY, maximo, minimo);
        JabrFuncionesArrays.muestraArrayBiInt(arrayBi);
        JabrFuncionesArrays.esPuntoDeSilla(arrayBi);
    }
}
