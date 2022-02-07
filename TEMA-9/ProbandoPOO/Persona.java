public abstract class Persona {
    private String dni;
    private String apellido;
    private String nombre;
    private String telefono;
    private String domicilio;

    

    public String getNombre() {
        return nombre;
    }

    public void numeroTelefono(){
        System.out.println("Mi numero  de telefono es " + this.telefono);
    }
    public void saluda(){
        if (this.nombre == null){
            System.out.println("Hola");
        }else{
            System.out.println("Hola soy " + this.nombre);
        }
        
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
}
