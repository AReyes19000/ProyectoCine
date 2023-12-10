import javax.swing.*;
import java.awt.*;
public class Cine{
    public static void main(String args[]){
        inicio miCine = new inicio();
        CN miCine2 = new CN();

        miCine.metodoMenu();
        miCine2.metodoCinepolis();

        //Sonido
        ReproducirSonidoConMetodos miCine3 = new ReproducirSonidoConMetodos();
    }
}