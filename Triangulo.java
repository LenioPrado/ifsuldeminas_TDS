public class Triangulo extends Figura{

    private double base;
    private double altura;

    public Triangulo(double base, double altura, String cor){
        this.base = base;
        this.altura = altura;
        this.setCor(cor);
    }

    @Override
    public String toString() {
        return String.format("Base: %s. Altura: %s", this.base, this.altura);
    }

    public double area(){
        return this.base * this.altura / 2;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
