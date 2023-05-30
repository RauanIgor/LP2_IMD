public class Quadrado extends Forma{
    private double base;
    public Quadrado(double base){
        this.base = base;
    }
    public double getBase() {
        return base;
    }

    @Override
    public double calculaArea(double base){
        return base*base;
    }
}
