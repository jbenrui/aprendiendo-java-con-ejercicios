/*
Ejercicio 1 Examen 2º Evalucacion.

Realiza un programa que genere un array cuadrado con números aleatorios entre el 1 y el 99, ambos
incluidos. La longitud del lado del array (un entero mayor o igual a 1) se debe pedir al usuario. A
continuación, el usuario podrá extraer un trozo de ese array indicando la fila y la columna donde se
empieza a extraer y la longitud del lado del trozo.
Tanto el array original como el trozo se deben mostrar con los números perfectamente alineados,
como se muestra en los ejemplos.
Las filas y las columnas se numeran empezando a contar en la 0.

@author Jose Antonio Bentiez Ruiz

*/
public class Ex04jabr1 {
    public static void main(String[] args) {
        int i;
        int j;
        System.out.print("Introduzca la longitud del lado del array original: ");
        int longitud = Integer.parseInt(System.console().readLine());
        int[][] array = new int[longitud][longitud];
        for (i = 0; i < longitud; i++) {
            for (j = 0; j < longitud; j++) {
                array[i][j] = (int) (Math.random() * 99 + 1);
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
        System.out.println("Vamos a extraer un trozo de ese array");
        System.out.print("Introduzca la fila para comenzar a extraer: ");
        int fila = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la columna para comenzar a extraer: ");
        int columna = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la longitud del lado que se va a extraer: ");
        int lado = Integer.parseInt(System.console().readLine());
        int[][] resultado = new int[lado][lado];
        for (i = 0; i < resultado.length; i++) {
            for (j = 0; j < resultado[0].length; j++) {
                resultado[i][j] = array[i + fila][j + columna];
                System.out.printf("%3d ", resultado[i][j]);
            }
            System.out.println();
        }
    }
}
