import misfunciones.JabrFuncionesArrays;
public class JabrEjercicio50Tema8 {
    public static void main(String[] args){
        System.out.print("Introduzca el tamño del array ");
        int tamaño = Integer.parseInt(System.console().readLine());
        int minimo = 1;
        int maximo = 10;
        int [] a = JabrFuncionesArrays.generaArrayInt(tamaño, maximo, minimo);
        JabrFuncionesArrays.muestraArray(a);
        System.out.println(" ");
        int [] b = JabrFuncionesArrays.generaArrayInt(tamaño, maximo, minimo);
        JabrFuncionesArrays.muestraArray(b);
        System.out.println(" ");
            JabrFuncionesArrays.muestraArray((mezcla(a,b)));
    }
    public static int[] mezcla(int[] a, int[] b){
        int[] r = new int[(a.length + b.length)];
        int posicion = 0;
        int indicea= 0;
        int indiceb= 0;
        while (posicion <= r.length){
            r[posicion] = a[indicea];
            
            r[posicion] = b[indiceb];
            indicea++;
            indiceb++;
            posicion++;
        }
        return r;
    }
}
