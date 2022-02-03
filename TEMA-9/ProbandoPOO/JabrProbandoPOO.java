/**
 * En este ejercicio realizaremos una prueba sobre la gestion Dual de este año con POO.
 * 
 * @JoseAntonioBenitez
 */
public class JabrProbandoPOO {
    public static void main(String[] args){
        System.out.println("DUAL GESTION");
        System.out.println("============");

        //Alumno alumno1 = new Alumno();
        Alumno joselito = new Alumno(19039,"Jose Antonio","Benitez Ruiz");
        Alumno albertoMoreno = new Alumno(19040,"Alberto","Moreno Gonzalez","+34 645882127","DAM",2003,false);
        joselito = new Alumno("Jose","SMR");
        //System.out.println(joselito);
        //System.out.println(albertoMoreno);
        joselito.saluda();
        System.out.println(joselito.getNombre());
        System.out.println("Mis apellidos son " + joselito.getApellidos());
        albertoMoreno.saluda("fuerte");
        albertoMoreno.numeroTelefono();
        joselito.estudios();
    }
}
