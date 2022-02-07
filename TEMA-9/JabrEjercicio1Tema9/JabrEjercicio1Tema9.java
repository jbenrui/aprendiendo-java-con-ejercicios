/**
 * Ejercicio 1.
 * 
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando 
 * instancias y aplicándole algunos métodos.
 * 
 * @author JoseAntonioBenitez
 */

public class JabrEjercicio1Tema9 {
    public static void main(String[] args){
        Caballo a = new Caballo("Rojo",250,2005,"Marron rojizo");
        Caballo b = new Caballo("Azulito",235);

        System.out.println("Hola, su nombre es " + a.getNomCaballo());
        a.cabalga();

        System.out.println("Y ese de allá tan alto es " + b.getNomCaballo() + "mide alrededor de " + b.getAltura() + "cm.");
        b.relincha();
        System.out.println("Parece que " + b.getNomCaballo() + " te esta saludando.");
    }
}
