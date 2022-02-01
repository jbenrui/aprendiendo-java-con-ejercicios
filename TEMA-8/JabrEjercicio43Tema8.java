public class JabrEjercicio43Tema8 {
    public static void main(String[] args){
    System.out.print("Introduzca la altura de la figura: ");
    int altura = Integer.parseInt(System.console().readLine());
    int numEspacios = 0;
        for (int i = altura; i > 0 ; i--){
            espaciosDelante(numEspacios);
            linea(altura);
            altura--;
            numEspacios++;
        }
    }
    public static String espaciosDelante(int numEspacios){
        for (int i = 0; i < numEspacios; i++){
            System.out.print(" ");
        }
        return "";
    }
    public static String linea(int x){
        for (int i = 0; i < x; i++){
            System.out.print("*");
        }
        System.out.println("");
        return "";
    }
}