public class App {
    public static void main(String[] args) throws Exception {
        Produto smartphone = new Smartphone("A1", 100, "sansung");
        Produto smartphone2 = new Smartphone("A2", 200, "sansung");
        Produto Laptop = new Laptop("A1", 50, 16.5);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(Laptop);
        carrinho.adicionarProduto(smartphone);
        carrinho.adicionarProduto(smartphone2);
        System.out.println("Preço total da compra: "+carrinho.calcularTotalCompra());
        carrinho.removerProduto(Laptop);
        System.out.print("Preço total da compra sem o laptop e com desconto: ");
        System.out.println(carrinho.calcularTotalCompra()-(smartphone.calcularDesconto(10)+smartphone2.calcularDesconto(5)));
    }
}
