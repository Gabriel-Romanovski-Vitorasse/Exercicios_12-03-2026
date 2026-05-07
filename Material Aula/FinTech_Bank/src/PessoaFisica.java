/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolab10
 */
public class PessoaFisica extends Pessoa{
    long cpf;
    int estadoCivil;

    public PessoaFisica(String nome, String telefone, String endereco, long cpf, int estadoCivil) {
        super(nome, telefone, endereco);
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    } 
    
    void ExibirDados(){
        System.out.println("===========================");
        System.out.println(getClass());

        System.out.print("Nome: ");System.out.println(nome);
        System.out.print("Numero de Telefone: ");System.out.println(telefone);
        System.out.print("Endereco: ");System.out.println(endereco);
        System.out.print("Numero de CPF: ");System.out.println(cpf);
        System.out.print("Estado Civil: ");System.out.println(estadoCivil);

        System.out.println("");
    }
}
