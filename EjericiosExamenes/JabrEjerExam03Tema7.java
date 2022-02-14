/**
 * Realiza un programa que rellene un array cuadrado con números consecutivos empezando por el 1 siguiendo un camino en forma de espiral en
 * el sentido de las agujas del reloj y empezando en la esquina superior izquierda. La longitud del lado del array (un entero mayor o igual
 * a 1) se debe pedir al usuario. Los números se deben mostrar perfectamente alineados en columnas teniendo en cuenta el tamaño del número más grande.
 */
public class JabrEjerExam03Tema7 {
    public static void main(String[] args){
        System.out.print("Introduzca la longitud del lado del array: ");
        int longitud = Integer.parseInt(System.console().readLine());
        int[][] array = new int[longitud][longitud];

        //Primera fila ArrayBi
        int contador=1;
        for (int i = 0; i < 1 ; i++){
            for (int j = 0; j < longitud -1 ;j++){
                array[i][j]=contador++;
                System.out.print(array[i][j]+" ");
            }
        }
        //Ultima columna ArrayBi
        for (int i = 0; i < longitud ; i++){
            for (int j = longitud -1; j < longitud;j++){
                array[i][j]=contador++;
                System.out.print(array[i][j]+" ");
            }
        }
        //ultima fila ArrayBi
        for (int i = longitud -1; i < longitud ; i++){
            for (int j = longitud -1; j > 0;j--){
                array[i][j]=contador++;
                System.out.print(array[i][j]+" ");
            }
        }
        //primera columna ArrayBi
        for (int i = longitud -1; i > 1  ; i--){
            for (int j = 0; j < 1;j++){
                array[i][j]=contador++;
                System.out.print(array[i][j]+" ");
            }
        }
        //Segunda fila ArrayBi
        for (int i = 1; i < 2 ; i++){
            for (int j = 1; j < longitud -2 ;j++){
                array[i][j]=contador++;
                System.out.print(array[i][j]+" ");
            }
        }
        //tercera columna ArrayBi
        for (int i = 1; i < longitud -1 ; i++){
            for (int j = longitud -1; j < longitud;j++){
                array[i][j]=contador++;
                System.out.print(array[i][j]+" ");
            }
        }
        //tercera fila ArrayBi
        for (int i = longitud -2; i < longitud ; i++){
            for (int j = longitud -2; j > 1;j--){
                array[i][j]=contador++;
                System.out.print(array[i][j]+" ");
            }
        }
        System.out.println("");
        for (int i = 0; i < longitud ; i++){
            for (int j = 0; j < longitud;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
