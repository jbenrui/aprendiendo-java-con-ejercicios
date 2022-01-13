/**
 * Ejercicio: 29
 * Mejora el juego “Busca el tesoro” de tal forma que si hay una mina a una casilla
 * de distancia, el programa avise diciendo ¡Cuidado! ¡Hay una mina cerca!
 * 
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio29Tema7 {
    public static void main(String[] args){
        int[][] matriz = new int[4][5];
        
        //Representacion de los objetos.
        final int VACIO = 0;
        final int MINA = 1;
        final int INTENTO = 2;
        final int TESORO = 3;

        //LLeno el mapa con el objeto vacio
        for (int x = 0; x < 4; x++){
            for (int y = 0; y < 5; y++){
                matriz[x][y]=VACIO;
            }
        }
        
        //Añado el mina en una posicion aleatoria del mapa
        int minaX = (int)(Math.random()*4);
        int minaY = (int)(Math.random()*5);
        matriz[minaX][minaY]=MINA;

        //Añado el tesoro en una posicion aleatoria del mapa
        int tesoroX;
        int tesoroY;
        do{
            tesoroX = (int)(Math.random()*4);
            tesoroY = (int)(Math.random()*5);
            matriz[tesoroX][tesoroY]=TESORO;
        }while((tesoroX==minaX)&&(tesoroY==minaY));


        int oportunidades = 6;
        do{
            //Pinto el cuadrante
            System.out.print(" ┌");
            System.out.print(" ──────");
            System.out.println(" ┐");
            for (int x = 0; x < 4; x++){
                System.out.print(x +"|");
                for (int y = 0; y < 5; y++){
                    if (matriz[x][y] == INTENTO){
                        System.out.print("X");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.print("   |");
                System.out.println("");
            }
            System.out.print(" └");
            System.out.print(" ──────");
            System.out.println(" ┘");
            //El usuario Introduce las cordenadas en la matriz

            System.out.print("Introduce las cordenadas en la matriz: \n");
            int intentoX = Integer.parseInt(System.console().readLine());
            int intentoY = Integer.parseInt(System.console().readLine());
            oportunidades--;
            //Actualizar la matriz con el intento del jugador
            switch (matriz[intentoX][intentoY]){
                case VACIO:
                    matriz[intentoX][intentoY]=INTENTO;
                    if ((Math.abs(intentoX - minaX) < 2) && (Math.abs(intentoY - minaY) < 2)) {
                        System.out.println("Cuidado, hay una mina cerca.");
                    }
                break;
                case MINA:
                    matriz[intentoX][intentoY]=MINA;
                    System.out.print("Lo siento has perdido \n");
                    oportunidades=0;
                break;
                case TESORO:
                    matriz[intentoX][intentoY]=TESORO;
                    System.out.print("¡Enhorabuena! ¡Has encontrado el tesoro! \n");
                    oportunidades=0;
                break;
                default:
            }
        }while (oportunidades > 0);
        //Pinto el cuadrante
        System.out.print(" ┌");
        System.out.print(" ──────");
        System.out.println(" ┐");
        for (int x = 0; x < 4; x++){
            System.out.print( x + "|");
            for (int y = 0; y <5; y++){
                switch (matriz[x][y]){
                    case VACIO:
                        System.out.print(" ");
                    break;
                    case INTENTO:
                        System.out.print("X");
                    break;
                    case MINA:
                        System.out.print("*");
                    break;
                    case TESORO:
                        System.out.print("$");
                    break;
                }
            }
            System.out.print("   |");
            System.out.println("");
        }
        System.out.print(" └");
        System.out.print(" ──────");
        System.out.println(" ┘");
    }
}