public class App {
    public static void main(String[] args) throws Exception {
        Quadrado quadrado = new Quadrado(10);
        System.out.println("Area do QUADRADO é: "+quadrado.calculaArea(quadrado.getBase()));

        Retangulo retangulo = new Retangulo(10, 5);
        System.out.println("Area do RETANGULO é: "+retangulo.calculaArea());

        Triangulo triangulo = new Triangulo(10, 8);
        System.out.println("Area do TRIANGULO é: "+triangulo.calculaArea());

        Circulo circulo = new Circulo(5);
        System.out.println("Area do CIRCULO é: "+circulo.calculaArea(circulo.getRaio()));
    }
}
