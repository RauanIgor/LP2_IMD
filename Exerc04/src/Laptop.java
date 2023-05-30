class Laptop implements Produto {
    private String nome;
    private double preco;
    private double tamanhoTela;

    public Laptop(String nome, double preco, double tamanhoTela) {
        this.nome = nome;
        this.preco = preco;
        this.tamanhoTela = tamanhoTela;
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
    public double calcularDesconto() {
        return 0.0;
    }

    public double obterTamanhoTela() {
        return tamanhoTela;
    }
}