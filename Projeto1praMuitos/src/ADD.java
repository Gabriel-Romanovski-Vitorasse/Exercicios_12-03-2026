void main(){
    Socio s01 = new Socio("Vinicius", 1000);
    
    Dependente d01 = new Dependente("Rosalen");
    Dependente d02 = new Dependente("Maria");
    Dependente d03 = new Dependente("Ricardo");
    
    s01.addDependente(d01);
    s01.addDependente(d02);
    s01.addDependente(d03);
    
    d01.s = s01;
    
    System.out.println("Quais sao os dependentes de "+s01.nome+":");
    for(Dependente d : s01.listaDependentes){
        System.out.println(d.nome);
    }
    
    System.out.println("");
    System.out.print("Qual eh o socio responsavel por Rosalen: ");
    System.out.println(d01.s.nome);
}
