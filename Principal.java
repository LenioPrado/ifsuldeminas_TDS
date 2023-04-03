public class Principal {
    public static void main (String[] args){
        // Figura figura = new Figura();
        // figura.setCor("Roxo");

        // String cor = figura.getCor();
        // System.out.println("A cor é: " + cor);

        Retangulo retangulo = new Retangulo(10, 20, "Amarelo");
        // retangulo.setLado1(10);
        // retangulo.setLado2(20);
        // System.out.println("Area do retangulo: " + retangulo.area());

        Quadrado quadrado = new Quadrado(10, "Branco");
        // System.out.println("Area do quadrado: " + quadrado.area());

        Triangulo triangulo = new Triangulo(2, 5, "Azul");
        // // triangulo.setBase(2);
        // // triangulo.setAltura(5);
        // System.out.println("Area do triangulo: " + triangulo.area());

        Circulo circulo = new Circulo(15, "Verde");
        // // circulo.setRaio(15);
        // System.out.println("Area do circulo: " + circulo.area());

        System.out.println("Retangulo: " + retangulo);
        System.out.println("Quadrado: " + quadrado);
        System.out.println("Circulo: " + circulo);
        System.out.println("Triangulo: " + triangulo);
    }
}
