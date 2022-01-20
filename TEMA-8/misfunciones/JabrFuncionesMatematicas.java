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
    public static double potencia(double x , double e){
        double potencia = 0;
        if (e == 0){
            return  x = 1;
        }else if (x == 0){
            return  x = 0;
        }else{
            for(int i = 0;  i <= e ; i++){
                potencia = x * i;
            }
            return potencia;
        }
    }
    public static int digitos(long numeroIntroducido){
        long numero = numeroIntroducido;
        int contador = 0;
        while (numero > 0){
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
    public static int digitoN(long x, int i){
        int n = i;
        long numero = x;
        long cifra = 1;
        int posicion = 0;
        long voltear = JabrFuncionesMatematicas.voltea(numero);
        while ( voltear > 0){
            if (posicion == n){
                return (int) cifra;
            }
            cifra = (voltear % 10);
            voltear = voltear / 10;
            posicion++;
        
        }
        return -1;
        
    }

    public static int posicionDeDigito(long x , int p){
        int n = p;
        long numero = x;
        long cifra = 1;
        int posicion = 0;
        long voltear = JabrFuncionesMatematicas.voltea(numero);
        while ( voltear > 0){
            if (posicion > 0){
                if (cifra == n){
                    return posicion;
                }
            }
            cifra = voltear % 10;
            voltear = voltear / 10;
            posicion++;
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
    public static int pasaBinario(int x) {
        int binario = x;
        int aux = 0;
        int digitos=JabrFuncionesMatematicas.digitos(binario); // Saco cuantos digitos totales tiene
        for (int i = digitos -1; i >= 0; i-- ){ //Hago un bucle para que los digitos totales puedan ir desde la posicion max hasta el 0.
            int cifra = binario % 10; // Saco las cifras
            binario = binario / 10; //  Reduzco el numero binario
            double decimal = JabrFuncionesMatematicas.potencia(2,i); //Hago una potencia de base 2 con el exponente el cual sera la posicion de los digitios
            decimal = (cifra * decimal); // Multiplico la cifra por la potencia
            aux = (int) (decimal + aux); //Voy sumando las potencias
        }
        return aux;
    }
}
