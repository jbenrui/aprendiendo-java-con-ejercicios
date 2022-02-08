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
        Fraccion division = operacion1.division(operacion2);
        System.out.println(operacion1);
        System.out.println(operacion2);
        System.out.println(division);
        Fraccion multiplicacion = operacion2.multiplica(operacion2);
        System.out.println(multiplicacion);
        Fraccion invertida = operacion1.invierte();
        System.out.println(operacion1.getNumerador() + "/" + operacion1.getDenominador());
        //Otra opcion es : 
        System.out.println(invertida);
        System.out.println(operacion3);
        Fraccion simplificada = operacion3.simplifica();
        System.out.println(simplificada);
        
        
    }
}
