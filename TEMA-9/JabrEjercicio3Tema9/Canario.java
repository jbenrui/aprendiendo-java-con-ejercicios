public class Canario extends Ave{
    private boolean domestico = true;

    public Canario(String nombre, String color, double envergadura,boolean domestico) {
        super(nombre, color, envergadura);
        this.domestico = domestico;
    }

    @Override
    public String toString() {
        if (domestico){
            return "Este es mi canario " + this.getNombre() + " mirad como canta!!";
        }
        return "";
    }
}
