public class JabrEjercicio46Tema8 {
    public static void main(String[] args){
        System.out.print("Introduzca la altura de la figura: ");
        int altura = Integer.parseInt(System.console().readLine());
        int numEspacios = altura-2;
        int base = 0;
            System.out.print("*");
            System.out.print(" ");
            espacios(numEspacios+altura-1);
            System.out.println("*");
        for (int i = 0; i < altura -2; i++){
            linea(base);
            espacios(numEspacios);
            espacios(numEspacios);
            linea(base);
            System.out.println("");
            numEspacios--;
            base++;
        }
        for (int i = 0; i < altura *2; i++){
            System.out.print("*");
        }

    }
    public static String linea(int x){
        System.out.print("*");
        for (int j = 0; j < x; j++){
            System.out.print(" ");
        }
        System.out.print("*");
        return "";

    }
    public static String espacios(int numEspacios){
        for (int i = 0; i < numEspacios; i++){
            System.out.print(" ");
        }
        return "";
    }
}
