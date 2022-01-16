public class JabrEjercicio1_14Tema8 {
    public static void main (String[] args){
        System.out.print("Introduce un numero por teclado: ");
        long numeroIntroducido = Integer.parseInt(System.console().readLine()) ;
        
        if (esCapicua(numeroIntroducido)){
            System.out.println("El "+numeroIntroducido+ " es capicúa");
        }else{
            System.out.println("El "+numeroIntroducido+ " no es capicúa");
        }

        if (esPrimo(numeroIntroducido)){
            System.out.println("El "+numeroIntroducido+ " es primo");
        }else{
            System.out.println("El "+numeroIntroducido+ " no es primo");
            System.out.println("El " + siguientePrimo(numeroIntroducido) + " es el siguiente primo");
        }
        System.out.println("El resultado de la potencia es "+potencia(numeroIntroducido));
        System.out.println("En el numero introducido hay "+digitos(numeroIntroducido)+" digitos");
        System.out.println("En el numero introducido volteado es "+voltea(numeroIntroducido));
        System.out.println("El digito en esa posicion es: "+ digitoN(numeroIntroducido));
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
        while (!esPrimo(++numeroIntroducido)){};
        return numeroIntroducido;
    }
    public static double potencia(double numeroIntroducido){
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
    public static int digitos(long numeroIntroducido){
        long numero = numeroIntroducido;
        long voltear = 0;
        int contador = 0;
        while (numero > 0){
        
            voltear = (voltear * 10) + (numero %10);
            numero /= 10;
            contador++;
        }
        return contador;
    }
    public static long voltea(long numeroIntroducido){
        long numero = numeroIntroducido;
        long voltear = 0;
        while (numero > 0){
        
            voltear = (voltear * 10) + (numero %10);
            numero /= 10;
        }
        return voltear;
    }
    public static int digitoN(long numeroIntroducido){
        System.out.print("Introduce la posicion de un digito dentro del numero introducido: ");
        int n = Integer.parseInt(System.console().readLine()) ;
        long numero = numeroIntroducido;
        long voltear = 0;
        long cifra = 1;
        int posicion = 0;
        numero = (numero * 10) +1;
        while (numero > 0){
        voltear = (voltear * 10) + (numero %10);
        numero /= 10;
        }
        while ( voltear > 0){
        /*si la cifra es igual al digito entonces mostrara el siguiente mensaje por pantalla*/
        if (posicion > 0){
            if (cifra == n){}
        }
        /*saco la cifra con el modulo*/
        cifra = (voltear % 10);
        voltear = voltear / 10;  /*divido el numero entre 10 para ir reduciendo el numero*/
        posicion++;/*por cada vuelta aumento la posicion hasta llegar al digito deseado*/
        }
        return (int) cifra;
    }
    /*public static int posicionDeDigito(long numeroIntroducido){
        long numero = numeroIntroducido;
        long voltear = 0;
        long cifra = 1;
        while (numero > 0){
        
            voltear = (voltear * 10) + (numero %10);
            numero /= 10;
        }
        while (voltear > 0){
            if (digitoN(numeroIntroducido)
            voltear = voltear / 10;

        }
        return voltear;
    }*/
}