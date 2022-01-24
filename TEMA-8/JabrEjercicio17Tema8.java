import misfunciones.JabrFuncionesConversiones;
public class JabrEjercicio17Tema8 {
    public static void main (String[] args) {
        System.out.print("Introduce un numero comprendido por 1 y 0 por teclado: ");
        int binario = Integer.parseInt(System.console().readLine()) ;
        System.out.println(" ");
        System.out.println("El numero pasado a decimal es : " + JabrFuncionesConversiones.convierteDecimal(binario));
    }
}
