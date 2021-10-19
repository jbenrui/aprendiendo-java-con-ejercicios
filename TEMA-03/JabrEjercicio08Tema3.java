/**
 * Escribe un programa que calcule el salario semanal de un empleado en base a 
 * las horas trabajadas, a razón de 12 euros la hora.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio08Tema3 {
  public static void main (String[] args) {
    System.out.print("Introduce el numero de horas semanales: ");
    int horasSemanales = Integer.parseInt(System.console().readLine());
    int salarioHora = 12;
    
    double resultado = (double)( horasSemanales * salarioHora );
    System.out.printf("Trabajas %d horas a la semana y ganas %.2f € a la semana" ,horasSemanales ,resultado);
	}
}


