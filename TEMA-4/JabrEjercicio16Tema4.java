/**
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos
 * está siendo infiel. El programa irá haciendo preguntas que el usuario contestará
 * con verdadero o falso. Cada pregunta contestada como verdadero sumará 3
 * puntos. Las preguntas contestadas con falso no suman puntos. A continuación
 * se listan las preguntas del test.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio16Tema4 {
    public static void main(String[] args) {
    int puntos = 0; // defino variables para puntos.
    String respuesta; // defino variable para la respuesta.
    
    System.out.println("-------CUESTIONARIO Innfidelidad-------");
    
    System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    System.out.println("a) verdadero \nb) falso"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos+= 3;
    }

    System.out.println("2. Ha aumentado sus gastos de vestuario");
    System.out.println("a) verdadero \nb) falso"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("a")) {
      puntos+= 3;
    }

    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
    System.out.println("a) verdadero \nb) falso"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos+= 3;
    }
    
    System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    System.out.println("a) verdadero \nb) falso"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos+= 3;
    }
    
    System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
    System.out.println("a) verdadero \nb) falso"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos+= 3;
    }
        
    System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    System.out.println("a) verdadero \nb) falso"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos+= 3;
    }

    System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    System.out.println("a) verdadero \nb) falso"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("a")) {
      puntos+= 3;
    }
    
    System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    System.out.println("a) verdadero \nb) falso"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos+= 3;
    }
    
    System.out.println("9. Has notado que últimamente se perfuma más");
    System.out.println("a) verdadero \nb) falso"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos+= 3;
    }
    
    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    System.out.println("a) verdadero \nb) falso"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos+= 3;
    }
    System.out.println("\nHa obtenido " + puntos + " puntos.");

    if ((puntos >= 0)&&(puntos <=10)){
        System.out.print("¡Enorabuena! Tu pareja parece ser totalmente fiel.");
    }
    
    if ((puntos >= 11) && (puntos <=22)){
        System.out.print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia");
    }
    if ((puntos >= 22) && (puntos <=30)){
        System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    }
    
  }

        
}
