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
    public static int potencia(int x , int e){
        int resultado = 1;
        for (int numVecesMultiplica = 0; numVecesMultiplica < e; numVecesMultiplica++) {
            resultado = (x * resultado);
        }
        return resultado;
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
        long cifra = 0;
        long voltear = JabrFuncionesMatematicas.voltea(numero);
        cifra = (voltear % 10);
        for (int comprobarPosicion = 0; comprobarPosicion < n; comprobarPosicion++){
            voltear = voltear / 10;

            cifra = (voltear % 10);
        }
        return (int) cifra;
        
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
    public static long quitaPorDetras(long x, int j) {
        long numero = x;
        int n = j;
        while ( n > 0){
            numero = numero / 10;
            n--;
        }
        return numero;
    }
    public static long quitaPorDelante(long x, int j) {
        long numero = x;
        int n = j;
        long voltear = JabrFuncionesMatematicas.voltea(numero);
        while ( n > 0){
            voltear = voltear / 10;
            n--;
        }
        voltear = JabrFuncionesMatematicas.voltea(voltear);
        return voltear;
    }
    public static long pegaPorDetras(long x , long j) {
        long numero = x;
        long n = j;
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
    public static long pegaPorDelante(long x ,long j) {
        long numero = x;
        long n = j;
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
