import misfunciones.JabrFuncionesMatematicas;
public class JabrEjercicio35Tema8 {
    public static void main (String[] args) {
        System.out.println("El programa nos un numero en un sistema de palotes (Ej: 12 = | - ||)");
        System.out.print("Introduce un numero por teclado: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine()) ;
        int numero = numeroIntroducido;
        System.out.print("El"+numero+" en decimal es el ");
        long voltear = JabrFuncionesMatematicas.voltea(numeroIntroducido);
        convierteEnPalotes(voltear);
        System.out.print(" en el sistema palotes. ");
    }
    public static void convierteEnPalotes(long voltear){
        while (voltear > 0){
            long cifra = voltear % 10;
            switch ((int)(cifra)){
            case 1:
                System.out.print(" | ");
            break;
            case 2:
                System.out.print(" || ");
            break;
            case 3:
                System.out.print(" ||| ");
            break;
            case 4:
                System.out.print(" |||| ");
            break;
            case 5:
                System.out.print(" ||||| ");
            break;
            case 6:
                System.out.print(" |||||| ");
            break;
            case 7:
                System.out.print(" ||||||| ");
            break;
            case 8:
                System.out.print(" |||||||| ");
            break;
            case 9:
                System.out.print(" ||||||||| ");
            break;
            default:
            System.out.print("  -");
            break;
            
            } 
            System.out.print("-");
            voltear /= 10;
        }
    }
}
