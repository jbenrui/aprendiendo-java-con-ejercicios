package misfunciones;
public class JabrFuncionesLineas {
    public static String linea(int longitud, char extremo, char relleno){
        System.out.print(extremo);
        for (int i = 0; i < longitud -2; i++){
            System.out.print(relleno);
        }
        if (longitud > 1){
            System.out.print(extremo);
        }
        return "";
    }
    public static String espaciosPorDelante(int numespacios,char relleno){
        return linea(numespacios,' ',relleno);
    }
}