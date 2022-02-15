package Ex04jabr4;

public class Pez extends AnimalAcuario{
    private String tipoPez;
    
    public String getRaza() {
        return tipoPez;
    }

    public Pez(String nombre, String color,String tipoPez) {
        super(nombre,color);
        this.tipoPez = tipoPez;
    }

    @Override
    public String toString() {
        return "Soy " + this.getNombre()+ " , de color "+this.getColor()+", un Pez "+tipoPez;
    }

    

    public Pez seApareaCon(Pez p2){
        String nombreHijo = " ";
        String colorHijo = " ";
        String tipoHijo = " ";
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
                tipoHijo = this.tipoPez;
            break;
            case 1: 
                tipoHijo = p2.tipoPez;
            break;
        }

        Pez pececillo = new Pez (nombreHijo,colorHijo,tipoHijo);
        return pececillo;
    }
    
}
