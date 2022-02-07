public class Vehiculo {
    //atributos de clases 
    private int vehiculosCreados = 0;
    private static int kilometrosTotales = 0;
    //atributos de instancias
    private int kilometrosRecorridos;

    public Vehiculo(){
        this.kilometrosRecorridos = 0;
    }
    public int getKilometrosRecorridos() {
        return this.kilometrosRecorridos;
    }
    
    public static int getKilometrosTotales() {
        return Vehiculo.kilometrosTotales;
    }
    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }
    
    public void recorre(int k){
        this.kilometrosRecorridos+= k;
        Vehiculo.kilometrosTotales+= k;
    }

}
