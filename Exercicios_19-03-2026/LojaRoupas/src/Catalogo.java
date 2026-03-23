void main(){
    
    Produto p01 = new Produto("Azeitona", 5, 1000);
    Produto p02 = new Produto("Manteiga", 10, 200);
    
    System.out.print("Valor do estoque de "+p01.nome+": ");
    System.out.println("R$ "+p01.valorEstoque());
    
    System.out.print("Valor do estoque de "+p02.nome+": ");
    System.out.println("R$ "+p02.valorEstoque());
    System.out.println("");
    
    p01.atualizarProduto("Azeite", 10, 500);
    
    System.out.print("Valor do estoque de "+p01.nome+": ");
    System.out.println("R$ "+p01.valorEstoque());
    
}
