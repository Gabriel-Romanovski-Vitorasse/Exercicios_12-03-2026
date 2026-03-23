/**
 *
 * @author alunolab10
 */
public class Produto {
    String nome;
    double preco;
    int estoque;

    public Produto() {}

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }
    
    
    double valorEstoque(){
        return preco * estoque;
    }
    void atualizarProduto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        
        System.out.println("Produto atualizado com sucesso.");
    }
    
}
