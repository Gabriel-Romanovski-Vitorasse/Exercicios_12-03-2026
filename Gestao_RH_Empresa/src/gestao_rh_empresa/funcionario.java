package gestao_rh_empresa;

/**
 *
 * @author alunolab10
 */
public class funcionario {
    
    public int matricula;
    public String nome, cargoAtual;
    public float salarioAtual;
    
    //public funcionario (String nome, String cargo, float salario, int matricula){
        //this.nome = nome;
        //cargoAtual = cargo;
        //salarioAtual = salario;
        //this.matricula = matricula;
    //} 
    
    public void cadastrar(String nome, String cargo, float salario, int matricula){
        this.nome = nome;
        cargoAtual = cargo;
        salarioAtual = salario;
        this.matricula = matricula;
        
        System.out.println("Ola, sou "+nome+". Sou o "+cargoAtual+".");
        System.out.println("Meu salario eh "+salarioAtual+" e meu numero de matricula eh "+matricula+".");
    }
    
    public void consultar(){
        System.out.println("Consultar funcionario.");
    }
    
    public void atualizarSalario(float novoSalario){
        System.out.println("Salario antigo: "+salarioAtual);
        salarioAtual = novoSalario;
        System.out.println("Salario novo: "+salarioAtual);
    }
    
    public void listarDependentes(){
        System.out.println("Listar Dependentes.");
    }
}