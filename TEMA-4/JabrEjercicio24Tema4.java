/**
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado
 * según las siguientes condiciones:
 * • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
 * de proyecto), los días que ha estado de viaje visitando clientes durante el
 * mes y su estado civil (1 - Soltero, 2 - Casado).
 * • El sueldo base según el cargo es de 950, 1200 y 1600 euros según
 * si se trata de un prog. junior, un prog. senior o un jefe de proyecto
 * respectivamente.
 * • Por cada día de viaje visitando clientes se pagan 30 euros extra en
 * concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
 * un 25% en caso de estar soltero y un 20% en caso de estar casado
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio24Tema4 {
  public static void main (String[] args) {
    System.out.println("Este programa genera tu nomina. ");
    System.out.println("1 - Programador Juneor ");
    System.out.println("2 - Programador Senior");
    System.out.println("3 - Programador Jefe de Proyecto");
    System.out.print("Cual es tu cargo en la empresa(1 - 3): ");
    int cargoEmpleado = Integer.parseInt(System.console().readLine());
    System.out.print("Cuantos dias has estado de viaje: ");
    int diasViaje = Integer.parseInt(System.console().readLine());
    System.out.print("Estado civil(1 - Soltero, 2 - Casado): ");
    int estadoCivil = Integer.parseInt(System.console().readLine());
    int sueldoBase = 0;
    switch (cargoEmpleado){
      case 1:
      sueldoBase = 950;
      break;
      case 2:
      sueldoBase = 1200;
      break;
      case 3:
      sueldoBase = 1600;
      break;
      default:
      System.out.print("No existe ese cargo");
    }
    double dietas = (diasViaje * 30);
    double sueldoBruto = (dietas + sueldoBase);
    double retencionIRPF = 0;
    if (estadoCivil == 1){
        retencionIRPF = sueldoBruto * 0.25;
    } else if (estadoCivil == 2){
        retencionIRPF = sueldoBruto * 0.2;
    } else {
      System.out.print("Introduce un estado civil valido");
    }
    double sueldoNeto = sueldoBruto - retencionIRPF;
    System.out.println("----------------------------------");
    System.out.println("| Sueldo Base               "+sueldoBase+" |");
    System.out.println("| Dietas ("+diasViaje+" viajes )       "+dietas+" |");
    System.out.println("----------------------------------");
    System.out.println("| Sueldo Bruto            "+sueldoBruto+" |");
    System.out.println("| Retención IRPF           "+retencionIRPF+" |");
    System.out.println("----------------------------------");
    System.out.println("| Sueldo Neto             "+sueldoNeto+" |");
    System.out.println("----------------------------------");
    
  }
  
}
