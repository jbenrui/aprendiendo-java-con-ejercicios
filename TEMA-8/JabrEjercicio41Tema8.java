public class JabrEjercicio41Tema8 {
    public static void main(String[] args){
    System.out.print("Introduzca la altura de la figura: ");
    int altura = Integer.parseInt(System.console().readLine());
        for (int i = altura; i > 0 ; i--){
            linea(altura);
            altura--;
        }
    }
    public static String linea(int x){
        for (int i = 0; i < x; i++){
            System.out.print("*");
        }
        System.out.println("");
        return "";
    }
}
