/*
Ejercicio 2 Examen 2º Evalucacion.

Se quiere implementar una aplicación para la gestión de un acuario. El primer paso será modelar las
clases necesarias. Crea las clases AnimalDeAcuario (no instanciable), Pez y Estrella estableciendo
la jerarquía correctamente. De todos los animales del acuario se debe conocer su nombre y color.
Además, se debe conocer la raza de los peces y el número de brazos de las estrellas. Si un animal
acuático se aparea con otro, nace un animalillo de la misma especie con las características de los
padres cogidas de forma aleatoria. Por ejemplo, si se aparean dos estrellas de mar, una se llama Alicia
y la otra Alfonso, el nombre de la cría podría ser Alicia o Alfonso. Si Alicia tiene 5 brazos y Alfonso
tiene 6 brazos, la cría puede tener 5 o 6 brazos pero no otra cantidad. Con los peces sucede lo mismo. 

@author Jose Antonio Bentiez Ruiz
*/
package Ex04jabr3;
public class Ex04jabr3 {
    public static void main(String[] args) {
        Pez pepe = new Pez("Pepe", "azul", "globo");
        Pez casilda = new Pez("Casilda", "naranja", "tropical");

        System.out.println(pepe);
        System.out.println(casilda);
        Estrella lola = new Estrella("Lola", "violeta", 6);
        Estrella rodolfo = new Estrella("Rodolfo", "verde", 7);
        System.out.println(lola);
        System.out.println(rodolfo);
        // Apareamiento
        Pez pececillo = pepe.seApareaCon(casilda);
        Estrella estrellita = lola.seApareaCon(rodolfo);
        System.out.println(pececillo);
        System.out.println(estrellita);
    }

}
