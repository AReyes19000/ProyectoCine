import javax.swing.*;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class inicio
{
    //Metodo para el sonido
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
    
    public static void metodoMenu(){
        CN miCine2 = new CN();
        //Imagen
        ImageIcon iconoMenu = new ImageIcon("imagenes/bienvenida.gif");
        
        //Colores del cuadro
        UIManager.put("OptionPane.background", Color.BLACK);
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        UIManager.put("Panel.background", Color.BLACK);
        JDialog.setDefaultLookAndFeelDecorated(true);

        //Boton
        String[] boton1 = {"Continuar"};
        
        //Variable
        int compra = 0;
        
        //Sonido
        reproducirSonido("sonidos/play.wav");
        
        //Bienvenido a Cinepolis
        compra = JOptionPane.showOptionDialog(null, null," ",0, 0, iconoMenu, boton1, null);
    }
}