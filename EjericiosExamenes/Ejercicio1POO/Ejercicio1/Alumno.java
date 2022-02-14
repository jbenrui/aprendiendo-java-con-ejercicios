package Ejercicio1POO.Ejercicio1;

public class Alumno{
    private static int ExpedienteInicial;
    private String nombre;
    private String apellidos;
    private String email;

    public Alumno(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    public int getExpedienteInicial() {
        return ExpedienteInicial;
    }

    public static void setExpedienteInicial(int expedienteInicial) {
        ExpedienteInicial = expedienteInicial;
        
    }

    @Override
    public String toString() {
        return (ExpedienteInicial++)+": "+this.nombre+" "+this.apellidos+" <"+this.email+">";
    }
    
    
    
}