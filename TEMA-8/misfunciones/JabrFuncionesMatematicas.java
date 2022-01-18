package misfunciones;


public class JabrFuncionesMatematicas {
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
            
            if (posicion == n){
                return (int) cifra;
            
            }
            /*saco la cifra con el modulo*/
            
            cifra = (voltear % 10);
            
            voltear = voltear / 10;  /*divido el numero entre 10 para ir reduciendo el numero*/
            
            posicion++;/*por cada vuelta aumento la posicion hasta llegar al digito deseado*/
        
        }
        return -1;
        
    }

    public static int posicionDeDigito(long numeroIntroducido){
        System.out.print("Introduce un digito por teclado: ");
        int n = Integer.parseInt(System.console().readLine()) ;
        long numero = numeroIntroducido;
        long cifra = 1;
        int posicion = 0;
        long voltear = 0;
        numero = (numero * 10) +1;
        while (numero > 0){
            
            voltear = (voltear * 10) + (numero %10);
            numero /= 10;
        }
        while ( voltear > 0){
            /*si la cifra es igual al digito entonces mostrara el siguiente mensaje por pantalla*/
            
            if (posicion > 0){
                if (cifra == n){
                    return posicion;
                }
            }
            /*saco la cifra con el modulo*/
            
            cifra = voltear % 10;
            
            voltear = voltear / 10;  /*divido el numero entre 10 para ir reduciendo el numero*/
            
            posicion++;/*por cada vuelta aumento la posicion hasta llegar al digito deseado*/
            
        }
        return -1;
    }
    public static long quitaPorDetras(long numeroIntroducido) {
        System.out.print("Introduce cuantos digitios quieres quitar por detras : ");
        long numero = numeroIntroducido;
        int n = Integer.parseInt(System.console().readLine()) ;
        while ( n > 0){
            numero = numero / 10;
            n--;
        }
        return numero;
    }
    public static long quitaPorDelante(long numeroIntroducido) {
        long numero = numeroIntroducido;
        System.out.print("Introduce cuantos digitios quieres quitar por delante : ");
        int n = Integer.parseInt(System.console().readLine()) ;
        long voltear = 0;
        while (numero > 0){
            voltear = (voltear * 10) + (numero %10);
            numero /= 10;
        }
        while ( n > 0){
            voltear = voltear / 10;
            n--;
        }
        while (voltear > 0){
            numero = (numero * 10) + (voltear %10);
            voltear /= 10;
        }
        return numero;
    }
    public static long pegaPorDetras(long numeroIntroducido) {
        long numero = numeroIntroducido;
        System.out.print("Introduce el numero que quieres añadir por detras : ");
        long n = Integer.parseInt(System.console().readLine()) ;
        long aux = n;
        int contador = 0;
        while (aux > 0){
            aux /= 10;
            contador++;
        }
        while ( contador > 0){
            numero = (numero * 10);
            contador--;
        }
        numero = numero + n;
        return numero;
    }
    public static long pegaPorDelante(long x) {
        long numero = x;
        System.out.print("Introduce el numero que quieres añadir por delante : ");
        long n = Integer.parseInt(System.console().readLine()) ;
        long aux = numero;
        int contador = 0;
        while (aux > 0){
            aux /= 10;
            contador++;
        }
        while ( contador > 0){
            n = (n * 10);
            contador--;
        }
        n = n + numero;
        return n;
    }
    public static long trozoDeNumero(long x) {
        long numero = x;
        long voltear = 0;
        int resultado = 0;
        while (numero > 0){
            voltear = (voltear * 10) + (numero %10);
            numero /= 10;
        }
        int primeraCifra = (int) (voltear % 10);
        // Calcula la longitud de una cadena de caracteres : int posicionFinal = Integer.toString(voltear).length();
        int ultimaCifra = 0;
        while (voltear > 0){
                ultimaCifra = (int) (voltear % 10);
                voltear = voltear / 10;
        }
        resultado = (primeraCifra*10)+ultimaCifra;
        return resultado;
    }
    public static long juntaNumeros(int n1, int n2) {
        int multiplicaPorCifra = 1;
        int aux = n2;
        while (aux > 0){
            multiplicaPorCifra = multiplicaPorCifra * 10;
            aux = aux / 10;
        }
        int resultado = (n1*multiplicaPorCifra)+n2;
        
        return resultado;
    }
}
