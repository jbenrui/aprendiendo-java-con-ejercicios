import misfunciones.JabrFuncionesMatematicas;
public class JabrEjercicio54Tema8 {
    public static void main(String[] args){
        int[]a = { 714, 81, 9, 11};
        int[]b = { 6, 66, 666};
        int c = 345856;
        System.out.print("introduce un digito: ");
        int digito = Integer.parseInt(System.console().readLine()) ;
        System.out.println("ocurrencias (" + ocurrencias(digito,c) + ", a)");
        System.out.println("______________________________________________");
        System.out.print("introduce un digito: ");
        digito = Integer.parseInt(System.console().readLine()) ;
        System.out.println("ocurrencias (" + ocurrencias(digito,b) + ", a)");
    }
    public static int ocurrencias(int digito, int n) {
        int ocurrencia = 0;
        int numero = n;
        int cifra = 0;
        long voltear = JabrFuncionesMatematicas.voltea(numero);
        cifra = (int) (voltear % 10);
        while (voltear > 0){
            cifra = (int) (voltear % 10);
            if (cifra == digito){
                ocurrencia++;
            }
            voltear = voltear / 10;
            
        }
        return ocurrencia;
    }
    public static int ocurrencias(int digito, int[] n) {
        int repetido = 0;
        for (int a : n){
            repetido += ocurrencias(digito, n);
        }
        return repetido;
    }
}