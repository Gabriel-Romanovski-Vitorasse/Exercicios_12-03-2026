
import gestao_rh_empresa.funcionario;

void main(){
    //funcionario p1 = new funcionario("Mario", "Presidente", 2000, 2025225225);
    funcionario p1 = new funcionario();
    
    p1.cadastrar("Mario", "Presidente", 2000, 2025225225);
    System.out.println("");
    p1.atualizarSalario(5000);
    
}