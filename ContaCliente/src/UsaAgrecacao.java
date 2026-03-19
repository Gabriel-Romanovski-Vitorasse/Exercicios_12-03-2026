
void main(){
    cliente cli01 = new cliente("Vinicius", "UVV", "000.000.000-00");
    cliente cli02 = new cliente("Rosalen", "UVV", "000.000.000-01");
    conta conta01 = new conta(1056, 10000.0);
    conta conta02 = new conta(2056, 10000.0);
    
    conta01.cli = cli01;
    conta02.cli = cli02;
    System.out.println("Titular da conta "+conta01.numero+": "+conta01.cli.nome+".");
    
    conta01.sacar(2000);
    conta01.verificarSaldo();
    conta01.depositar(2000);
    System.out.println("");
    
    System.out.println("Titular da conta "+conta02.numero+": "+conta02.cli.nome+".");
    conta01.verificarSaldo();
    conta02.verificarSaldo();
    conta01.transferir(conta02, 2000);
    conta01.verificarSaldo();
    conta02.verificarSaldo();
    
    //System.out.println("Nome do cliente: "+cli01.nome);
}