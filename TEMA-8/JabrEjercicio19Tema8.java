import misfunciones.JabrFuncionesConversiones;
public class JabrEjercicio19Tema8 {
    public static void main (String[] args) {
        int opcion = 0;
        do{
            
            System.out.println("         Introduce un opcion. ");
            System.out.println(" ____________________________________ ");
            System.out.println(" 1 : Convierte de Decimal a Binario");
            System.out.println(" 2 : Convierte de Decimal a Octal  ");
            System.out.println(" 3 : Convierte de Decimal a Hexadecimal");
            System.out.println(" 4 : Convierte de Binario a Decimal");
            System.out.println(" 5 : Convierte de Binario a Octal");
            System.out.println(" 6 : Convierte de Binario a Hexadecimal");
            System.out.println(" 7 : Convierte de Octal a Binario");
            System.out.println(" 8 : Convierte de Octal a Decimal");
            System.out.println(" 9 : Convierte de Octal a Hexadecimal");
            System.out.println("10 : Convierte de Hexadecimal a Decimal");
            System.out.println("11 : Convierte de Hexadecimal a Binario");
            System.out.println("12 : Convierte de Hexadecimal a Octal");

            
            System.out.println("-1 : Salir ");
            System.out.print("---> ");
            opcion = Integer.parseInt(System.console().readLine()) ;
            switch (opcion) {
                case 1:
                    System.out.print("Introduce un numero entero positivo:  ");
                    int decimal = Integer.parseInt(System.console().readLine()) ;
                    System.out.println("El numero pasado a binario es : " + JabrFuncionesConversiones.convierteBinario(decimal));
                    String vacio = System.console().readLine();
                    System.out.println(vacio+"");
                    System.out.println("");
                break;
                case 4:
                    System.out.print("Introduce un numero comprendido por 1 y 0 por teclado: ");
                    long binario = Integer.parseInt(System.console().readLine()) ;
                    System.out.println(" ");
                    System.out.println("El numero pasado a decimal es : " + JabrFuncionesConversiones.convierteDecimal(binario));
                    vacio = System.console().readLine();
                    System.out.println(vacio+"");
                    System.out.println("");
                break;
                case 2: 
                    System.out.print("Introduce un numero entero positivo:  ");
                    decimal = Integer.parseInt(System.console().readLine()) ;
                    System.out.println(" ");
                    System.out.println("El numero pasado a octal es : " + JabrFuncionesConversiones.convierteOctal(decimal));
                    vacio = System.console().readLine();
                    System.out.println(vacio+"");
                    System.out.println("");
                break;
                case 3:
                    System.out.print("Introduce un numero entero positivo:  ");
                    decimal = Integer.parseInt(System.console().readLine()) ;
                    System.out.println(" ");
                    System.out.println("El numero pasado a hexadecimal es : " + JabrFuncionesConversiones.convierteHexadecimal(decimal));
                    vacio = System.console().readLine();
                    System.out.println(vacio+"");
                    System.out.println("");
                break;
                case 7:
                    System.out.print("Introduce un numero en octal entero positivo:  ");
                    int octal = Integer.parseInt(System.console().readLine()) ;
                    System.out.println(" ");
                    System.out.println("El numero Octal en binario es : " + JabrFuncionesConversiones.deOctalABinario(octal));
                    vacio = System.console().readLine();
                    System.out.println(vacio+"");
                    System.out.println("");
                break;
                case 5:
                    System.out.print("Introduce un numero binario:  ");
                    binario = Integer.parseInt(System.console().readLine()) ;
                    System.out.println(" ");
                    System.out.println("El numero Octal en binario es : " + JabrFuncionesConversiones.deBinarioAOctal(binario));
                    vacio = System.console().readLine();
                    System.out.println(vacio+"");
                    System.out.println("");
                break;
                case 8:
                    System.out.print("Introduce un numero en octal entero positivo:  ");
                    octal = Integer.parseInt(System.console().readLine()) ;
                    System.out.println(" ");
                    System.out.println("El numero Octal en binario es : " + JabrFuncionesConversiones.convierteDecimal(JabrFuncionesConversiones.deOctalABinario(octal)));
                    vacio = System.console().readLine();
                    System.out.println(vacio+"");
                    System.out.println("");
                break;
                case 10:
                    System.out.print("Introduce un numero en hexadecimal:  ");
                    String hexadecimal = System.console().readLine();
                    System.out.println(" ");
                    System.out.println("El numero hexadecimal en decimal es : " + JabrFuncionesConversiones.HexadecimalADecimal(hexadecimal));
                    vacio = System.console().readLine();
                    System.out.println(vacio+"");
                    System.out.println("");
                break;
                case 11:
                    System.out.print("Introduce un numero en hexadecimal:  ");
                    hexadecimal = System.console().readLine();
                    System.out.println(" ");
                    System.out.println("El numero hexadecimal en binario es : " + JabrFuncionesConversiones.convierteBinario(JabrFuncionesConversiones.HexadecimalADecimal(hexadecimal)));
                    vacio = System.console().readLine();
                    System.out.println(vacio+"");
                    System.out.println("");
                break;
                case 12:
                    System.out.print("Introduce un numero en hexadecimal:  ");
                    hexadecimal = System.console().readLine();
                    System.out.println(" ");
                    System.out.println("El numero hexadecimal en Octal es : " + JabrFuncionesConversiones.deBinarioAOctal(JabrFuncionesConversiones.convierteBinario(JabrFuncionesConversiones.HexadecimalADecimal(hexadecimal))));
                    vacio = System.console().readLine();
                    System.out.println(vacio+"");
                    System.out.println("");
                break;
                case 6:
                    System.out.print("Introduce un numero en binario:  ");
                    binario = Integer.parseInt(System.console().readLine()) ;
                    System.out.println(" ");
                    System.out.println("El numero binario a Hexadecimal es : " + JabrFuncionesConversiones.convierteHexadecimal(JabrFuncionesConversiones.convierteDecimal(binario)));
                    vacio = System.console().readLine();
                    System.out.println(vacio+"");
                    System.out.println("");
                break;
                default:;
                
            }
        }while(opcion >= 0);
    }
}
