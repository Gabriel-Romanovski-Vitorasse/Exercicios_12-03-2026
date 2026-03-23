package empresaanuncioonline;

/**
 *
 * @author ADM
 */
public class Anuncio {
    
    public int ID, publicar;
    public float valor;
    public String palavras, titulo;
    public String diasInsercao, dataPublicacao;
    public String nomeContato, telefone, obs;
    
    public void remeterViaEmail(){
        System.out.println("Remeter Via Email.");
        System.out.println(" ");
    }
    
    public void manter(){
        System.out.println("Manter Anuncio.");
        System.out.println(" ");
    }
    
    public void anunciar(int ID, String titulo, String periodo){
        this.ID = ID;
        this.titulo = titulo;
        diasInsercao = periodo;
        
        System.out.println("Anuncio feito.");
        System.out.println(" ");
    }
    
    public void localizar(){
        System.out.println("Localizar Anuncio.");
        System.out.println(" ");
    }
    
}
