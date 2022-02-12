public class parizado {
    public static void main (String[] args){
        int numero = 308566;
        
        System.out.println("El numero "+numero+" parizado es : "+convertirEnPar(numero));
    }
    public static long convertirEnPar(long x){
        long resultado = 0;
        int cifra = 0;
        long voltear = 0;
        while (x > 0){
        
            voltear = (voltear * 10) + (x %10);
            x /= 10;
        }
        while(voltear > 0){
            cifra = (int)(voltear % 10);
            if (cifra % 2 != 0){
                if (cifra == 9){
                    cifra=0;
                }else{
                    cifra++;
                }
            } 
            resultado= (resultado * 10) + cifra;
            voltear/=10;
        }
        return resultado;
    }
}
