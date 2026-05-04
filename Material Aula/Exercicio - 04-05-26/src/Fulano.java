class Fulano implements INome{
    public String Nome() {
        return "Fulano da Silva";
    }
    
    public void MostraNome() {
        System.out.println("***> "+Nome()+" <***");
    }
}