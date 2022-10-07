package presentacion;

import logica.Semaforo;
import logica.Tarjeta;

import java.io.IOException;

public class Modelo {

    private Semaforo sistema1;
    private Semaforo sistema2;
    private Semaforo sistemaActivo;

    private Ventana ventana;

    public void iniciar() {
        // todo inicializar interfaz

        Tarjeta tarjeta1 = new Tarjeta(this);
        try {
            tarjeta1.conectar();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Ventana getVentana() {
        if (ventana == null) {
            ventana = new Ventana(this);
        }
        return ventana;
    }
    public void procesarInformacion(String binaryData) {
        // byte recibido |i|r|a|v|i|r|a|v|

        while (binaryData.length() < 8) {
            binaryData = "0" + binaryData;
        }
        System.out.println("Binary data: " + binaryData);
        // todo cambiar estado de leds

    }

    /*public void cambioEstadoRojo() {
        Led ledRojo = (Led) sistemaActivo.getLeds().get(0);

        if (ledRojo.getEstado() == 0) {
            ledRojo.getLbl().setBackground(new Color(255, 0, 0));
            ventana.getBtnRojo().setIcon(ventana.getImgOn());
            comunicarEstado("estado botón rojo -> 1");
            ledRojo.setEstado(1);
        } else if (ledRojo.getEstado() == 1) {
            ledRojo.getLbl().setBackground(new Color(186, 0, 0));
            ventana.getBtnRojo().setIcon(ventana.getImgOff());
            comunicarEstado("estado botón rojo -> 0");
            ledRojo.setEstado(0);
        } else {
            JOptionPane.showMessageDialog(null, "El LED esta dañado");
            comunicarEstado("estado botón rojo -> dañado");
        }

    }

    void cambioEstadoAmarillo() {
        Led ledAmarillo = (Led) sistemaActivo.getLeds().get(1);

        if (ledAmarillo.getEstado() == 0) {
            ledAmarillo.getLbl().setBackground(new Color(255, 255, 0));
            ventana.getBtnAmarillo().setIcon(ventana.getImgOn());
            comunicarEstado("estado botón amarillo -> 1");
            ledAmarillo.setEstado(1);
        } else if (ledAmarillo.getEstado() == 1) {
            ledAmarillo.getLbl().setBackground(new Color(186, 186, 0));
            ventana.getBtnAmarillo().setIcon(ventana.getImgOff());
            comunicarEstado("estado botón amarillo -> 0");
            ledAmarillo.setEstado(0);
        } else {
            JOptionPane.showMessageDialog(null, "El LED esta dañado");
            comunicarEstado("estado botón amarillo -> dañado");
        }

    }

    public void cambioEstadoVerde() {
        Led ledVerde = (Led) sistemaActivo.getLeds().get(2);

        if (ledVerde.getEstado() == 0) {
            ledVerde.getLbl().setBackground(new Color(0, 204, 0));
            ventana.getBtnVerde().setIcon(ventana.getImgOn());
            comunicarEstado("estado botón verde -> 1");
            ledVerde.setEstado(1);
        } else if (ledVerde.getEstado() == 1) {
            ledVerde.getLbl().setBackground(new Color(0, 145, 0));
            ventana.getBtnVerde().setIcon(ventana.getImgOff());
            comunicarEstado("estado botón verde -> 0");
            ledVerde.setEstado(0);
        } else {
            JOptionPane.showMessageDialog(null, "El LED esta dañado");
            comunicarEstado("estado botón verde -> dañado");
        }

    }

    public void comprobarEstadoBotones() {
        ArrayList<Led> leds = sistemaActivo.getLeds();

        if(leds.get(0).getEstado() == 0)
            ventana.getBtnRojo().setIcon(ventana.getImgOff());
        else
            ventana.getBtnRojo().setIcon(ventana.getImgOn());

        if(leds.get(1).getEstado() == 0)
            ventana.getBtnAmarillo().setIcon(ventana.getImgOff());
        else
            ventana.getBtnAmarillo().setIcon(ventana.getImgOn());


        if(leds.get(2).getEstado() == 0)
            ventana.getBtnVerde().setIcon(ventana.getImgOff());
        else
            ventana.getBtnVerde().setIcon(ventana.getImgOn());

    }*/
}
