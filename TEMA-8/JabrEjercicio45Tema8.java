public class JabrEjercicio45Tema8 {
    public static void main(String[] args){
        System.out.print("Introduzca la altura de la figura: ");
        int altura = Integer.parseInt(System.console().readLine());
        int numEspacios = altura -1;
        int base = 0;
        for (int i = 0; i <= altura; i++){
            linea(base);
            espacios(numEspacios);
            espacios(numEspacios);
            linea(base);
            System.out.println("");
            numEspacios--;
            base++;
        }
    }
    public static String linea(int x){
        for (int i = 0; i < x; i++){
            System.out.print("*");
        }
        return "";
    }
    public static String espacios(int numEspacios){
        for (int i = 0; i < numEspacios +1; i++){
            System.out.print(" ");
        }
        return "";
    }
}
