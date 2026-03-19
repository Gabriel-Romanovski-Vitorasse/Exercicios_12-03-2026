/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADM
 */
public class contaComposicao {
    int numero;
    double saldo;
    
    cliente titular = new cliente();

    public contaComposicao() {}

    public contaComposicao(int numero, double saldo) {
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
        System.out.println(" ");
    }
    
    void transferir(){
        System.out.println("Transfere.");
        System.out.println(" ");
    }
    void verificarSaldo(){
        System.out.println("Verificar Saldo: "+saldo);
        System.out.println(" ");
    }
    boolean verificarTransacao(double valor){
        return true;
    }
}
