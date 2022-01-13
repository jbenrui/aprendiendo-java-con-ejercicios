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
        for (int x = 0; x < 4; x++){//Va aumentando el indice X
            for (int y = 0; y < 5; y++){//Va aumentando el indice Y
                matriz[x][y]=VACIO;//DEJO LA MATRIZ EN BLANCO
            }
        }
        
        //Añado el mina en una posicion aleatoria del mapa
        int minaX = (int)(Math.random()*4);
        int minaY = (int)(Math.random()*5);
        matriz[minaX][minaY]=MINA; //Coloco la mina en la posicion aleatoria generada

        //Añado el tesoro en una posicion aleatoria del mapa
        int tesoroX;
        int tesoroY;
        do{
            tesoroX = (int)(Math.random()*4);
            tesoroY = (int)(Math.random()*5);
            matriz[tesoroX][tesoroY]=TESORO;//Coloco el tesoro en la posicion aleatoria generada
        }while((tesoroX==minaX)&&(tesoroY==minaY));//Si tiene la misma posicion que la mina, vuelve ha generar otra posicion


        int oportunidades = 6;
        do{
            //Pinto el cuadrante
            System.out.print(" ┌");
            System.out.print(" ──────");
            System.out.println(" ┐");
            for (int x = 0; x < 4; x++){//Va aumentando el indice X
                System.out.print(x +"|");
                for (int y = 0; y < 5; y++){//Va aumentando el indice Y
                    if (matriz[x][y] == INTENTO){//Si la matriz es igual a el intento pintara la X
                        System.out.print("X");
                    }else{//Si no la pintara en blanco
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
                    matriz[intentoX][intentoY]=INTENTO; //La casilla de esa posicion que estaba en blanco para a estar con el objeto INTENTO (X)
                    if ((Math.abs(intentoX - minaX) < 2) && (Math.abs(intentoY - minaY) < 2)) {//Calculo la posicion de la mina cercana siendo la diferencia menor a 2 casillas, restando la posicion del intento - la posicion de la mina
                        System.out.println("Cuidado, hay una mina cerca.");
                    }
                break;
                case MINA:
                    matriz[intentoX][intentoY]=MINA; // Si el intento ha caido en la mina pierdes
                    System.out.print("Lo siento has perdido \n");
                    oportunidades=0;
                break;
                case TESORO:
                    matriz[intentoX][intentoY]=TESORO; // Si el intento ha caido en la tesoro ganas
                    System.out.print("¡Enhorabuena! ¡Has encontrado el tesoro! \n");
                    oportunidades=0;
                break;
                default:
            }
        }while (oportunidades > 0);
        //Pinto el cuadrante solucionado
        System.out.print(" ┌");
        System.out.print(" ──────");
        System.out.println(" ┐");
        for (int x = 0; x < 4; x++){
            System.out.print( x + "|");
            for (int y = 0; y <5; y++){
                switch (matriz[x][y]){ // este switch mostrara todos los objetos en el mapa
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