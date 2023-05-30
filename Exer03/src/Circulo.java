public class Circulo extends Forma{
    private double raio;
    final double PI = 3.1416;

    public Circulo(double raio){
        this.raio = raio;
    }
    public double getRaio() {
        return raio;
    }

    @Override
    public double calculaArea(double raio){
        return PI*(raio*raio);
    }
}
