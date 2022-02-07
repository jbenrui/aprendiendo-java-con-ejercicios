public class JabrEjercicio55Tema8 {
    public static void main(String[] args){
        String[]cadena = {"casa","coche","sol","mesa","mesa","coche","ordenador","sol","CASA"};
        
        for (int i=0; i < cadena.length; i++){
            System.out.print(cadena[i] +" ");
        }
        System.out.println("");
        muestraCadena(sinRepetir(cadena));
    }
    public static String[] sinRepetir(String[] s){
        String[] vacio = {};
            if (s.length == 0) { //Si la longitud del array es 0, es decir, viene vacio. Devuelvo un array vacio.
            return vacio;
        }

        String[] resultado = new String[s.length]; //Creo un array con la longitud del pasado como parametro
        int j = 0;
        
        for (int i = 1; i < s.length; i++) {
            if (!contiene(resultado, s[i])) { //Si es contiene devuelve falso añadire el elemento de la cadena al array resultado.
                resultado[j++] = s[i];
            }
        }

        return compacta(resultado);
    }
    public static boolean contiene(String[] lista, String cadena){ //Le llegan como parametros el aray resultado y el array con la cadena
        for (String elemento : lista) {
            if ((elemento != null) && (elemento.equals(cadena))){ //Si no es nulo y es igual al elemento de la cadena, devuelvo true
                return true;
            }
        }
            return false;
    }
    public static String[] compacta(String[] s) { //Le paso el array resultado como parametro
        int i = s.length - 1; // guardo en la variable la longitud del array -1 para que no sea 1-10 si no del 1-9 lo que se traduciria en 0-9.
        while (s[i] == null) { //si en la posicion del array el elemento es null resto -1 en la variable que contiene el tamaño.
            i--;
        }
        String[] resultado = new String[i + 1]; //Añado el tamaño al resultado 
        System.arraycopy(s, 0, resultado, 0, i + 1); // Copio los elementos en el array resultado.
        return resultado;
    }

    public static String muestraCadena(String[] s){
        for (int i=0; i < s.length; i++){
            System.out.print(s[i] + " ");
        }
        return "";
    }
}
