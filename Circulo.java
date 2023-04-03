public class Circulo extends Figura {
    
    private double raio;

    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.setCor(cor);
    }

    @Override
    public String toString() {
        return String.format("Raio: %s", this.raio);
    }

    public double area(){
        return Math.pow(this.raio, 2) * Math.PI;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
