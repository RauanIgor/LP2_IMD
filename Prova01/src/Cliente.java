public class Cliente extends Pessoa {
    Conta conta;
    
    
    public Cliente(String nome, String cpf, String rg, String identificador, int idade){
        super(nome, cpf, rg, idade);
        
        if( idade > 18){
            this.conta = new Conta(identificador, cpf, 2000);
        }
        else{
            System.out.println("Cliente nao pode ter conta!");
        }
        
    }
    public Conta getConta() {
        return conta;
    }
  
    
}
