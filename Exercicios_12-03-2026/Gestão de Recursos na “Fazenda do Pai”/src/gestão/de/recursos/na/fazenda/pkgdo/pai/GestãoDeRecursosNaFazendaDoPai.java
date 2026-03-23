/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestão.de.recursos.na.fazenda.pkgdo.pai;

/**
 *
 * @author alunolab10
 */
public class GestãoDeRecursosNaFazendaDoPai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int weigth, count = 0, total = 0, maior = 0, menor = 0;
       float media;
       
       do{
            weigth = InOut.leInt("Informe o peso do boi:" + (count+1));
            if(weigth != 0){
                total = weigth + total;
                count++;
                if(weigth > maior) maior = weigth;
                else menor = weigth;
            }
       }while(weigth != 0);
       
       if(count == 0) System.out.println("Nenhum boi foi cadastrado");
       else{
           media = total / count;
           System.out.println("Media de peso dos bois: " + media);
           System.out.println("Peso do maior boi: " + maior);
           System.out.println("Peso do menor boi: " + menor);
       }
    }
    
}
