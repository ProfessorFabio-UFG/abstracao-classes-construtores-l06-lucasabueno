class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private String tipo;
    private double valor;

    // Construtores
    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public Produto(int codigo, String nome) {
        this(codigo);
        this.nome = nome;
    }

    public Produto(int codigo, String nome, int quantidade) {
        this(codigo, nome);
        this.quantidade = quantidade;
    }

    public Produto(int codigo, String nome, int quantidade, String tipo, double valor) {
        this(codigo, nome, quantidade);
        this.tipo = tipo;
        this.valor = valor;
    }

    // Métodos
    public void vender(int qtd) {
        if (qtd > quantidade) {
            System.out.println("Estoque insuficiente para a venda.");
        } else {
            quantidade -= qtd;
            System.out.println("Venda realizada! Valor total: R$" + (qtd * valor));
        }
    }

    public void comprar(int qtd, double novoValor) {
        this.quantidade += qtd;
        this.valor = novoValor;
    }

    public void comprar(int qtd) {
        this.quantidade += qtd;
    }

    public void inserir(String nome, int quantidade, String tipo, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public boolean igual(Produto outro) {
        return this.nome.equals(outro.nome) && this.tipo.equals(outro.tipo);
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Quantidade: " + quantidade + ", Tipo: " + tipo + ", Valor: R$" + valor;
    }
}
