public class Funcionario extends Pessoa{
    String funcao;
    String matricula;


    public Funcionario(String nome, String cpf, String rg, int idade, String funcao, String matricula){
        super(nome, cpf, rg, idade);
        this.funcao = funcao;
        this.matricula = matricula;
    }
    
}
