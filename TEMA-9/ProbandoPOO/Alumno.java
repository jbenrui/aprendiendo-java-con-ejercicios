import java.util.Date;

public class Alumno {
    int numeroExpediente;
    String nombre;
    String apellidos;
    String telefono = "+34 652412587";
    String estudiosPrevios = "Bachillerato";
    int anoNacimiento;
    boolean esRepetidor;
    String[] asignaturas;
    public String getApellidos;


    public Alumno(int numeroExpediente, String nombre, String apellidos) {
        this.numeroExpediente = numeroExpediente;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Alumno(int numeroExpediente, String nombre, String apellidos, String telefono, String estudiosPrevios,
            int anoNacimiento, boolean esRepetidor) {
        this.numeroExpediente = numeroExpediente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.estudiosPrevios = estudiosPrevios;
        this.anoNacimiento = anoNacimiento;
        this.esRepetidor = esRepetidor;
    }

    
    public Alumno(String nombre, String estudiosPrevios) {
        this.nombre = nombre;
        this.estudiosPrevios = estudiosPrevios;
    }

    

    public Alumno(String telefono) {
        this.telefono = telefono;
    }


    public Alumno() {
    }

    public void numeroTelefono(){
        System.out.println("Mi numero  de telefono es " + this.telefono);
    }
    public void saluda(){
        System.out.println("Hola soy " + this.nombre);
    }
    public void saluda(String intensidad){
        String cadena = "Hola soy " + this.nombre;
        switch (intensidad){
            case "fuerte":
                cadena = cadena.toUpperCase();

            break;
            case "debil":
                cadena = cadena.toLowerCase();
            break;
            default:
        }
        System.out.println(cadena);
        
    }
    public void estudios(){
        String cadena = "Hola soy " + this.nombre + " y estudie " + this.estudiosPrevios;
        System.out.println(cadena);
        
    }
}
