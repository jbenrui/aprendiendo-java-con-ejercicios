public class JabrEjercicio52Tema8 {
    public static void main(String[] args){
        int[] a = {111,222,333,444};
        int[] b = {52,37};
        System.out.println("El numero obtenido aleatoriamente del array A es: "+aleatorioDeArray(a));
        System.out.println("El numero obtenido aleatoriamente del array B es: "+aleatorioDeArray(b));
    }
    public static int aleatorioDeArray(int[] array){
        int indice = array.length;
        indice = (int )(Math.random()*indice);
        return array[indice];
    }
}

