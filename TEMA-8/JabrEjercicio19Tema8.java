import misfunciones.JabrFuncionesMatematicas;
public class JabrEjercicio19Tema8 {
    public static void main (String[] args) {
        int opcion = 0;
        do{
            
            System.out.println("  Introduce un opcion. ");
            System.out.println(" _________________________ ");
            System.out.println(" 1 : Convierte de Decimal a Binario");
            System.out.println(" 2 : Convierte de Binario a Decimal");
            System.out.println(" 3 : Convierte de Decimal a Octal  ");
            System.out.println(" 4 : Convierte de Decimal a Hexadecimal");
            System.out.println("-1 : Salir ");
            System.out.print("---> ");
            opcion = Integer.parseInt(System.console().readLine()) ;
            switch (opcion) {
                case 1:
                    System.out.print("Introduce un numero entero positivo:  ");
                    int decimal = Integer.parseInt(System.console().readLine()) ;
                    System.out.println("El numero pasado a binario es : " + JabrFuncionesMatematicas.convierteBinario(decimal));
                    String vacio = System.console().readLine();
                    System.out.println(vacio+"");
                    System.out.println("");
                break;
                case 2:
                    System.out.print("Introduce un numero comprendido por 1 y 0 por teclado: ");
                    int binario = Integer.parseInt(System.console().readLine()) ;
                    System.out.println(" ");
                    System.out.println("El numero pasado a decimal es : " + JabrFuncionesMatematicas.convierteDecimal(binario));
                    vacio = System.console().readLine();
                    System.out.println(vacio+"");
                    System.out.println("");
                break;
                case 3: 
                    System.out.print("Introduce un numero entero positivo:  ");
                    decimal = Integer.parseInt(System.console().readLine()) ;
                    System.out.println(" ");
                    System.out.println("El numero pasado a octal es : " + JabrFuncionesMatematicas.convierteOctal(decimal));
                    vacio = System.console().readLine();
                    System.out.println(vacio+"");
                    System.out.println("");
                break;
                case 4:
                    System.out.print("Introduce un numero entero positivo:  ");
                    decimal = Integer.parseInt(System.console().readLine()) ;
                    System.out.println(" ");
                    System.out.println("El numero pasado a hexadecimal es : " + JabrFuncionesMatematicas.convierteHexadecimal(decimal));
                    vacio = System.console().readLine();
                    System.out.println(vacio+"");
                    System.out.println("");
                break;
                default:;
                
            }
        }while(opcion >= 0);
    }
}
