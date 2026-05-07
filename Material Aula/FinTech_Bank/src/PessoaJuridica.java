/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolab10
 */
public class PessoaJuridica extends Pessoa{
    long cnpj;
    String razaoSocial, nomeRepresentante;

    public PessoaJuridica(String nome, String telefone, String endereco, long cnpj, String razaoSocial, String name) {
        super(nome, telefone, endereco);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        nomeRepresentante = name;
    }
    
    void ExibirDados(){
        System.out.println("===========================");
        System.out.println(getClass());

        System.out.print("Nome: ");System.out.println(nome);
        System.out.print("Numero de Telefone: ");System.out.println(telefone);
        System.out.print("Endereco: ");System.out.println(endereco);
        System.out.print("Numero do CNPJ: ");System.out.println(cnpj);
        System.out.print("Razao Social: ");System.out.println(razaoSocial);
        System.out.print("Nome do Representante: ");System.out.println(nomeRepresentante);

        System.out.println("");
    }
}
