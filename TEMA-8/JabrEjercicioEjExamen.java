import misfunciones.JabrFuncionesLineas;
public class JabrEjercicioEjExamen {
    public static void main(String[] args){
        System.out.print("Introduce la altura de la piramide: ");
        int altura = Integer.parseInt(System.console().readLine());
        int numespacios = altura;
        int longitud = 1;
        char extremo = '*';
        char relleno = ' ';
        for (int i = 0; i <= altura -1;i++){
            System.out.print(JabrFuncionesLineas.espaciosPorDelante(numespacios,relleno));
            if (i <= altura -2){
                System.out.println(JabrFuncionesLineas.linea(longitud,extremo,relleno));
            }else{
                relleno = '*';
                System.out.println(JabrFuncionesLineas.linea(longitud,extremo,relleno));
            }
            longitud +=2;
            numespacios--;
        }
    }
}
