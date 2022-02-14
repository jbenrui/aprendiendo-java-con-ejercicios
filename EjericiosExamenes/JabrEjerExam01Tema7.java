/**
 * Ejercicio Examen 2016
 * 
 * Realiza un programa que, a partir de un array de 4 filas por 7 columnas con números generados al
 * azar entre 10 y 99, muestre a la derecha el número de pares encontrados en cada fila y que muestre
 * debajo de cada columna el valor máximo encontrado en esa columna.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */ 
public class JabrEjerExam01Tema7 {
    public static void main (String[] args){
        int[][] array = new int[4][7];
        for (int i = 0 ; i < 4 ; i++){
            for (int j = 0; j < 7; j++){
                array[i][j] = (int)(Math.random()*(99+ - 10))+10; //Si restas maximo con el minimo reduces el intervalo.
            }
            
        }
        int contadorPares = 0;
        int max = 0;
        int[] maximo = new int[7];
        //Muestra array BI
        for (int i = 0 ; i < array.length ; i++){
            for (int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j]+" "); //Si restas maximo con el minimo reduces el intervalo.
                if (array[i][j] % 2 == 0){
                    contadorPares++;
                }
            }
            System.out.print(": "+contadorPares+" ");
            contadorPares = 0;
            System.out.println("");
        }
        for (int j = 0; j < array[0].length; j++){
            for (int i = 0 ; i < array.length ; i++){
                if (array[i][j] > maximo[max]){
                    maximo[max] = array[i][j];
                }
            }
            max++;
        }

        for (int i = 0 ; i < maximo.length ; i++){
            System.out.print(maximo[i]+" ");
        }
    }
}
