import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
public class ReproducirSonidoConMetodos {
    public static void reproducirSonido(String rutaSonido) {
        try {
            // Cargar el archivo de sonido
            File archivoSonido = new File(rutaSonido);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivoSonido);

            // Crear un Clip para reproducir el sonido
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);

            // Reproducir el sonido
            clip.start();

            // Esperar a que termine de reproducirse
            Thread.sleep(clip.getMicrosecondLength() / 1000);

            // Cerrar el clip
            clip.close();

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}