public class Produto {

    private int codigo, quantidade, estoque;
    private double peso, valor;
    private String nome, cor;

    public void vender() {

        if (quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println("Venda concluída. Estoque restante: " + getEstoque());
        } else {
            System.out.println("A quantidade no estoque não é suficiente para a venda.");
        }

    }

    public void mostrarEstoque() {

        System.out.println("\nQuantidade no estoque atualmente do produto " + getNome() + ": " + (getEstoque() - getQuantidade()) + " unidades.");

    }


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
