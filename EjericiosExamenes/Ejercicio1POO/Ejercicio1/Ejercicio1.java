package Ejercicio1POO.Ejercicio1;

/**
 * El programa GestiMat (gestion de matrículas) necesita almacenar los datos sobre los alumnos que se matriculan en un centro educativo. 
 * Crea la clase Alumno de tal forma que de cada uno de ellos se sepa su nombre, sus apellidos y su direccion de correo electronico.A cada
 * alumno se le asigna de forma automatica un número de expediente empezando por el que se decida cada curso.
 */

public class Ejercicio1{
    public static void main(String[]args){
        Alumno.setExpedienteInicial(5000);
        Alumno a1 = new Alumno("Larisa","Peláez Almera","lari@gmail.com");
        Alumno a2 = new Alumno("Benito","Cruz Santipán","benito32@yahoo.com");
        System.out.println(a1);
        System.out.println(a2);
    }
    
}