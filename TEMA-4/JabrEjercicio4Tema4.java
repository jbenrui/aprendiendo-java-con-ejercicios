/**
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
 * la hora.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio4Tema4 {
  public static void main (String[] args) {
    System.out.print("Introduce el numero de horas semanales: ");
    int horasSemanales = Integer.parseInt(System.console().readLine());
    
    if ((horasSemanales >=0) && (horasSemanales <=40)){
      int salarioHora = 12;
      double resultado = (double)( horasSemanales * salarioHora ); 
      System.out.printf("El sueldo semanal que le corresponde es de %.2f € " ,horasSemanales ,resultado);
    } else if (horasSemanales >=40) {
      int salarioHora = 16;
      double resultado = (double)( horasSemanales * salarioHora ); 
      System.out.printf("El sueldo semanal que le corresponde es de %.2f € " ,horasSemanales ,resultado);
    } else {
      System.out.print("El numero de horas introducida no es valida");
    }
  }
}


