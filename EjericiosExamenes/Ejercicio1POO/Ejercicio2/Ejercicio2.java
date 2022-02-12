package Ejercicio1POO.Ejercicio2;

/**
 * El ayuntamiento nos va a cotnratar para implemetar un nuevo programa que lelvara el control de los aparcamientos municipales.
 * Crea la clase Tique de tal fomra que cuando se crea un nuevo tique de aparcamiento se guarde el momento en el que es creado.
 * Cada tique llevara un numero consecutivo, empezando por el 1. El precio es de 2 centimos por minuto (0'02).
 */

public class Ejercicio2{
    public static void main(String[]args){
        Tique t1 = new Tique(10.05);
        Tique t2 = new Tique(14.30);
        Tique t3 = new Tique(15.00);
        t1.paga(11.00);
        t2.paga(17.45);
        t3.paga(18.45);
        System.out.print("Recaudacion: "+Tique.getRecaudacion() +" euros.");

    }
}