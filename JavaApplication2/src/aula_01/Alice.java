package aula_01;

/**
 *
 * @author alunolab10
 */
public class Alice {
   public float tamanho;
   public String corCabelo;
   public int posX, posY, posZ;
   
   public Alice(){}
   public Alice(String cor, int z){
       corCabelo = cor;
       posZ = z;
   }
   
   public boolean move(){
       System.out.println("Alice: move()");
       return true;
   }
   
   public void turn(){
       System.out.println("Alice: turn()");
   }
   
   public void say(String text){
       System.out.println("Alice: say(): " + text);
   }
   
}
