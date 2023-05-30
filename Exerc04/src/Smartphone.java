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
    public double calcularDesconto() {
        // Implemente aqui o cálculo do desconto específico para smartphones
        return 0.0;
    }

    public String obterMarca() {
        return marca;
    }
}