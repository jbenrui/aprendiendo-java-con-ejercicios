import misfunciones.JabrFuncionesArrays;
public class JabrEjercicio32Tema8 {
    public static void main(String[] args){
        int sizeX= 8;
        int sizeY= 8;
        int minimo  = 1;
        int maximo  = 10;
        System.out.println("________________________________________ ");
        int arrayBi [][] = JabrFuncionesArrays.generaArrayBiInt(sizeX, sizeY, maximo, minimo);
        System.out.print("Introduce un numero y te dire su posicion en el array (1 - 10) : ");
        int numeroEnArray  = Integer.parseInt(System.console().readLine()) ;
        JabrFuncionesArrays.muestraArray(JabrFuncionesArrays.coordenadasEnArrayBiInt(arrayBi,numeroEnArray));
    }
}