import misfunciones.JabrFuncionesMatematicas;
public class JabrEjercicio16Tema8 {
    public static void main (String[] args) {
        for (int i = 1; i <= 99999; i++){
            if (JabrFuncionesMatematicas.esCapicua(i)){
                System.out.print(i + " ");
            }
        }
    }
}