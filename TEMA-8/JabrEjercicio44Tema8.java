public class JabrEjercicio44Tema8 {
    public static void main(String[] args){
        System.out.print("Introduzca la altura de la figura: ");
        int altura = Integer.parseInt(System.console().readLine());
        int numEspacios = 0;
        base(altura);
            for (int i = altura -2; i > 0 ; i--){
                espaciosDelante(numEspacios);
                linea(altura);
                altura--;
                numEspacios++;
            }
            espaciosDelante(numEspacios);
            System.out.print("*");
    }
    public static String espaciosDelante(int numEspacios){
        for (int i = 0; i < numEspacios +1; i++){
            System.out.print(" ");
        }
        return "";
    }
    public static String base(int altura){
        for (int i = 0; i < altura; i++){
            System.out.print("*");
        }
        System.out.println("");
        return "";
    }
    public static String linea(int x){
        System.out.print("*");
        for (int i = 0; i < x -3; i++){
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println("");
        return "";
    }
}
