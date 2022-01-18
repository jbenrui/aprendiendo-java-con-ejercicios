import misfunciones.JabrFuncionesMatematicas;
public class JabrEjercicio1_14Tema8 {
    public static void main (String[] args){
        System.out.print("Introduce un numero por teclado: ");
        long numeroIntroducido = Integer.parseInt(System.console().readLine()) ;
        
        if (JabrFuncionesMatematicas.esCapicua(numeroIntroducido)){
            System.out.println("El "+numeroIntroducido+ " es capicúa");
        }else{
            System.out.println("El "+numeroIntroducido+ " no es capicúa");
        }

        if (JabrFuncionesMatematicas.esPrimo(numeroIntroducido)){
            System.out.println("El "+numeroIntroducido+ " es primo");
        }else{
            System.out.println("El "+numeroIntroducido+ " no es primo");
            System.out.println("El " + JabrFuncionesMatematicas.siguientePrimo(numeroIntroducido) + " es el siguiente primo");
        }
        System.out.println("El resultado de la potencia es "+JabrFuncionesMatematicas.potencia(numeroIntroducido));
        System.out.println("En el numero introducido hay "+JabrFuncionesMatematicas.digitos(numeroIntroducido)+" digitos");
        System.out.println("En el numero introducido volteado es "+JabrFuncionesMatematicas.voltea(numeroIntroducido));
        System.out.println("El numero Original es "+ numeroIntroducido);
        System.out.println("El digito en esa posicion es: "+ JabrFuncionesMatematicas.digitoN(numeroIntroducido));
        System.out.println("La posicion del digito es: "+ JabrFuncionesMatematicas.posicionDeDigito(numeroIntroducido));
        System.out.println("El numero Original es "+ numeroIntroducido);
        System.out.println("El numero con los digitos quitados por DETRAS es: "+ JabrFuncionesMatematicas.quitaPorDetras(numeroIntroducido));
        System.out.println("El numero con los digitos quitados por DELANTE es: "+ JabrFuncionesMatematicas.quitaPorDelante(numeroIntroducido));
        System.out.println("El numero Original es "+ numeroIntroducido);
        System.out.println("El numero con los digitos añadido por DETRAS es: "+ JabrFuncionesMatematicas.pegaPorDetras(numeroIntroducido));
        System.out.println("El numero con los digitos añadido por DELANTE es: "+ JabrFuncionesMatematicas.pegaPorDelante(numeroIntroducido));
        System.out.println("El numero Original es "+ numeroIntroducido);
        System.out.println("El trozo del nuumero Original seria: "+ JabrFuncionesMatematicas.trozoDeNumero(numeroIntroducido));
        System.out.print("Introduce el primer numero para formar uno : ");
        int n1 = Integer.parseInt(System.console().readLine()) ;
        System.out.print("Introduce el primer numero para formar uno : ");
        int n2 = Integer.parseInt(System.console().readLine()) ;
        System.out.println("Los numeros pegados forman :"+ JabrFuncionesMatematicas.juntaNumeros(n1,n2));
    }
    
}