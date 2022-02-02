import misfunciones.JabrFuncionesArrays;
public class JabrEjercicio47Tema8 {
    public static void main(String[] args){
        System.out.print("Introduzca el tamño del array ");
        int tamaño = Integer.parseInt(System.console().readLine());
        int minimo = 1;
        int maximo = 10;
        int [] a = JabrFuncionesArrays.generaArrayInt(tamaño, maximo, minimo);
        System.out.print(convierteArrayEnString(a));
    }
    public static String convierteArrayEnString(int[] a){
        String r = "";
        for (int i = 0; i < a.length; i++){
            r += (a[i]);
        }
        return r;
    }
}

