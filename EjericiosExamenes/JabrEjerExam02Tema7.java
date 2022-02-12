/**
 * Realiza un programa que muestre por pantalla un array de 11 filas por 11 columnas relleno de numeros aleatorios entre 10 y 99.
 * A continuación, el programa debe mostrar los números de la diagonal que va desde la esquina inferior izquierda hasta la esquina superior derecha, asi como el maximo, el minimo y la media de los numeros que hay en esa diagonal.
 */

public class JabrEjerExam02Tema7 {
    public static void main (String[] args){
        int[][] arrayBi = new int[11][11];
        for (int i = 0 ; i < 11 ; i++){
            for (int j = 0; j < 11; j++){
                arrayBi[i][j] = (int)(Math.random()*(99+ - 10))+10;
                System.out.print(arrayBi[i][j] +" ");
            }
            System.out.println("");
        }
        int[] diagonalAux = new int[arrayBi.length];
        int aux = 0;
        for (int i = 0; i < arrayBi[0].length; i++) {
            for (int j = 0; j < arrayBi.length ; j++) {
                if (i + j == 5 + 5) {
                    diagonalAux[aux] = arrayBi[i][j];
                    aux++;
                }
            }
        } 
        //Diagonal
        int [] diagonal = new int[aux];
        System.out.println("La diagonal es : ");
        for (int i = 0; i < aux; i++){
            diagonal[i] = diagonalAux[i];
        }

        int [] arrayVolteado = new int [diagonal.length];
        for (int i= 0; i < arrayVolteado.length; i++){
            arrayVolteado[i] = diagonal[arrayVolteado.length -1 -i];
            System.out.print(arrayVolteado[i] +" ");
        }
        System.out.println("");
        
        //Maximo y Minimo
        int max=0;
        int minimo=0;
        int indice=0;
        while  (indice < diagonal.length){
            if (indice == 0 ){
                max=diagonal[indice];
            }else if (diagonal[indice] >= max){
                max=diagonal[indice];
            }

            if (indice == 0 ){
                minimo=diagonal[indice];
            }else if (diagonal[indice] <= minimo){
                minimo=diagonal[indice];
            }
            indice++;
        }
        int media=0;
        for (int i = 0; i < diagonal.length;i++){
            media = media + diagonal[i];
        }
        media /= diagonal.length;
        System.out.print("El maximo es: " + max + " \nEl minimo es: "+minimo + "\nLa media es: "+ media);
        
    }
}
