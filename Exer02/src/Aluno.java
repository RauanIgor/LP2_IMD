public class Aluno extends Pessoa{

    private String matricula;

    public Aluno(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void apresentar(){
        //System.out.println("Olá, meu nome é "+getNome());
        super.apresentar();
        System.out.println("Matricula: "+getMatricula());
    }
}
