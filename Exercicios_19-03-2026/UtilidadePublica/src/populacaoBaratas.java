/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADM
 */
public class populacaoBaratas {
    double qtde;

    public populacaoBaratas() {
        this.qtde = 10 + Math.random() * 40;
    }
    
    void aumentaBaratas(){
        qtde *= 4;
    }
    
    void spray(){
        qtde *= 0.9;
    }
    
    void getQtdBaratas(){
        System.out.print("Total de baratas: ");
        System.out.printf("%.2f", qtde);
        System.out.println("");
    }
    
}
