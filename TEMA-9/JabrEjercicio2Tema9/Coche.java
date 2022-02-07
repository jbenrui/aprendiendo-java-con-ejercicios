public class Coche extends Vehiculo{
    private int marchas;
    public Coche(int m){
        super();
        this.marchas = m;
    }

    public void quemaRueda(){
        System.out.println("Estoy Quemando Rueda!!");
    }

}
