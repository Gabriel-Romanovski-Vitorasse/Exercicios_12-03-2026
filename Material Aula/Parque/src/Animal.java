
public abstract class Animal extends SerVivo{
    String sexo;
    int numeroPatas;
    
    void respirar(){
        System.out.println("Animal: Respirou - AR");
    }
    void mover(){
    System.out.println("Animal: Moveu");
    }
    
    /*void falar(){
        System.out.println("Animal: Falou");
    }*/
    
    abstract void falar();
}
