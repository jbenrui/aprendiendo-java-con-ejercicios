public class triangularInferior {
    public static void main (String[] args){
        int[][] array = new int[3][3];
        array[0][0] = 1; 
        array[0][1] = 0; 
        array[0][2] = 0; 
        array[1][0] = 2;
        array[1][1] = 3;
        array[1][2] = 0;    
        array[2][0] = 4; 
        array[2][1] = 5;
        array[2][2] = 6;  
        if (esTriangularInferior(array)){
            System.out.println("Esta matriz es triangular inferior.");
        }else{
            System.out.println("Esta matriz NO es triangular inferior.");
        }
        
    }
    public static boolean esTriangularInferior(int[][] array){
        for (int i = 0 ; i < array.length ; i++){
            for (int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
            
        }
        int indice = 0;
        boolean triangular = true;
        for (int i = 0 ; i < array.length ; i++){
            indice = i +1;
            while ((indice < array[0].length)&&(triangular)){
                if (array[i][indice++] != 0){
                    triangular = false;
                }
            }
            System.out.println("");
        }
        return triangular;
    }
}
