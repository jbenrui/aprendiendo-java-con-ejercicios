public class Caballo {
    int idCaballo;
    String nomCaballo;
    int pesoCaballo;
    int anoNacimiento;
    int altura;
    String color;
    public Caballo(String nomCaballo, int pesoCaballo, int anoNacimiento) {
        this.nomCaballo = nomCaballo;
        this.pesoCaballo = pesoCaballo;
        this.anoNacimiento = anoNacimiento;
    }
    public Caballo(String nomCaballo, String color) {
        this.nomCaballo = nomCaballo;
        this.color = color;
    }
    public Caballo(String nomCaballo, int altura) {
        this.nomCaballo = nomCaballo;
        this.altura = altura;
    }
}
