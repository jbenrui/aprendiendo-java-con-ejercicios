package Ex04jabr3;

public class Estrella extends AnimalAcuario  {
    private int numeroBrazos;



    public int getNumeroBrazos() {
        return numeroBrazos;

    }

    public Estrella(String nombre, String color,int numeroBrazos) {
        super(nombre,color);
        this.numeroBrazos = numeroBrazos;
    }


    @Override
    public String toString() {
        return "Soy " + this.getNombre() + ", de color " + this.getColor() + ", una estrella con " + this.getNumeroBrazos()+ " brazos";
    }

    public Estrella seApareaCon(Estrella p2){
        String nombreHijo = " ";
        String colorHijo = " ";
        int numeroBrazosHijo = 0;
        int dato1 = (int)(Math.random() * 2);
        int dato2 = (int)(Math.random() * 2);
        int dato3 = (int)(Math.random() * 2);
        switch (dato1){
            case 0:
                nombreHijo = this.nombre;
            break;
            case 1: 
                nombreHijo = p2.nombre;
            break;
        }
        switch (dato2){
            case 0:
                colorHijo = this.color;
            break;
            case 1: 
                colorHijo = p2.color;
            break;
        }
        switch (dato3){
            case 0:
                numeroBrazosHijo = this.numeroBrazos;
            break;
            case 1: 
                numeroBrazosHijo = p2.numeroBrazos;
            break;
        }

        Estrella estrellita = new Estrella (nombreHijo,colorHijo,numeroBrazosHijo);
        return estrellita;
    }
}
