/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolab10
 */
public class conta {
    int numero;
    private double saldo;
    
    cliente cli;

    public conta() {}

    public conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    boolean sacar(double valor){
        if(verificarTransacao(valor)){
            saldo -= valor;
            return true;
        }
        return false;
    }
    
    void depositar(double valor){
        System.out.println("Saldo antigo: "+saldo);
        saldo += valor;
        System.out.println("Saldo novo: "+saldo);
    }
    
    void transferir(conta destino, double valor){
        //this.sacar(valor);
        sacar(valor);
        destino.depositar(valor);
    }
    void verificarSaldo(){
        System.out.println("Saldo da conta "+numero+": "+saldo);
    }
    private boolean verificarTransacao(double valor){
        return saldo >= valor;
    }
    
    
}
