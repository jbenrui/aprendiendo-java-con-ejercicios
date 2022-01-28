import misfunciones.JabrFuncionesArrays;
public class JabrEjercicio29Tema8 {
    public static void main(String[] args){
        int sizeX= 8;
        int sizeY= 8;
        System.out.print("Introduce minimo valor en el array: ");
        int minimo  = Integer.parseInt(System.console().readLine()) ;
        System.out.print("Introduce maximo valor en el array: ");
        int maximo  = Integer.parseInt(System.console().readLine()) ;
        System.out.println("________________________________________ ");
        int arrayBi [][] = JabrFuncionesArrays.generaArrayBiInt(sizeX, sizeY, maximo, minimo);
        JabrFuncionesArrays.muestraArrayBiInt(arrayBi);
    }
    
}
