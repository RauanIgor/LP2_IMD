public class Triangulo extends Retangulo{
    
    public Triangulo(double base, double altura){
        super(base, altura);
    }

    @Override
    public double calculaArea(){
        return (this.getBase() * this.getAltura())/2;
    }
}
