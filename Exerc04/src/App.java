public class App {
    public static void main(String[] args) throws Exception {
        Produto smartphone = new Smartphone("A1", 100, "sansung");
        Produto smartphone2 = new Smartphone("A2", 200, "sansung");
        Produto Laptop = new Laptop("A1", 50, 16.5);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(Laptop);
        carrinho.adicionarProduto(smartphone);
        carrinho.adicionarProduto(smartphone2);
        System.out.println(carrinho.calcularTotalCompra());
        carrinho.removerProduto(Laptop);
        System.out.println(carrinho.calcularTotalCompra());
    }
}
