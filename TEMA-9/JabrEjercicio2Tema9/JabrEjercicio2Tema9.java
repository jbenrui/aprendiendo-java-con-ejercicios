public class JabrEjercicio2Tema9 {
    public static void main(String[] args){
        int km = 0;
        int opcion = 0;
        Coche mustangdel66 = new Coche(6);
        Bicicleta rockriderst540 = new Bicicleta(7);

        while ( opcion != 8){
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.println("Elige una opción (1-8): ");
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion){
                case 1:
                    System.out.print("¿Cuantos kilometros quiere recorrer?");
                    km = Integer.parseInt(System.console().readLine());
                    rockriderst540.recorre(km);
                break;
                case 2:
                    rockriderst540.hazCaballito();
                break;
                case 3:
                    System.out.print("¿Cuantos kilometros quiere recorrer?");
                    km = Integer.parseInt(System.console().readLine());
                    mustangdel66.recorre(km);
                break;
                case 4:
                    mustangdel66.quemaRueda();
                break;
                case 5:
                    System.out.print("La bicicleta lleva recorridos ");
                    System.out.println(rockriderst540.getKilometrosRecorridos());
                    
                break;
                case 6:
                    System.out.print("El coche lleva recorridos ");
                    System.out.println(mustangdel66.getKilometrosRecorridos());
                break;
                case 7:
                    System.out.print("El total de kilometros recorridos es: ");
                    System.out.println(Vehiculo.getKilometrosTotales());
                break;
                case 8:
                    System.out.print("Adios!!");
                break;
                default:
            }
            System.out.println("_____________________________________________");
            System.out.println("Pulsa enter para continuar: ");
            String aux = System.console().readLine();
        }

    }
}
