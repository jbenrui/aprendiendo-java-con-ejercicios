package Ex04jabr3;

public abstract class AnimalAcuario {
    protected String nombre;
    protected String color;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public AnimalAcuario(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

}
