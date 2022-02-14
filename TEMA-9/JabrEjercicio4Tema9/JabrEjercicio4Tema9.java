

/**
 * Ejercicio 4
 * 
 * Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de los 
 * métodos pueden ser invierte, simplifica, multiplica, divide, etc.
 * 
 * @author JoseAntonioBenitez
 * 
 */
public class JabrEjercicio4Tema9 {
    public static void main(String[] args){
        Fraccion operacion1 = new Fraccion(6,2);
        Fraccion operacion2 = new Fraccion(2,4);
        Fraccion operacion3 = new Fraccion(16,12);
        int opcion = 0;
        while (opcion != 5){
            System.out.println("1. division");
            System.out.println("2. multiplicacion");
            System.out.println("3. invertida");
            System.out.println("4. simplificada");
            System.out.println("Elige una opción (1-8): ");
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion){
                case 1:
                    Fraccion division = operacion1.division(operacion2);
                    System.out.print("La operacion se compone de : ");
                    System.out.println(operacion1);
                    System.out.println(operacion2);
                    System.out.println(division);
                break;
                case 2:
                    Fraccion multiplicacion = operacion1.multiplica(operacion2);
                    System.out.print("La operacion se compone de : ");
                    System.out.println(operacion1);
                    System.out.println(operacion2);
                    System.out.println(multiplicacion);
                break;
                case 3:
                    Fraccion invertida = operacion1.invierte();
                    System.out.println(operacion1.getNumerador() + "/" + operacion1.getDenominador());
                    System.out.println("Pasa a : ");
                    System.out.println(invertida);
                break;
                case 4:
                    Fraccion simplificada = operacion3.simplifica();
                    System.out.println(operacion3);
                    System.out.println("Pasa a : ");
                    System.out.println(simplificada);
                break;
                default:
            }

        }
        
    }
}
