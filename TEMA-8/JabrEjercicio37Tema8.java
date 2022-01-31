import misfunciones.JabrFuncionesMatematicas;
public class JabrEjercicio37Tema8 {
    public static void main (String[] args) {
        System.out.println("El programa nos un numero en un sistema de morese (Ej: 213 = . . _ _ _ . _ _ _ _ . . . _ _  )");
        System.out.print("Introduce un numero por teclado: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine()) ;
        int numero = numeroIntroducido;
        System.out.print("El"+numero+" en decimal es el ");
        long voltear = JabrFuncionesMatematicas.voltea(numeroIntroducido);
        convierteEnMorse(voltear);
        System.out.print(" en el sistema morse. ");
    }
    public static void convierteEnMorse(long voltear){
        while (voltear > 0){
            long cifra = voltear % 10;
            switch ((int)(cifra)){
            case 1:
                System.out.print(" . _ _ _ _  ");
            break;
            case 2:
                System.out.print(" . . _ _ _ ");
            break;
            case 3:
                System.out.print(" . . . _ _ ");
            break;
            case 4:
                System.out.print(" . . . . _ ");
            break;
            case 5:
                System.out.print(" . . . . . ");
            break;
            case 6:
                System.out.print(" _ . . . . ");
            break;
            case 7:
                System.out.print(" _ _ . . . ");
            break;
            case 8:
                System.out.print("  _ _ _ . . ");
            break;
            case 9:
                System.out.print(" _ _ _ _ . ");
            break;
            case 0:
                System.out.print(" _ _ _ _ _ ");
            break;
            default:
            System.out.print(" ´");
            break;
            
            } 
            voltear /= 10;
        }
    }
}
