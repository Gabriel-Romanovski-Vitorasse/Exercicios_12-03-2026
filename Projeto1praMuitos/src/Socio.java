
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunolab10
 */
public class Socio {
    String nome;
    float valorPagar;
    
    List<Dependente> listaDependentes = new ArrayList<>();

    public Socio() {}

    public Socio(String nome, float valorPagar) {
        this.nome = nome;
        this.valorPagar = valorPagar;
    }   
    
    void addDependente(Dependente d){
        listaDependentes.add(d);
    }
    
    void remover(Dependente d){
        listaDependentes.remove(d);
    }
    
}
