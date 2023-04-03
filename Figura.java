public abstract class Figura {

    private String cor;

    public abstract double area();

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return this.cor;
    }
}