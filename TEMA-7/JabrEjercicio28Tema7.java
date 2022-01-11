/**
 * Ejercicio: 28
 * Modifica el programa anterior de tal forma que no se repita ningún número en
 * el array.
 * 
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio28Tema7 {
    public static void main (String[] args){
        int[][] num = new int[6][10];
        int[][] oldnum = new int[6][10];
        int fila;
        int columna;
        int menor = 1001;
        int mayor = 0;
        int filaMayor=0;
        int columnaMayor=0;
        int filaMenor=0;
        int columnaMenor=0;
        
        for (fila = 0; fila < 6; fila++) {
            for (columna = 0; columna < 10; columna++) {
                num[fila][columna] = (int)(Math.random() * 1001);
                oldnum[fila][columna] = -1;
                
                if (num[fila][columna] < menor){
                menor= num[fila][columna];
                filaMenor=fila;
                columnaMenor=columna;
                }
                
                if (num[fila][columna] > mayor){
                mayor= num[fila][columna];
                filaMayor=fila;
                columnaMayor=columna;
                }
                if (num[fila][columna] == oldnum[fila][columna] ){
                    num[fila][columna] = (int)(Math.random() * 1001);
                    oldnum[fila][columna] = num[fila][columna];
                }
                System.out.printf("%3d " ,num[fila][columna]);
            }
        System.out.println("");
        }
        System.out.println("El mayor es el numero :"+ mayor + " y esta en la posicion : FILA : "+(filaMayor +1)+" COLUMNA :"+(columnaMayor +1));
        System.out.println("El mayor es el numero :"+ menor + " y esta en la posicion : FILA : "+(filaMenor +1)+" COLUMNA :"+(columnaMenor +1));
        
    }
}