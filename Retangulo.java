public class Retangulo extends Figura {

    private double lado1;
    private double lado2;

    public Retangulo(double l1, double l2, String cor){
        this.lado1 = l1;
        this.lado2 = l2;
        this.setCor(cor);
    }

    @Override
    public String toString() {
        return "Lado1: " + this.lado1 + " Lado2: " + this.lado2;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado1(double l1){
        this.lado1 = l1;
    }

    public double getLado1(){
        return this.lado1;
    }

    public double area(){
        return this.lado1 * this.lado2;
    }
    
}