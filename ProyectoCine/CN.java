import javax.swing.*;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
public class CN{
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

    public static void metodoCinepolis(){
        ReproducirSonidoConMetodos miCine3 = new ReproducirSonidoConMetodos();
        //Imagenes
        ImageIcon iconoOpciones = new ImageIcon("imagenes/opcion.jpg");
        ImageIcon iconoPeli1 = new ImageIcon("imagenes/peli1.gif");
        ImageIcon iconoPeli2 = new ImageIcon("imagenes/peli2.gif");
        ImageIcon iconoPeli3 = new ImageIcon("imagenes/peli3.gif");
        ImageIcon iconoPeli4 = new ImageIcon("imagenes/peli4.gif");
        ImageIcon iconoPeli5 = new ImageIcon("imagenes/peli5.gif");
        ImageIcon iconoPeli6 = new ImageIcon("imagenes/peli6.gif");
        ImageIcon iconoOpciones2 = new ImageIcon("imagenes/opcion2.jpg");
        ImageIcon iconoCantidad1 = new ImageIcon("imagenes/cantidad.jpg");
        ImageIcon iconoCantidad2 = new ImageIcon("imagenes/cantidad2.jpg");
        ImageIcon iconoCantidad3 = new ImageIcon("imagenes/cantidad3.jpg");
        ImageIcon iconoFactura = new ImageIcon("imagenes/factura.jpg");
        ImageIcon iconoSilla = new ImageIcon("imagenes/silla.jpg");
        ImageIcon iconoSilla2 = new ImageIcon("imagenes/silla2.jpg");
        ImageIcon iconoFila = new ImageIcon("imagenes/fila.jpg");
        ImageIcon iconoOrefresco = new ImageIcon("imagenes/refresco1.jpg");
        ImageIcon iconoOrefresco2 = new ImageIcon("imagenes/refresco2.jpg");
        ImageIcon iconoOrefresco3 = new ImageIcon("imagenes/refresco3.jpg");
        ImageIcon iconoOrefresco4 = new ImageIcon("imagenes/refresco4.jpg");
        ImageIcon iconoOrefresco5 = new ImageIcon("imagenes/refresco5.jpg");
        ImageIcon iconoOrefresco6 = new ImageIcon("imagenes/refresco6.jpg");
        ImageIcon iconoPalomitas = new ImageIcon("imagenes/palomitas.jpg");
        ImageIcon iconoPalomitas2 = new ImageIcon("imagenes/palomitas2.jpg");
        ImageIcon iconoPalomitas3 = new ImageIcon("imagenes/palomitas3.jpg");
        ImageIcon iconoPalomitas4 = new ImageIcon("imagenes/palomitas4.jpg");
        ImageIcon iconoPalomitas5 = new ImageIcon("imagenes/palomitas5.jpg");
        ImageIcon iconoPalomitas6 = new ImageIcon("imagenes/palomitas6.jpg");
        ImageIcon iconoOpcion0 = new ImageIcon("imagenes/opcion0.png");
        ImageIcon iconoSala1 = new ImageIcon("imagenes/sala1.jpg");
        ImageIcon iconoSala2 = new ImageIcon("imagenes/sala2.jpg");
        ImageIcon iconoSala3 = new ImageIcon("imagenes/sala3.jpg");
        ImageIcon iconoSala4 = new ImageIcon("imagenes/sala4.jpg");
        ImageIcon iconoSala5 = new ImageIcon("imagenes/Sala5.jpg");
        ImageIcon iconoFecha = new ImageIcon("imagenes/fecha.jpg");
        ImageIcon iconoLunes = new ImageIcon("imagenes/lunes.jpg");
        ImageIcon iconoMartes = new ImageIcon("imagenes/martes.jpg");
        ImageIcon iconoMiercoles = new ImageIcon("imagenes/miercoles.jpg");
        ImageIcon iconoLugar1 = new ImageIcon("imagenes/Lugar1.jpg");
        ImageIcon iconoLugar2 = new ImageIcon("imagenes/Lugar2.jpg");
        ImageIcon iconoLugar3 = new ImageIcon("imagenes/Lugar3.jpg");
        ImageIcon iconoLugar4 = new ImageIcon("imagenes/Lugar4.jpg");
        ImageIcon iconoLugar5 = new ImageIcon("imagenes/Lugar5.jpg");
        ImageIcon iconoLugar01 = new ImageIcon("imagenes/Lugar01.jpg");
        ImageIcon iconoLugar02 = new ImageIcon("imagenes/Lugar02.jpg");
        ImageIcon iconoLugar03 = new ImageIcon("imagenes/Lugar03.jpg");
        ImageIcon iconoLugar04 = new ImageIcon("imagenes/Lugar04.jpg");
        ImageIcon iconoLugar05 = new ImageIcon("imagenes/Lugar05.jpg");
        ImageIcon iconoLugar001 = new ImageIcon("imagenes/Lugar001.jpg");
        ImageIcon iconoLugar002 = new ImageIcon("imagenes/Lugar002.jpg");
        ImageIcon iconoLugar003 = new ImageIcon("imagenes/Lugar003.jpg");
        ImageIcon iconoLugar004 = new ImageIcon("imagenes/Lugar004.jpg");
        ImageIcon iconoLugar005 = new ImageIcon("imagenes/Lugar005.jpg");
        ImageIcon iconoLugar11 = new ImageIcon("imagenes/Lugar11.jpg");
        ImageIcon iconoLugar12 = new ImageIcon("imagenes/Lugar12.jpg");
        ImageIcon iconoLugar13 = new ImageIcon("imagenes/Lugar13.jpg");
        ImageIcon iconoLugar14 = new ImageIcon("imagenes/Lugar14.jpg");
        ImageIcon iconoLugar15 = new ImageIcon("imagenes/Lugar15.jpg");
        ImageIcon iconoLugar21 = new ImageIcon("imagenes/Lugar21.jpg");
        ImageIcon iconoLugar22 = new ImageIcon("imagenes/Lugar22.jpg");
        ImageIcon iconoLugar23 = new ImageIcon("imagenes/Lugar23.jpg");
        ImageIcon iconoLugar24 = new ImageIcon("imagenes/Lugar24.jpg");
        ImageIcon iconoLugar25 = new ImageIcon("imagenes/Lugar25.jpg");
        ImageIcon iconoLugar31 = new ImageIcon("imagenes/Lugar31.jpg");
        ImageIcon iconoLugar32 = new ImageIcon("imagenes/Lugar32.jpg");
        ImageIcon iconoLugar33 = new ImageIcon("imagenes/Lugar33.jpg");
        ImageIcon iconoLugar34 = new ImageIcon("imagenes/Lugar34.jpg");
        ImageIcon iconoLugar35 = new ImageIcon("imagenes/Lugar35.jpg");

        //Botones
        String[] boton1 = {"Continuar"};
        String[] boton2 = {"Opcion 1", "Opcion 2", "Opcion 3", "Opcion 4", "Opcion 5"};
        String[] boton3 = {"Lunes", "Martes", "Miercoles"};
        String[] boton4 = {"2D", "3D", "4K"};
        String[] boton5 = {"SI", "NO"};
        String[] boton6 = {"Grande", "Mediano", "Pequeño"};
        String[] boton7 = {"Grandes", "Medianas", "Pequeñas"};
        String[] boton8 = {"Sala 1", "Sala 2", "Sala 3", "Sala 4", "Sala 5"};
        String[] boton9 = {"Opcion 1", "Opcion 2", "Opcion 3"};
        String[] boton11 = {"Columna 1", "Columna 2", "Columna 3", "Columna 4", "Columna 5", "Columna 6"};

        //Variables
        int opcion = 0;
        int opcion0 = 0;
        int play = 0;
        int play2 = 0;
        int pelicula = 0;
        int i = 0;
        int cantidad_boleto = 0;
        int refresco = 0;
        int palomitas = 0;
        double isv = 0;
        double subtotal = 0;
        double total = 0;
        double factura[] = new double[10];
        String peli[] = new String[12];
        String sal[] = new String[6];
        String dia[] = new String[4];

        //opciones de peliculas
        while(play<1){
            //Fecha y hora
            int fecha_hora = JOptionPane.showOptionDialog(null, null, "", 0, 0, iconoFecha, boton3, null);
            switch(fecha_hora){
                case 0:
                    play = 1;
                    dia[1] = "Lunes";
                    JOptionPane.showOptionDialog(null, null, "Lunes", 0, 0, iconoLunes, boton9, null);
                    opcion = JOptionPane.showOptionDialog(null, null, "", 0, 0, iconoOpciones, boton2, null);
                    switch(opcion){
                        case 0:
                            play = 1;
                            peli[1] = "Vacaciones de verano";
                            JOptionPane.showOptionDialog(null, null, "*Vacaciones de verano*", 0, 0, iconoPeli1, boton1, null);
                            break;
                        case 1:
                            play = 1;
                            peli[2] = "Mansion encantada";
                            JOptionPane.showOptionDialog(null, null, "*Mansion encantada*", 0, 0, iconoPeli2, boton1, null);
                            break;
                        case 2:
                            play = 1;
                            peli[3] = "Spider Man Lotus";
                            JOptionPane.showOptionDialog(null, null, "*Spider Man Lotus*", 0, 0, iconoPeli3, boton1, null);
                            break;
                        case 3:
                            play = 1;
                            peli[4] = "The Flash";
                            JOptionPane.showOptionDialog(null, null, "*The Flash*", 0, 0, iconoPeli4, boton1, null);
                            break;
                        case 4:
                            play = 1;
                            peli[5] = "Five Nights at Freddy's";
                            JOptionPane.showOptionDialog(null, null, "*Five Nights at Freddy's*", 0, 0, iconoPeli5, boton1, null);
                            break;
                    }
                    break;
                case 1:
                    play = 1;
                    dia[2] = "Martes";
                    JOptionPane.showOptionDialog(null, null, "Martes", 0, 0, iconoMartes, boton9, null);
                    opcion = JOptionPane.showOptionDialog(null, null, "", 0, 0, iconoOpciones, boton2, null);
                    switch(opcion){
                        case 0:
                            play = 1;
                            peli[1] = "Vacaciones de verano";
                            JOptionPane.showOptionDialog(null, null, "*Vacaciones de verano*", 0, 0, iconoPeli1, boton1, null);
                            break;
                        case 1:
                            play = 1;
                            peli[2] = "Mansion encantada";
                            JOptionPane.showOptionDialog(null, null, "*Mansion encantada*", 0, 0, iconoPeli2, boton1, null);
                            break;
                        case 2:
                            play = 1;
                            peli[3] = "Spider Man Lotus";
                            JOptionPane.showOptionDialog(null, null, "*Spider Man Lotus*", 0, 0, iconoPeli3, boton1, null);
                            break;
                        case 3:
                            play = 1;
                            peli[4] = "The Flash";
                            JOptionPane.showOptionDialog(null, null, "*The Flash*", 0, 0, iconoPeli4, boton1, null);
                            break;
                        case 4:
                            play = 1;
                            peli[5] = "Five Nights at Freddy's";
                            JOptionPane.showOptionDialog(null, null, "*Five Nights at Freddy's*", 0, 0, iconoPeli5, boton1, null);
                            break;
                    }
                    break;
                case 2:
                    play = 1;
                    dia[3] = "Miercoles";
                    JOptionPane.showOptionDialog(null, null, "Miercoles", 0, 0, iconoMiercoles, boton9, null);
                    opcion = JOptionPane.showOptionDialog(null, null, "", 0, 0, iconoOpciones, boton2, null);
                    switch(opcion){
                        case 0:
                            play = 1;
                            peli[1] = "Vacaciones de verano";
                            JOptionPane.showOptionDialog(null, null, "*Vacaciones de verano*", 0, 0, iconoPeli1, boton1, null);
                            break;
                        case 1:
                            play = 1;
                            peli[2] = "Mansion encantada";
                            JOptionPane.showOptionDialog(null, null, "*Mansion encantada*", 0, 0, iconoPeli2, boton1, null);
                            break;
                        case 2:
                            play = 1;
                            peli[3] = "Spider Man Lotus";
                            JOptionPane.showOptionDialog(null, null, "*Spider Man Lotus*", 0, 0, iconoPeli3, boton1, null);
                            break;
                        case 3:
                            play = 1;
                            peli[4] = "The Flash";
                            JOptionPane.showOptionDialog(null, null, "*The Flash*", 0, 0, iconoPeli4, boton1, null);
                            break;
                        case 4:
                            play = 1;
                            peli[5] = "Five Nights at Freddy's";
                            JOptionPane.showOptionDialog(null, null, "*Five Nights at Freddy's*", 0, 0, iconoPeli5, boton1, null);
                            break;
                    }
                    break;
            }
        }

        //Opciones de visualizacion
        while(play2<1){
            int opcion2 = JOptionPane.showOptionDialog(null, null, "Seleccione la visualizacion que desea: ", 0, 0, iconoOpciones2, boton4, null);
            switch(opcion2){
                    //Cantidad de boletos
                case 0:
                    play2 = 1;
                    pelicula = 80;
                    cantidad_boleto = Integer.parseInt(JOptionPane.showInputDialog(null,"", " ", 0, iconoCantidad1, null, null) + "");
                    break;
                case 1:
                    play2 = 1;
                    pelicula = 100;
                    cantidad_boleto = Integer.parseInt(JOptionPane.showInputDialog(null,"", " ", 0, iconoCantidad2, null, null) + "");
                    break;
                case 2:
                    play2 = 1;
                    pelicula = 210;
                    cantidad_boleto = Integer.parseInt(JOptionPane.showInputDialog(null,"", " ", 0, iconoCantidad3, null, null) + "");
                    break;
            }
        }

        int columna = cantidad_boleto;
        int lugar = cantidad_boleto;
        int fila = cantidad_boleto;

        play2 = 0;
        pelicula = pelicula * cantidad_boleto;
        isv = isv + (pelicula * 0.15);
        factura[1] = pelicula;
        factura[2] = isv;
        factura[3] = cantidad_boleto;

        JOptionPane.showOptionDialog(null, "Su cantidad de boletos es: " + factura[3], "", 0, 0, iconoFactura, boton1, null);

        if(factura[3] == 1){
            //columna = JOptionPane.showOptionDialog(null, null, "Ingrese la columna (1-6) en la que desea reservar la silla:", 0, 0, iconoSilla, boton11, null);
            columna = Integer.parseInt(JOptionPane.showInputDialog(null,"", "Ingrese la columna (1-6) en la que desea reservar la silla:", 0, iconoSilla, null, null) + "");
            switch(columna){
                case 1:
                    //JOptionPane.showOptionDialog(null, "Columna 1 ", "", 0, 0, iconoColumna1, boton1, null);
                    fila = Integer.parseInt(JOptionPane.showInputDialog(null,"", "Ingrese el numero de asiento (1-5) de la columna que eligio: ", 0, iconoSilla, null, null) + "");
                    switch(fila){
                        case 1:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar1, boton1, null);
                            break;
                        case 2:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar2, boton1, null);
                            break;
                        case 3:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar3, boton1, null);
                            break;
                        case 4:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar4, boton1, null);
                            break;
                        case 5:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar5, boton1, null);
                            break;
                    }
                    break;
                case 2:
                    //JOptionPane.showOptionDialog(null, "Columna 2 ", "", 0, 0, iconoColumna2, boton1, null);
                    fila = Integer.parseInt(JOptionPane.showInputDialog(null,"", "Ingrese el numero de asiento (1-5) de la columna que eligio: ", 0, iconoSilla, null, null) + "");
                    switch(fila){
                        case 1:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar01, boton1, null);
                            break;
                        case 2:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar02, boton1, null);
                            break;
                        case 3:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar03, boton1, null);
                            break;
                        case 4:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar04, boton1, null);
                            break;
                        case 5:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar05, boton1, null);
                            break;
                    }
                    break;
                case 3:
                    //JOptionPane.showOptionDialog(null, "Columna 3 ", "", 0, 0, iconoColumna3, boton1, null);
                    fila = Integer.parseInt(JOptionPane.showInputDialog(null,"", "Ingrese el numero de asiento (1-5) de la columna que eligio: ", 0, iconoSilla, null, null) + "");
                    switch(fila){
                        case 1:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar001, boton1, null);
                            break;
                        case 2:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar002, boton1, null);
                            break;
                        case 3:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar003, boton1, null);
                            break;
                        case 4:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar004, boton1, null);
                            break;
                        case 5:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar005, boton1, null);
                            break;
                    }
                    break;
                case 4:
                    //JOptionPane.showOptionDialog(null, "Columna 4 ", "", 0, 0, iconoColumna4, boton1, null);
                    fila = Integer.parseInt(JOptionPane.showInputDialog(null,"", "Ingrese el numero de asiento (1-5) de la columna que eligio: ", 0, iconoSilla, null, null) + "");
                    switch(fila){
                        case 1:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar11, boton1, null);
                            break;
                        case 2:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar12, boton1, null);
                            break;
                        case 3:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar13, boton1, null);
                            break;
                        case 4:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar14, boton1, null);
                            break;
                        case 5:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar15, boton1, null);
                            break;
                    }
                    break;
                case 5:
                    //JOptionPane.showOptionDialog(null, "Columna 5 ", "", 0, 0, iconoColumna5, boton1, null);
                    fila = Integer.parseInt(JOptionPane.showInputDialog(null,"", "Ingrese el numero de asiento (1-5) de la columna que eligio: ", 0, iconoSilla, null, null) + "");
                    switch(fila){
                        case 1:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar21, boton1, null);
                            break;
                        case 2:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar22, boton1, null);
                            break;
                        case 3:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar23, boton1, null);
                            break;
                        case 4:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar24, boton1, null);
                            break;
                        case 5:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar25, boton1, null);
                            break;
                    }
                    break;
                case 6:
                    //JOptionPane.showOptionDialog(null, "Columna 6 ", "", 0, 0, iconoColumna6, boton1, null);
                    fila = Integer.parseInt(JOptionPane.showInputDialog(null,"", "Ingrese el numero de asiento (1-5) de la columna que eligio: ", 0, iconoSilla, null, null) + "");
                    switch(fila){
                        case 0:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar31, boton1, null);
                            break;
                        case 1:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar32, boton1, null);
                            break;
                        case 2:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar33, boton1, null);
                            break;
                        case 3:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar34, boton1, null);
                            break;
                        case 4:
                            JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar35, boton1, null);
                            break;
                    }
                    break;
            }
        }

        else{
            for(i = 0; i < cantidad_boleto; i++){
                columna = Integer.parseInt(JOptionPane.showInputDialog(null,"", "Ingrese la columna (1-6) en el boleto numero: " + (i + 1), 0, iconoSilla, null, null) + "");
                switch(columna){
                    case 1:
                        fila = Integer.parseInt(JOptionPane.showInputDialog(null,"", "Ingrese el numero de asiento (1-5) en el boleto numero: " + (i + 1), 0, iconoSilla, null, null) + "");
                        switch(fila){
                            case 1:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar1, boton1, null);
                                break;
                            case 2:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar2, boton1, null);
                                break;
                            case 3:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar3, boton1, null);
                                break;
                            case 4:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar4, boton1, null);
                                break;
                            case 5:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar5, boton1, null);
                                break;
                        }
                        break;
                    case 2:
                        //JOptionPane.showOptionDialog(null, "Columna 2 ", "", 0, 0, iconoColumna2, boton1, null);
                        fila = Integer.parseInt(JOptionPane.showInputDialog(null,"", "Ingrese el numero de asiento (1-5) en el boleto numero: " + (i + 1), 0, iconoSilla, null, null) + "");
                        switch(fila){
                            case 1:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar01, boton1, null);
                                break;
                            case 2:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar02, boton1, null);
                                break;
                            case 3:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar03, boton1, null);
                                break;
                            case 4:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar04, boton1, null);
                                break;
                            case 5:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar05, boton1, null);
                                break;
                        }
                        break;
                    case 3:
                        //JOptionPane.showOptionDialog(null, "Columna 3 ", "", 0, 0, iconoColumna3, boton1, null);
                        fila = Integer.parseInt(JOptionPane.showInputDialog(null,"", "Ingrese el numero de asiento (1-5) en el boleto numero: " + (i + 1), 0, iconoSilla, null, null) + "");
                        switch(fila){
                            case 1:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar001, boton1, null);
                                break;
                            case 2:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar002, boton1, null);
                                break;
                            case 3:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar003, boton1, null);
                                break;
                            case 4:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar004, boton1, null);
                                break;
                            case 5:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar005, boton1, null);
                                break;
                        }
                        break;
                    case 4:
                        //JOptionPane.showOptionDialog(null, "Columna 4 ", "", 0, 0, iconoColumna4, boton1, null);
                        fila = Integer.parseInt(JOptionPane.showInputDialog(null,"", "Ingrese el numero de asiento (1-5) en el boleto numero: " + (i + 1), 0, iconoSilla, null, null) + "");
                        switch(fila){
                            case 1:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar11, boton1, null);
                                break;
                            case 2:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar12, boton1, null);
                                break;
                            case 3:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar13, boton1, null);
                                break;
                            case 4:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar14, boton1, null);
                                break;
                            case 5:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar15, boton1, null);
                                break;
                        }
                        break;
                    case 5:
                        //JOptionPane.showOptionDialog(null, "Columna 5 ", "", 0, 0, iconoColumna5, boton1, null);
                        fila = Integer.parseInt(JOptionPane.showInputDialog(null,"", "Ingrese el numero de asiento (1-5) en el boleto numero: " + (i + 1), 0, iconoSilla, null, null) + "");
                        switch(fila){
                            case 1:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar21, boton1, null);
                                break;
                            case 2:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar22, boton1, null);
                                break;
                            case 3:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar23, boton1, null);
                                break;
                            case 4:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar24, boton1, null);
                                break;
                            case 5:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar25, boton1, null);
                                break;
                        }
                        break;
                    case 6:
                        //JOptionPane.showOptionDialog(null, "Columna 6 ", "", 0, 0, iconoColumna6, boton1, null);
                        fila = Integer.parseInt(JOptionPane.showInputDialog(null,"", "Ingrese el numero de asiento (1-5) en el boleto numero: " + (i + 1), 0, iconoSilla, null, null) + "");
                        switch(fila){
                            case 0:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar31, boton1, null);
                                break;
                            case 1:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar32, boton1, null);
                                break;
                            case 2:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar33, boton1, null);
                                break;
                            case 3:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar34, boton1, null);
                                break;
                            case 4:
                                JOptionPane.showOptionDialog(null, "Columna numero: "+columna+"\nAsiento numero: "+fila, "", 0, 0, iconoLugar35, boton1, null);
                                break;
                        }
                        break;
                }
            }
        }
        play2 = 0;

        /* Espacios en arreglos
        1. Pelicula
        2. impuesto (isv)
        3. Cantidad de boletos
        4. Cantidad de refrescos
        5. Total de refrescos (lps)
        6. Palomitas (Cantidad)
        7. Total de palomitas (lps)
         */

        //Refrescos
        while(play2<2){
            int opc = JOptionPane.showOptionDialog(null, null, "¿Desea comprar refrescos? SI o NO", 0, 0, iconoOrefresco, boton5, null);
            switch(opc){
                case 0:
                    refresco = JOptionPane.showOptionDialog(null, null, "¿Que tipo de refresco desea comprar?", 0, 0, iconoOrefresco2, boton6, null);
                    switch(refresco){
                        case 0:
                            factura[4] = Integer.parseInt(JOptionPane.showInputDialog(null,"", "Refresco grande", 0, iconoOrefresco3, null, null) + "");
                            refresco = 30;
                            play2 = 3;
                            break;
                        case 1:
                            factura[4] = Integer.parseInt(JOptionPane.showInputDialog(null,"", "Refresco mediano", 0, iconoOrefresco4, null, null) + "");
                            refresco = 20;
                            play2 = 3;
                            break;
                        case 2:
                            factura[4] = Integer.parseInt(JOptionPane.showInputDialog(null,"", "Refresco pequeño", 0, iconoOrefresco5, null, null) + "");
                            refresco = 10;
                            play2 = 3;
                            break;
                    }
                    break;
                case 1:
                    JOptionPane.showOptionDialog(null, null, "Orden sin refrescos", 0, 0, iconoOrefresco6, boton1, null);
                    refresco = 0;
                    factura[4] = 0;
                    play2 = 3;
                    break;
            }
        }
        factura[5] = factura[4] * refresco;
        play2 = 0;

        //Palomitas
        while(play2<2){
            int opc2 = JOptionPane.showOptionDialog(null, null, "Desea comprar palomitas?", 0, 0, iconoPalomitas, boton5, null);
            switch(opc2){
                case 0:
                    palomitas = JOptionPane.showOptionDialog(null, null, "Que tipo de palomitas desea comprar?", 0, 0, iconoPalomitas2, boton7, null);
                    switch(palomitas){
                        case 0:
                            factura[6] = Integer.parseInt(JOptionPane.showInputDialog(null,"", "Palomitas grandes", 0, iconoPalomitas3, null, null) + "");
                            palomitas = 50;
                            play2 = 3;
                            break;
                        case 1:
                            factura[6] = Integer.parseInt(JOptionPane.showInputDialog(null,"", "Plomitas medianas", 0, iconoPalomitas4, null, null) + "");
                            palomitas = 40;
                            play2 = 3;
                            break;
                        case 2:
                            factura[6] = Integer.parseInt(JOptionPane.showInputDialog(null,"", "Palomitas pequeñas", 0, iconoPalomitas5, null, null) + "");
                            palomitas = 20;
                            play2 = 3;
                            break;
                    }
                    break;
                case 1:
                    JOptionPane.showOptionDialog(null, null, "Orden sin palomitas", 0, 0, iconoPalomitas6, boton1, null);
                    factura[6] = 0;
                    play2 = 3;
                    break;
            }
        }

        //Opciones de salas
        do{
            opcion0 = JOptionPane.showOptionDialog(null, null, "Elija el numero de sala", 0, 0, iconoOpcion0, boton8, null);
            switch(opcion0){
                case 0:
                    play = 1;
                    sal[1] = "Sala 1";
                    JOptionPane.showOptionDialog(null, null, "Sala 1", 0, 0, iconoSala1, boton1, null);
                    break;
                case 1:
                    play = 1;
                    sal[2] = "Sala 2";
                    JOptionPane.showOptionDialog(null, null, "Sala 2", 0, 0, iconoSala2, boton1, null);
                    break;
                case 2:
                    play = 1;
                    sal[3] = "Sala 3";
                    JOptionPane.showOptionDialog(null, null, "Sala 3", 0, 0, iconoSala3, boton1, null);
                    break;
                case 3:
                    play = 1;
                    sal[4] = "Sala 4";
                    JOptionPane.showOptionDialog(null, null, "Sala 4", 0, 0, iconoSala4, boton1, null);
                    break;
                case 4:
                    play = 1;
                    sal[5] = "Sala 5";
                    JOptionPane.showOptionDialog(null, null, "Sala 5", 0, 0, iconoSala5, boton1, null);
                    break;
            }
        }while(play<1);

        //Aviso de factura
        //reproducirSonido("sonidos/play2.wav");

        /* Espacios en arreglos
        1. Pelicula
        2. impuesto (isv)
        3. Cantidad de boletos
        4. Cantidad de refrescos
        5. Total de refrescos (lps)
        6. Palomitas (Cantidad)
        7. Total de palomitas (lps)
         */

        factura[7] = factura[6] * palomitas;
        subtotal = factura[1] + factura[5] + factura[7];
        isv = subtotal * 0.15;
        total = subtotal + isv;

        //Factura
        JOptionPane.showMessageDialog(null,"\nEl total pagado de peliculas es:  Lps."+ factura[1] +
            "\nLa cantidad de boletos es:  "+ factura[3] +
            "\nLa silla reservada es:  Columna "+ columna + " Asiento: " + fila +
            "\nLa cantidad de refrescos es:  "+ factura[4] +
            "\nLa cantidad de palomitas es:  "+ factura[6] +
            "\nTotal a pagar en refrescos:  Lps."+ factura[5] +
            "\nTotal a pagar en palomitas:  Lps."+ factura[7] +
            "\nSub-Total:  "+ subtotal +
            "\nTotal ISV:  "+ isv +
            "\nTotal a pagar:  Lps."+ total,"Factura de compra...", 0, null);
    }
}