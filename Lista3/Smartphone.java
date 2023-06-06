class Smartphone implements Produto {
    private String nome;
    private double preco;
    private String marca;

    public Smartphone(String nome, double preco, String marca) {
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
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

    public String obterMarca() {
        return marca;
    }
}