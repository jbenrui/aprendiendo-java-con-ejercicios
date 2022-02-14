public class Pinguino extends Ave {
    private boolean vuela = false;

    public Pinguino(String nombre, String color, double envergadura,boolean vuela) {
        super(nombre, color, envergadura);
        this.vuela = vuela;
    }

    @Override
    public String toString() {
        if (!vuela){
            return "Este es un pinguino, su nombre es " + this.getNombre() + " y no puede volar";
        }
        return "";
    }
}
