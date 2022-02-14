public class Incidencia {
    private int codIncidencia;
    private static int siguienteCod = 0;
    private int numPuesto;
    private String estado;
    private String problema;
    private String resuelve;
    private static int incidenciaPendientes = 0;
    public Incidencia(int numPuesto, String problema) {
        this.codIncidencia = siguienteCod++;
        this.numPuesto = numPuesto;
        this.problema = problema;
        this.estado = "pendiente";
        Incidencia.incidenciaPendientes++;
    }

    public void resuelve(String resuelve){
        this.estado="resuelto";
        this.resuelve = resuelve;
        incidenciaPendientes--;
    }

    public static int getPendientes() {
        return incidenciaPendientes;
    }

    public static void setIncidenciaPendientes(int incidenciaPendientes) {
        Incidencia.incidenciaPendientes = incidenciaPendientes;
    }

    @Override
    public String toString() {
        if (this.estado.equals("pendiente")){
            return "Incidencia " + codIncidencia + " - Puesto: "+ numPuesto + " - " + problema + " - " + estado;
        }else{
            return "Incidencia " + codIncidencia + " - Puesto: "+ numPuesto + " - " + problema + " - " + estado + " - " + resuelve;
        }
    }

    

    
}
