void main(){
    
    AgendaTelefonica ag = new AgendaTelefonica();
    
    ag.inserir("Vinicius", new Contato("Vinicius", "123456", "professor", 19));
    ag.inserir("Rosalen", new Contato("Rosalen", "40028922", "tutor", 18));
    ag.inserir("Ricardo", new Contato("Ricardo", "0800", "aluno", 22));
    
    System.out.print("Qual o numero tel do Vinicius: ");
    System.out.println(ag.buscar("Vinicius").numero);
    
    System.out.print("Qual o apelido de Vinicius: ");
    System.out.println(ag.buscar("Vinicius").apelido);
    
    System.out.print("Quantos contatos tem na agenda: ");
    System.out.println(ag.tamanho());
}
