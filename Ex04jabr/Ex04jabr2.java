/*
Ejercicio 2 Examen 2º Evalucacion.

a) Crea la función linea para pintar lineas de caracteres que tienen un determinado carácter en los
extremos y otro carácter de relleno. Prueba esta función en un programa con, al menos, los ejemplos
que se proporcionan a continuación.


@author Jose Antonio Bentiez Ruiz

*/

public class Ex04jabr2 {
    public static void main(String[] args) {
        // pintar la línea
        System.out.println(linea(5, ' ', ' '));
        System.out.println(linea(5, ' ', ' '));
        System.out.println(linea(6, 'X', '-'));
        System.out.println(linea(3, '&', '$'));
        System.out.println(linea(2, '&', '$'));
        System.out.println(linea(1, '&', '$'));
        System.out.println(linea(0, '&', '$'));
        System.out.println(linea(-3, '&', '$'));

        // pintar la pirámide
        System.out.print("Introduce la altura de la piramide: ");
        int altura = Integer.parseInt(System.console().readLine());
        int numespacios = altura;
        int longitud = 1;
        char extremo = '*';
        char relleno = ' ';
        for (int i = 0; i <= altura -1;i++){
            System.out.print(espaciosPorDelante(numespacios,relleno));
            if (i <= altura -2){
                System.out.println(linea(longitud,extremo,relleno));
            }else{
                relleno = '*';
                System.out.println(linea(longitud,extremo,relleno));
            }
            longitud +=2;
            numespacios--;
        }
    }
    
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
