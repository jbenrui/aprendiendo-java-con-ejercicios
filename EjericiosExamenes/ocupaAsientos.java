public class ocupaAsientos {
    public static void main(String[] args){
        int[] a = { 0, 1, 0, 0, 0, 1, 0};
        int espectadores = 3;
        
        //Busca espacios
        int huecos = 0;
        //Comprueba que hay hueco.
        for(int i = 0; i < a.length; i++){
            if(a[i] == 0){
                huecos++;
            }
        }
        
        for(int i = 0; i < a.length; i++){
            if(((huecos >= espectadores)&&(a[i]==0))&&(espectadores > 0)){
                a[i]=1;
                espectadores--;
            }
        }

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }


    }
    
}
