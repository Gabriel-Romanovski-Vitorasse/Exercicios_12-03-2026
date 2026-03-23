
import aula_01.Alice;

void main(){
    
    System.out.println("Iniciando Alice!");
    System.out.println("");
    
    //int idade = 28;
    Alice anabelle = new Alice();
    
    anabelle.corCabelo = "Roxo";
    anabelle.posY = 10;
    
    if(anabelle.move()){
        System.out.println("Alice se moveu.");
    }
    anabelle.turn();
    anabelle.say("Buuu! Tenho cabelo " + anabelle.corCabelo + "!");
    
    //Alice anabella = new Alice();
    //anabella.corCabelo = "Amarelo";
    //anabella.posZ = 20;
    Alice anabella = new Alice("Amarelo", 20);
    anabella.say("HAHHAHAHHAHAHA! Tenho cabelo " + anabella.corCabelo + "!");   
    
}

