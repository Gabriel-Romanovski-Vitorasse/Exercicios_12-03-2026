import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class ReproduzirSom {
    public static void main(String[] args) {
        try {
            // Caminho para o arquivo .wav (corrigido sem as aspas internas)
            File audioFile = new File("C:\\Users\\ADM\\Downloads\\francesco.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            
            // Obtém um clip de som
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            
            // Inicia a reprodução
            clip.start();
            
            // Mantém o programa rodando enquanto o som toca
            Thread.sleep(clip.getMicrosecondLength() / 1000);
            
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}