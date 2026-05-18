import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Golphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Golphin extends Actor
{
    public void act()
    {
        // Chama o método que criamos abaixo para organizar o código
        moverPeloTeclado();
    }
    
    // Criamos um método separado só para o movimento. Isso deixa o código mais limpo!
    private void moverPeloTeclado()
    {
        // Define a velocidade (quantos pixels ele anda por frame)
        int velocidade = 4; 
        
        // Pega as posições X e Y atuais do golfinho
        int xAtual = getX();
        int yAtual = getY();

        // Verifica a seta para a ESQUERDA ou tecla 'A'
        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")) {
            setLocation(xAtual - velocidade, yAtual);
        }
        
        // Verifica a seta para a DIREITA ou tecla 'D'
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")) {
            setLocation(xAtual + velocidade, yAtual);
        }
        
        // Verifica a seta para CIMA ou tecla 'W'
        if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w")) {
            setLocation(xAtual, yAtual - velocidade);
        }
        
        // Verifica a seta para BAIXO ou tecla 'S'
        if (Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s")) {
            setLocation(xAtual, yAtual + velocidade);
        }
        if (Greenfoot.isKeyDown("q")) {
            if (Greenfoot.isKeyDown("q") && Greenfoot.isKeyDown("shift")) turn(2 + velocidade);
            else turn(2);
        }
        if (Greenfoot.isKeyDown("e")) {
            if (Greenfoot.isKeyDown("e") && Greenfoot.isKeyDown("shift")) turn(2 + velocidade);
            else turn(2);
        }
    }
}