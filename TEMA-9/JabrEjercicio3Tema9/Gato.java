public class Gato extends Mamifero{
    private String tiporonroneo;

    public Gato(String nombre, String color, int mesesDeGestacion,String tiporonroneo) {
        super(nombre, color, mesesDeGestacion);
        this.tiporonroneo = tiporonroneo;
    }

    @Override
    public String toString() {
        return "Hola este es " + this.getNombre() +" es de color " + this.getColor() +" y su ronroneo es " +this.tiporonroneo+" y lindo";
    }

    
    
    
}
