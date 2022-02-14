public class Pizza {
    private String nombre;
    private String tamano;
    private String estado;
    private static int totalServida = 0;
    private static int totalPedidas = 0;
    public Pizza(String nombre, String tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.estado = "pedida";
        Pizza.totalPedidas++;
        
    }

    public void sirve(){
        if (this.estado.equals("pedida")){
            System.out.println(this.nombre + ", servida");
            this.estado = "servida";
            Pizza.totalServida++;
        }else{
            System.out.println("esa pizza ya se ha servido");
        }
    }

    @Override
    public String toString() {
        return nombre +" "+tamano+" "+", "+estado;
    }

    public static int getTotalServidas() {
        return totalServida;
    }

    public static void setPizzaServida(int pizzaServida) {
        Pizza.totalServida = pizzaServida;
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static void setTotalPedidas(int pizzaPedidas) {
        Pizza.totalPedidas = pizzaPedidas;
    }

    


    
}
