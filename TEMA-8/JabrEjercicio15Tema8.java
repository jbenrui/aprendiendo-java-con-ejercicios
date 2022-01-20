
import misfunciones.JabrFuncionesMatematicas;
public class JabrEjercicio15Tema8 {
    public static void main (String[] args) {
        for (int i = 0; i < 1000; i++){
            if (JabrFuncionesMatematicas.esPrimo(i)){
                System.out.print(i + " ");
            }
        }
    }
}