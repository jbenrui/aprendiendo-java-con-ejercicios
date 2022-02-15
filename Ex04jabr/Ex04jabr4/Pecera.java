package Ex04jabr4;

public class Pecera {
    
    private String nombrePecera;
    private  int litros;
    private static String listaPez = " ";
    private static int numeroPeces = 0;

    public String getNombrePecera() {
        return nombrePecera;
    }

    public void setNombrePecera(String nombrePecera) {
        this.nombrePecera = nombrePecera;
    }

    public int getlitros() {
        return litros;
    }

    public void setlitros(int litros) {
        this.litros = litros;
    }
    

    public Pecera(String nombrePecera, int litros) {
        this.nombrePecera = nombrePecera;
        this.litros = litros;
    }

    @Override
    public String toString() {

        return this.nombrePecera+" de 2 litros contiene "+ numeroPeces +" peces: \n"+listaPez;
    }

    public void mete(Pez p1) {
        
        if (numeroPeces >= litros * 4) {
            listaPez = listaPez + p1 + "\n";
            System.out.println("Pecera llena, no se pueden meter más peces");
        } else if (numeroPeces < litros * 4) {
            numeroPeces++;
        }
    }

    

}
