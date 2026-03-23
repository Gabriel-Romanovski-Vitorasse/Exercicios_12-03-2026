
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alunolab10
 */
public class AgendaTelefonica {
    Map<String, Contato> agenda = new HashMap<>();
    
    void inserir(String nome, Contato c){
        agenda.put(nome, c);
    }
    Contato buscar(String nome){
        if(nome != null) return agenda.get(nome);
        return null;
    }
    void remover(String nome){}
    int tamanho(){
        return agenda.size();
    }
    }
