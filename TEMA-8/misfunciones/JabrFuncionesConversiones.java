package misfunciones;
public class JabrFuncionesConversiones {
    public static int convierteDecimal(long x) {
        long binario = x;
        int posicion = 0;
        int decimal = 0;
        long digito= 0;
        while (binario != 0){
            digito = binario % 10; //Saco la cifra del numero binario
            decimal = (int) (decimal + digito * JabrFuncionesMatematicas.potencia(2,posicion)); //Voy sumando los numeros decimales y multiplico el digitio por el resultado de la potencia, si multiplica por 1 sumara el numero, y si multiplica por 0 sumara 0.
            posicion++; //la posicion sera el exponente
            binario /=10; //reduzco el numero binario
        }
        return decimal;
    }
    public static long convierteBinario(int x) {
        int decimal = x;
        String binario = "";
        while (decimal > 0){ 
            if (decimal % 2 == 0){//Si es multiplo de 2 
                binario = "0" + binario; // Coloco 0
            }else{
                binario = "1" + binario;// sino 1
            }
            decimal = decimal / 2; // Reduzco el numero decimal
        }
        long resultado = Long.parseLong(binario); //Convierto el string a LONG
        return resultado;
        
    }
    public static String convierteHexadecimal(long l) {
        int decimal = (int)(l);
        String hexadecimal = "";
        String caracteresHexadecimales = "0123456789abcdef";

        while (decimal > 0){
            int residuo = decimal % 16; //Hago el modulo de 16 ya que los hexadecimales tienen 16 caracteres.
            hexadecimal = caracteresHexadecimales.charAt(residuo) + hexadecimal;
            decimal /= 16;
        }
        return hexadecimal;
        
    }
    public static long convierteOctal(int x) {
        int decimal = x;
        String octal = "";
        String caracteresOctal = "01234567";

        while (decimal > 0){
            int residuo = decimal % 8; //Hago el modulo de 8 ya que los octales tienen 8 caracteres.
            octal = caracteresOctal.charAt(residuo) + octal; //Con el residuo y charAt saco el caracter
            decimal /= 8; //Reduzco el numero decimal
        }
        long resultado = Long.parseLong(octal);
        return resultado;
        
    }
    public static long deOctalABinario(int x) {
        int i = 1; //Variable inicial
        int octal = x;
        long binario = 0;
        int residuo; 
        int[] valores_octales = {0, 1, 10, 11, 100, 101, 110, 111};
        
        while(octal != 0) {
            residuo = (int) (octal % 10);// Saco la cifra del numero octal
            binario += i * valores_octales[residuo]; //Segun la cifra elige dentro del array su correspondiente numero en binario y lo guarda en la variable
                        // i* multiplica ese valor por 1 inicialmente y despues aumentara para que no se machaque el binario al sumar.
            octal /= 10;//Voy dividiendo el numero para ir reduciendo las cifras y que llegue a 0
            
            i *= 1000;//Aumenta la variable inicial por 1000 en cada vuelta para no machacar ningun binario.
        }
        
        return binario;
        
    }
    public static long deBinarioAOctal(long binario) {
        int decimal = JabrFuncionesConversiones.convierteDecimal(binario);
        return JabrFuncionesConversiones.convierteOctal(decimal);
    }
    public static int HexadecimalADecimal(String hexadecimal) {
        final String DIGITOS = "0123456789ABCDEF";
        hexadecimal = hexadecimal.toUpperCase();
        int decimal = 0;
        for (int i = 0; i < hexadecimal.length(); i++) {//Bucle del tamaño de la longitud del numero
            char caracter = hexadecimal.charAt(i);//Saco la cifra del numero hexadecimal.
            int digito = DIGITOS.indexOf(caracter);//Segun que caracter es lo cambio por un caracter de los guardados en DIGITOS
            decimal = 16 * decimal + digito;//Sumo el numero decimal con el digito y multiplico por 16.
        }
        return decimal;
    }

}
