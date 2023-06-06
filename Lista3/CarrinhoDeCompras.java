import java.util.ArrayList;
public class CarrinhoDeCompras {
    ArrayList<Produto> produtos = new ArrayList<Produto>(); 
    
    public  void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void removerProduto(Produto produto){
        produtos.remove(produto);
    }

    public double  calcularTotalCompra(){
        double valorTotal = 0;
        for(Produto item : produtos){
            valorTotal += item.obterPreco();
        }
        return valorTotal;
    }
}
