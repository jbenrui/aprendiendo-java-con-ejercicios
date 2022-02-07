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
        System.out.println("______________________________________________");
        System.out.print("introduce un digito: ");
        digito = Integer.parseInt(System.console().readLine()) ;
        System.out.println("ocurrencias (" + ocurrencias(digito,a) + ", a)");
    }
    public static int ocurrencias(int digito, int n) {
        int ocurrencia = 0;
        while (n > 0){
            if ((n % 10) == digito){
                ocurrencia++;
            }
            n = n / 10;
            
        }
        return ocurrencia;
    }
    public static int ocurrencias(int digito, int[] a) {
        int ocurrencia = 0;
        for (int n : a) {
            ocurrencia += ocurrencias(digito, n);
        }
            return ocurrencia;
    }
}