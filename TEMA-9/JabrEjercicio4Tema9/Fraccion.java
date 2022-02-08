public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion division(Fraccion operacion2){
        return new Fraccion(this.denominador * operacion2.getNumerador(),this.numerador * operacion2.getDenominador());
    }
    
    public Fraccion multiplica(Fraccion operacion2){
        return new Fraccion(this.numerador * operacion2.getNumerador(),this.denominador * operacion2.getDenominador());
    }

    public Fraccion invierte(){
        return new Fraccion(this.denominador,this.numerador);
    }



    public int getNumerador() {
        return this.numerador;
    }
    public int getDenominador() {
        return this.denominador;
    }

    

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    public Fraccion simplifica(){
        int divisor = 9;
        boolean irreducible = true;
        int num = this.numerador;
        int den = this.denominador;
        while ((irreducible) && (divisor > 1)){
            if ((num % divisor == 0) && (den % divisor == 0)){
                
                irreducible = false;
            }
            divisor--;
        }
        return new Fraccion(this.numerador/divisor,this.denominador/divisor);
    }
}