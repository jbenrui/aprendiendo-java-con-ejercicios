public class Caballo {
    private int idCaballo;
    private String nomCaballo;
    private int pesoCaballo;
    private int anoNacimiento;
    private int altura;
    private String color;
    public Caballo(String nomCaballo, int pesoCaballo, int anoNacimiento, String color) {
        this.nomCaballo = nomCaballo;
        this.pesoCaballo = pesoCaballo;
        this.anoNacimiento = anoNacimiento;
        this.color = color;
    }
    public Caballo(String nomCaballo, int altura) {
        this.nomCaballo = nomCaballo;
        this.altura = altura;
    }
    public String getNomCaballo() {
        return this.nomCaballo;
    }
    public int getAltura() {
        return this.altura;
    }
    
    public void cabalga(){
        System.out.println("Tocotoc Tocotoc Tocotoc");
    }
    public void relincha(){
        System.out.println("Hiieee! Hiiee!");
    }
}
