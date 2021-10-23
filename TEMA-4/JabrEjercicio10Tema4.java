/**
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 * nacimiento.
 * 
 * @author Jose Antonio Benitez Ruiz
 * 
 * 
 */
public class JabrEjercicio10Tema4 {
  public static void main (String[] args) {
    
    System.out.print("Dime tu mes de nacimiento: ");
    String mesNacimiento = (System.console().readLine() );;
    System.out.print("Dime tu dia de nacimiento: ");
      int diaNacimiento = Integer.parseInt(System.console().readLine() );
    switch (mesNacimiento.toLowerCase()){
      case "enero":
      
      if ((diaNacimiento <= 20 ) && (diaNacimiento >= 1)){
        System.out.println("Capriconrn");
      }else if((diaNacimiento <= 31 ) && (diaNacimiento >= 21)){
        System.out.println("Aquarius");
      }else {
        System.out.println("No existe ese dia");
      }
      break;
      
      case "febrero":
      if ((diaNacimiento <= 19 ) && (diaNacimiento >= 1)){
        System.out.println("Aquarius");
      }else if((diaNacimiento <= 28 ) && (diaNacimiento >= 20)){
        System.out.println("Pisces");
      }else {
        System.out.println("No existe ese dia");
      }
      break;
      case "marzo":
      if ((diaNacimiento <= 21 ) && (diaNacimiento >= 1)){
        System.out.println("Pisces");
      }else if((diaNacimiento <= 31 ) && (diaNacimiento >= 22)){
        System.out.println("Aries");
      }else {
        System.out.println("No existe ese dia");
      }
      break;
      case "abril":
      if ((diaNacimiento <= 20 ) && (diaNacimiento >= 1)){
        System.out.println("Aries");
      }else if((diaNacimiento <= 30 ) && (diaNacimiento >= 21)){
        System.out.println("Taurus");
      }else {
        System.out.println("No existe ese dia");
      }
      break;
      case "mayo":
      if ((diaNacimiento <= 21 ) && (diaNacimiento >= 1)){
        System.out.println("Taurus");
      }else if((diaNacimiento <= 31 ) && (diaNacimiento >= 22)){
        System.out.println("Gemini");
      }else {
        System.out.println("No existe ese dia");
      }
      break;
      case "junio":
      if ((diaNacimiento <= 21 ) && (diaNacimiento >= 1)){
        System.out.println("Gemini");
      }else if((diaNacimiento <= 30 ) && (diaNacimiento >= 22)){
        System.out.println("Cancer");
      }else {
        System.out.println("No existe ese dia");
      }
      break;
      case "julio":
      if ((diaNacimiento <= 23 ) && (diaNacimiento >= 1)){
        System.out.println("Cancer");
      }else if((diaNacimiento <= 31 ) && (diaNacimiento >= 24)){
        System.out.println("Leo");
      }else {
        System.out.println("No existe ese dia");
      }
      break;
      case "agosto":
      if ((diaNacimiento <= 23 ) && (diaNacimiento >= 1)){
        System.out.println("Leo");
      }else if((diaNacimiento <= 31 ) && (diaNacimiento >= 24)){
        System.out.println("Virgo");
      }else {
        System.out.println("No existe ese dia");
      }
      break;
      case "septiembre":
      if ((diaNacimiento <= 23 ) && (diaNacimiento >= 1)){
        System.out.println("Virgo");
      }else if((diaNacimiento <= 30 ) && (diaNacimiento >= 24)){
        System.out.println("Libra");
      }else {
        System.out.println("No existe ese dia");
      }
      break;
      case "octubre":
      if ((diaNacimiento <= 23 ) && (diaNacimiento >= 1)){
        System.out.println("Libra");
      }else if((diaNacimiento <= 31 ) && (diaNacimiento >= 24)){
        System.out.println("Scorpio");
      }else {
        System.out.println("No existe ese dia");
      }
      break;
      case "noviembre":
      if ((diaNacimiento <= 22 ) && (diaNacimiento >= 1)){
        System.out.println("Scorpio");
      }else if((diaNacimiento <= 30 ) && (diaNacimiento >= 23)){
        System.out.println("Sagittarious");
      }else {
        System.out.println("No existe ese dia");
      }
      break;
      case "diciembre":
      if ((diaNacimiento <= 22 ) && (diaNacimiento >= 1)){
        System.out.println("Sagittarious");
      }else if((diaNacimiento <= 31 ) && (diaNacimiento >= 23)){
        System.out.println("Capricorn");
      }else {
        System.out.println("No existe ese dia");
      }
      break;
      default:
          System.out.print("No existe ese mes");
        }
      }
  }


