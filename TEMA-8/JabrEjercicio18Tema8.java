import misfunciones.JabrFuncionesMatematicas;
public class JabrEjercicio18Tema8 {
    public static void main (String[] args) {
        System.out.print("Introduce un numero entero positivo: ");
        int decimal = Integer.parseInt(System.console().readLine()) ;
        System.out.print("El numero pasado a binario es : " + JabrFuncionesMatematicas.convierteBinario(decimal));
    }
}