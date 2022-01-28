import misfunciones.JabrFuncionesArrays;
public class JabrEjercicio30Tema8 {
    public static void main(String[] args){
        int sizeX= 8;
        int sizeY= 8;
        int minimo  = 1;
        int maximo  = 10;
        System.out.println("________________________________________ ");
        int arrayBi [][] = JabrFuncionesArrays.generaArrayBiInt(sizeX, sizeY, maximo, minimo);
        System.out.print("Introduce la fila del array corprendido entre ( 0 y "+sizeX+" ): ");
        int fila  = Integer.parseInt(System.console().readLine()) ;
        JabrFuncionesArrays.filaDeArrayBiInt(arrayBi,fila);
    }
}
