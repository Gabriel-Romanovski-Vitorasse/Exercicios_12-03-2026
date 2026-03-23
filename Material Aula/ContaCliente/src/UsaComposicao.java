
void main(){
    
    contaComposicao conta01 = new contaComposicao(1056, 10000.0);
    conta01.titular.nome = "Vinicius";
    conta01.titular.cpf = "000.000.000-00";
    conta01.titular.endereco = "UVV";
    
    System.out.println("Titular da conta "+conta01.numero+": "+conta01.titular.nome+".");
}
