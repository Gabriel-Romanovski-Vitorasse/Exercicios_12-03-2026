void main(){
    System.out.println("== SerVivo ==");
    SerVivo sv = new SerVivo();
    sv.tamanho = 10;
    sv.nascer();
    sv.crescer();
    sv.morrer();
    
    System.out.println("== Animal ==");
    Animal an = new Animal();
    an.nascer();
    an.mover();
    an.respirar();
    
    System.out.println("== Manifero ==");
    Manifero ma = new Manifero();
    ma.nascer();
    ma.respirar();
    
    System.out.println("== Peixe ==");
    Peixe px = new Peixe();
    px.nascer();
    px.mover();
    px.respirar();
}
