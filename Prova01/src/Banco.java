import java.util.ArrayList;
public class Banco {
    
    
    public static void main(String[] args) throws Exception {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Conta> contas = new ArrayList<Conta>();

        Cliente cliente1 = new Cliente("Igor", "00000", "11111", "000111", 20);
        Cliente cliente2 = new Cliente("Rauan", "22222", "11111", "222111", 120);
        clientes.add(cliente1);
        clientes.add(cliente2);
        contas.add(cliente1.getConta());
        contas.add(cliente2.getConta());

        cliente1.conta.deposito(100);
        System.out.println(cliente1.conta.getSaldo());
        
        cliente1.conta.tranferenciaIdentificador(contas, "222111", 10);
        System.out.println(cliente2.conta.getSaldo());

        cliente1.conta.saque(1000);

        
    }
}
