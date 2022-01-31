import misfunciones.JabrFuncionesArrays;
public class JabrEjercicio34Tema8 {
    public static void main(String[] args){
        int sizeX= 8;
        int sizeY= 8;
        int minimo  = 1;
        int maximo  = 10;
        System.out.println("________________________________________ ");
        System.out.print("Introduce un fila del ( 0 a "+(sizeX -1) +" ): ");
        int fila  = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce un columna del ( 0 a "+(sizeY -1)+" ): ");
        int columna  = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce la direccion de la diagonal (nose o neso): ");
        String direccion  = System.console().readLine();
        
        int arrayBi [][] = JabrFuncionesArrays.generaArrayBiInt(sizeX, sizeY, maximo, minimo);
        JabrFuncionesArrays.muestraArrayBiInt(arrayBi);
        System.out.println("__________________________________________________");
        JabrFuncionesArrays.muestraArray(JabrFuncionesArrays.diagonal(arrayBi,fila,columna,direccion));
    }
}
