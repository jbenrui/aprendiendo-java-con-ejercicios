/**
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El progr
 * -ama mostrará al final la calificación obtenida. Pásale el minicuestionario a
 * tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
 * en las diferentes asignaturas del curso.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio12Tema4 {
  public static void main (String[] args) {
    int puntos = 0;
    String respuesta;
    System.out.println("Elige la respuesta que creas que es correcta.");
    System.out.println("La opcion a introducir solo puede ser 1.");
    System.out.println("Las opciones introducidad deben ser : a b c");
    System.out.println("--------------------------------------------");
    System.out.println("1 -¿Que es una CPU?");
    System.out.println("a = Un pokemon ");
    System.out.println("b = Unidad de procesamiento central");
    System.out.println("c = Unidad de procesamiento grafico");
    respuesta = (System.console().readLine() );;

    if (respuesta.equals("b")){
      puntos++;
    }
    
    System.out.println("2 -¿¿Que es un atributo?");
    System.out.println("a = Una caracteristica de una entidad");
    System.out.println("b = Una variable");
    System.out.println("c = Un objeto que queremos almacenar en la BDD");
    respuesta = (System.console().readLine() );;
    
    if (respuesta.equals("a")){
      puntos++;
    }
    System.out.println("--------------------------------------------");
    System.out.println("3 -¿¿Cuales una medida de proteccion individual ?");
    System.out.println("a = Unos guantes ");
    System.out.println("b = Una celula fotovoltaica");
    System.out.println("c = Una barandilla en una escalera");
    respuesta = (System.console().readLine() );;
    
    if (respuesta.equals("a")){
      puntos++;
    }
    System.out.println("--------------------------------------------");
    System.out.println("4 -¿¿Cual es la funcion del interprete?");
    System.out.println("a = Traduce un programa fuente a un programa objeto ");
    System.out.println("b = Una celula fotovoltaica");
    System.out.println("c = Traduce intrucciones por intrucciones a lenguaje maquina, sin alamacenar el resultado de la traducción");
    respuesta = (System.console().readLine() );;
    
    if (respuesta.equals("c")){
      puntos++;
    }
    System.out.println("--------------------------------------------");
    System.out.println("5 -¿¿Que alamcena una variable de tipo String?");
    System.out.println("a = numeros ");
    System.out.println("b = Un caracter");
    System.out.println("c = Una cadena de caracteres");
    respuesta = (System.console().readLine() );;
    
    if (respuesta.equals("c")){
      puntos++;
    }
    System.out.println("--------------------------------------------");
    System.out.println("6 -¿Para que sirve el comando mkdir?");
    System.out.println("a = crear carpetas ");
    System.out.println("b = crear variables");
    System.out.println("c = borrar ficheros");
    respuesta = (System.console().readLine() );;
    
    if (respuesta.equals("a")){
      puntos++;
    }
    System.out.println("--------------------------------------------");
    System.out.println("7 -¿Un teclado es de entrada o de salida de datos?");
    System.out.println("a = entrada");
    System.out.println("b = E/S");
    System.out.println("c = Salida");
    respuesta = (System.console().readLine() );;
    
    if (respuesta.equals("a")){
      puntos++;
    }
    System.out.println("--------------------------------------------");
    System.out.println("8 -¿Que nos enseño primero Luis en Java?");
    System.out.println("a = Crear variables");
    System.out.println("b = Salida de datos por pantalla");
    System.out.println("c = Los condicionales");
    respuesta = (System.console().readLine() );;
    
    if (respuesta.equals("b")){
      puntos++;
    }
    System.out.println("--------------------------------------------");
    System.out.println("9 -¿Para que se usan las FK ?");
    System.out.println("a = identificar la clave primaria");
    System.out.println("b = identificar al objeto");
    System.out.println("c = establecer relaciones entre entidades");
    respuesta = (System.console().readLine() );;
    
    if (respuesta.equals("c")){
      puntos++;
    }
    System.out.println("--------------------------------------------");
    System.out.println("10 -¿Para que se usan las PK ?");
    System.out.println("a = identificar la clave primaria de la entidad");
    System.out.println("b = identificar al objeto");
    System.out.println("c = establecer relaciones entre entidades");
    respuesta = (System.console().readLine() );;
    
    if (respuesta.equals("a")){
      puntos++;
    }
    System.out.println("--------------------------------------------");
    System.out.printf("Has obetenido %d puntos sobre 10.",puntos);
    }
  } 

