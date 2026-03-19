
void main(){
    cliente cli01 = new cliente("Vinicius", "UVV", "000.000.000-00");
    conta conta01 = new conta(1056, 10000.0);
    
    conta01.c = cli01;
    System.out.println("Titular da conta "+conta01.numero+": "+conta01.c.nome+".");
    
    conta01.saca(2000);
    conta01.verificarSaldo();
    conta01.deposita(2000);
    conta01.verificarSaldo();
    conta01.transfere();
    conta01.verificarTransacao();
    
    //System.out.println("Nome do cliente: "+cli01.nome);
    

    
}