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
    double saldo;
    
    cliente c;

    public conta() {}

    public conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    boolean saca(double valor){
        saldo -= valor;
        return true;
    }
    
    void deposita(double valor){
        System.out.println("Saldo antigo: "+saldo);
        saldo += valor;
        System.out.println("Saldo novo: "+saldo);
        System.out.println(" ");
    }
    
    void transfere(){
        System.out.println("Transfere.");
        System.out.println(" ");
    }
    void verificarSaldo(){
        System.out.println("Verificar Saldo: "+saldo);
        System.out.println(" ");
    }
    boolean verificarTransacao(){
        return true;
    }
    
    
}
