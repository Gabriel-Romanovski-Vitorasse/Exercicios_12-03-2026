package gestao_rh_empresa;

/**
 *
 * @author alunolab10
 */
public class funcionario {
    
    public int matricula;
    public String nome, cargoAtual;
    public float salarioAtual;
    
    public void cadastrar(String nome, String cargo, float salario, int matricula){
        this.nome = nome;
        cargoAtual = cargo;
        salarioAtual = salario;
        this.matricula = matricula;
        
        System.out.println("Cadastro feito.");
        System.out.println("");
    }
    
    public void consultar(){
        System.out.println("Consultar funcionario:");
        System.out.println("Nome: "+nome);
        System.out.println("Cargo: "+cargoAtual);
        System.out.println("Salario Atual: "+salarioAtual);
        System.out.println("Numero de matricula: "+matricula);
        System.out.println("");
    }
    
    public void atualizarSalario(float novoSalario){
        System.out.println("Atualizar Salario:");
        System.out.println("Salario antigo: "+salarioAtual);
        salarioAtual = novoSalario;
        System.out.println("Salario novo: "+salarioAtual);
        System.out.println("");
    }
    
    public void listarDependentes(){
        System.out.println("Listar Dependentes.");
        System.out.println("");
    }
}