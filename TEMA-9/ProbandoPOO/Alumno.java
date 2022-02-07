public class Alumno extends Persona{
    int numeroExpediente;
    String estudiosPrevios = "Bachillerato";
    int anoNacimiento;
    boolean esRepetidor;
    String[] asignaturas;


    /*public Alumno(int numeroExpediente, String nombre, String apellidos) {
        this.numeroExpediente = numeroExpediente;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Alumno(int numeroExpediente, String nombre, String apellidos, String telefono, String estudiosPrevios,
            int anoNacimiento, boolean esRepetidor) {
        this.numeroExpediente = numeroExpediente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.estudiosPrevios = estudiosPrevios;
        this.anoNacimiento = anoNacimiento;
        this.esRepetidor = esRepetidor;
    }*/

    public Alumno(String nombre, String estudiosPrevios) {
        nombre = getNombre();
        this.estudiosPrevios = estudiosPrevios;
    }
    public void estudios(){
        String cadena = "Hola soy " + getNombre() + " y estudie " + this.estudiosPrevios;
        System.out.println(cadena);
        
    }
}
