public class ocupaAsientos {
    public static void main(String[] args){
        int[] a = { 0, 1, 1, 1, 0, 1, 0};
        int espectadores = 3;
        
        System.out.println(ocupa(a, espectadores));

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }
    public static int ocupa(int[] fila, int espectadores){
        int espacios = 0;
        int devuelto = -1;
        int posicionEspacios = 999;
        int espaciosJuntos = 0;
        //comprueba los espacios que hay, y cuenta cuantos espacios hay juntos, si encuentra espacios seguidos, posicionEspacios es la primera butaca
        for (int i = 0; i < fila.length; i++) {
            if(fila[i] == 0){
            espacios++;
            espaciosJuntos++;
            if(espaciosJuntos == espectadores && posicionEspacios == 999){
                posicionEspacios = i - espaciosJuntos;
            }
            } else{
            espaciosJuntos = 0;
            }
        }
        //miramos si hay mas espacios que usuarios
        if(espectadores <= espacios){
            devuelto = 0;
            //Si posicion espacios es diferente al valor dado por defecto, mete los usuarios desde ahí
            if(posicionEspacios != 999){
            for (int i = 0; i <= espectadores; i++) {
                fila[posicionEspacios + i] = 1;
            }
            }else{
            for (int i = 0; i < fila.length; i++) {
                if(fila[i] == 0 && espectadores >= 1){
                fila[i] = 1;
                espectadores --;
                }
            }
            }
        }
        return devuelto;
    }
    
}
