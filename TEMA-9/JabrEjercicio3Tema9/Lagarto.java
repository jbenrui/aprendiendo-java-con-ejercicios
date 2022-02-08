public class Lagarto extends Animal{
    private String piel = "escamosa";
    public Lagarto(String nombre, String color, String piel){
        super(nombre, color);
        this.piel = piel;
    }
    @Override
    public String toString() {
        return "El lagarto tiene la piel " +piel;
    }

    
}
