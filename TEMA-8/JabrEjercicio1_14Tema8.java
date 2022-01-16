public class JabrEjercicio1_14Tema8 {
    public static void main (String[] args){
        System.out.print("Introduce un numero por teclado: ");
        long numeroIntroducido = Integer.parseInt(System.console().readLine()) ;
        
        if (esCapicua(numeroIntroducido)){
            System.out.print("El "+numeroIntroducido+ " es capicúa");
        }else{
            System.out.print("El "+numeroIntroducido+ " no es capicúa");
        }

        if (esPrimo(numeroIntroducido)){
            System.out.print("El "+numeroIntroducido+ " es primo");
        }else{
            System.out.print("El "+numeroIntroducido+ " no es primo");
            System.out.print("El "+siguientePrimo(numeroIntroducido)+ " es el siguiente primo");
        }
        System.out.print("El resultado de la potencia es "+potencia(numeroIntroducido));

        
        
    }
    public static boolean esCapicua(long numeroIntroducido){
        long numero = numeroIntroducido;
        long voltear = 0;
        int contador = 0;
        while (numero > 0){
        
            voltear = (voltear * 10) + (numero %10);
            numero /= 10;
            contador++;
        }
        /**Comparo si el numero dado la vuelta es igual al numero que he introducido**/
        if ((voltear == numeroIntroducido)&&(contador > 1)){
            return true;
        
        }else{
            return false;
        }
    }
    public static boolean esPrimo(long numeroIntroducido){
        System.out.println(" ");
        int entreNumero= 0;
        if ((numeroIntroducido == 1) || (numeroIntroducido == 2)) {
            return true;
        } else {
            for (entreNumero = 2; ((entreNumero < numeroIntroducido) && ((numeroIntroducido % entreNumero) != 0)); entreNumero++){ }
            
            if (entreNumero == numeroIntroducido){
                return true;
            } else {
                return false;
            }
        }
    }
    public static long siguientePrimo(long numeroIntroducido){
        System.out.println(" ");
        while (!esPrimo(++numeroIntroducido)){};
        return numeroIntroducido;
    }
    public static double potencia(double numeroIntroducido){
        System.out.println(" ");
        System.out.print("Introduce el exponente: ");
        long exponente = Integer.parseInt(System.console().readLine()) ;
        if (exponente == 0){
            return  numeroIntroducido = 1;
        }else if (numeroIntroducido == 0){
            return  numeroIntroducido = 0;
        }else{
            return  numeroIntroducido = Math.pow(numeroIntroducido, exponente);
        }
    }
}