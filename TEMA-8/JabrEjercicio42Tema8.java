public class JabrEjercicio42Tema8 {
    public static void main(String[] args){
        System.out.print("Introduzca la altura de la figura: ");
        int altura = Integer.parseInt(System.console().readLine());
        piramideVacia(altura);
    }
    public static String piramideVacia(int altura){
        for (int i = 0; i < altura;i++){
            System.out.print("*");
        }
        System.out.println("");
        while (altura -2 > 0){
        for (int i = altura -1; i > 0; i--){
            if ( i == altura -1){
            System.out.print("*");
            }else if( i == 1 ){
            System.out.print("*");
            }else{
            System.out.print(" ");
            }
            
        }
        System.out.println("");
        altura--;
        }
        System.out.print("*");
        return "";
    }
}
