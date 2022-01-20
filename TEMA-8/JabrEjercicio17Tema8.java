import misfunciones.JabrFuncionesMatematicas;
public class JabrEjercicio17Tema8 {
    public static void main (String[] args) {
        System.out.print("Introduce un numero comprendido por 1 y 0 por teclado: ");
        int binario = Integer.parseInt(System.console().readLine()) ;
        int aux = 0;
        int digitos=JabrFuncionesMatematicas.digitos(binario); // Saco cuantos digitos totales tiene
        for (int i = digitos -1; i >= 0; i-- ){ //Hago un bucle para que los digitos totales puedan ir desde la posicion max hasta el 0.
            int cifra = binario % 10; // Saco las cifras
            binario = binario / 10; //  Reduzco el numero binario
            double decimal = JabrFuncionesMatematicas.potencia(2,i); //Hago una potencia de base 2 con el exponente el cual sera la posicion de los digitios
            decimal = (cifra * decimal); // Multiplico la cifra por la potencia
            aux = (int) (decimal + aux); //Voy sumando las potencias
        }
        System.out.println(" ");
        System.out.println("El numero pasado a decimal es : " + aux);
    }
}
