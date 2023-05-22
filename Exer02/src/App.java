public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("João");
        Pessoa professor = new Professor("José", "2014755");
        Pessoa aluno = new Aluno("Chico", "20147558957");

        pessoa.apresentar();
        professor.apresentar();
        aluno.apresentar();
    }
}
