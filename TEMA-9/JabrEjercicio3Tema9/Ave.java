public class Ave extends Animal{
    private double envergadura;
    public Ave(String nombre, String color,double envergadura) {
        super(nombre, color);
        this.envergadura = envergadura;
    }
    public double getEnvergadura() {
        return this.envergadura;
    }

    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }

    
}
