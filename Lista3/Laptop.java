class Laptop implements Produto {
    private String nome;
    private double preco;
    
    private double tamanhoTela;
    
    public Laptop(String nome, double preco, double tamanhoTela) {
        this.nome = nome;
        this.preco = preco;
        this.tamanhoTela = tamanhoTela;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    @Override
    public String obterNome() {
        return nome;
    }

    @Override
    public double obterPreco() {
        return preco;
    }

    @Override
    public double calcularDesconto(double desconto) {
        double valorDesconto = this.obterPreco() * (desconto/100);
        return valorDesconto;
    }

    public double obterTamanhoTela() {
        return tamanhoTela;
    }
}