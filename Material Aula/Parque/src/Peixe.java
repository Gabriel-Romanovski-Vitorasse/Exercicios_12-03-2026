public class Peixe extends Animal implements IPetShop{
    
    void respirar(){
        System.out.println("Peixe: respirou - AGUA");
    }
    void falar(){
        System.out.println("Peixe: Falou - Glub Glub");
    }
    public void tratar(){
        System.out.println("Peixe: Tratar - Dar Banho");
    }
}
