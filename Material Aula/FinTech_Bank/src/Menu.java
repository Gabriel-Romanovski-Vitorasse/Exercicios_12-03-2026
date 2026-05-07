void main(){
    PessoaFisica pf01 = new PessoaFisica("Vinicius", "4002-8922", "Vila Velha, 20", 00011122234, 1);
    PessoaJuridica pj01 = new PessoaJuridica(
            "Tech Solutions", 
            "(11) 98765-4321", 
            "Avenida Paulista, 1000", 
            12345678000195L, 
            "Tech Solutions Brasil LTDA", 
            "Carlos Ferreira"
        );
    pf01.ExibirDados();
    pj01.ExibirDados();
}
