package Ejercicio1POO.Ejercicio2;

public class Tique {
    private static int numTique = 1;
    private double horaCreacion;
    private static double recaudacion;

    public Tique(double horaCreacion) {
        this.horaCreacion = horaCreacion;
    }
    
    public static int getNumTique() {
        return numTique;
    }
    public static void setNumTique(int numTique) {
        Tique.numTique = numTique;
    }

    public static void setRecaudacion(double recaudacion) {
        Tique.recaudacion = recaudacion;
    }
    public static double getRecaudacion() {
        return Tique.recaudacion;
    }
    public void paga(double TiqueSalida){
        int hora = (int)(horaCreacion);
        double minuto = 100*(horaCreacion - hora);
        int hora2 = (int)(TiqueSalida);
        double minuto2 = 100*(TiqueSalida - hora2);
        int resultado = ((int)((hora2 * 60) + minuto2 )) - ((int)((hora * 60) + minuto ));
        TiqueSalida = resultado * 0.02;
        System.out.printf("Tique nº  %d. Debe pagar %.2f euros. Gracias.\n",numTique++,TiqueSalida);
        Tique.recaudacion= Tique.recaudacion + TiqueSalida;
    }
}
