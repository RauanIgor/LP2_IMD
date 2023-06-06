import java.util.ArrayList;
public class Conta {
    String identificador;
    String chavePix;
    double saldo;
    
    
    
    public Conta(String identificador, String chavePix, double saldo){
        this.identificador = identificador;
        this.chavePix = chavePix;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
    
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saque(double valor){
        if(valor > this.saldo){
            System.out.println("Saldo insulficiente");
        }
        else{
            this.saldo -= valor;
            System.out.println("Saque Realizado");
        }
    }

    public void deposito(double valor){
        if(valor <= 0){
            System.out.println("Deposito Negado");
        }
        else{
            this.saldo += valor;
            System.out.println("Deposito Realizado");
        }
    }

    public void tranferenciaIdentificador(ArrayList<Conta> contas, String identificador, double valor){
        if(valor <= 0){
            System.out.println("Tranferencia Negado valor inferior a zero");
            return;
        }else if(this.saldo < valor){
            System.out.println("Tranferencia Negado, saldo insulficiente");
            return;
        }
        else{
            for (Conta item : contas){
                if(item.getIdentificador() == identificador){
                    double novoValor = item.getSaldo()+valor;
                    item.setSaldo(novoValor);
                    this.saldo -= valor;
                    System.out.println("Transferencia por identificador Realizado");
                    break;
                }
            }
        }


    }

    public void tranferenciaPix(ArrayList<Conta> contas, String pix, double valor){
        if(valor <= 0){
            System.out.println("Pix Negado valor inferior a zero");
            return;
        }else if(this.saldo < valor){
            System.out.println("Pix Negado, saldo insulficiente");
            return;
        }
        else{
            for (Conta item : contas){
                if(item.getChavePix() == pix){
                    double novoValor = item.getSaldo()+valor;
                    item.setSaldo(novoValor);
                    this.saldo -= valor;
                    System.out.println("Transferencia pix Realizado");
                    break;
                }
            }
        }


    }
}


