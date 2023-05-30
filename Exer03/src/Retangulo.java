public class Retangulo extends Forma{
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }
    public double calculaArea(){
        return (this.base * this.altura);
    }

    public double calculaArea(double base){
        return (base * this.altura);
    }
}
