public class Professor extends Pessoa{
    private String siape;

    public Professor(String nome, String siape) {
        super(nome);
        this.siape = siape;
    }

    public String getsiape() {
        return siape;
    }

    public void setsiape(String siape) {
        this.siape = siape;
    }

    @Override
    public void apresentar(){
        //System.out.println("Olá, meu nome é "+getNome());
        super.apresentar();
        System.out.println("Siape: "+getsiape());
    }
}
