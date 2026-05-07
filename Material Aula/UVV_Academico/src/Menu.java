void main(){
    List<Professor> listaProfessores = new ArrayList<>();

    listaProfessores.add(new ProfDE("Joao", 1, 40, 40));
    listaProfessores.add(new ProfDE("Maria", 2, 40, 50));
    listaProfessores.add(new ProfHorista("Jose", 3, 14, 10));
    listaProfessores.add(new ProfHorista("Fernando", 4, 15, 20));
    listaProfessores.add(new ProfHorista("Ana", 5, 16, 30));

    for(Professor p : listaProfessores){
        System.out.println("===========================");
        System.out.println(p.getClass());

        System.out.println("Nome do Professor:");
        System.out.println(p.nome);

        System.out.println("\nSalario do Professor:");
        p.calcularBeneficio();
        System.out.println(p.getBeneficio());
        System.out.println("");

        if(p instanceof ProfHorista)
            System.out.println("valorHora: " + ((ProfHorista)p).valorHora);
}
}
