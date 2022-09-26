package presentacion;

import javax.swing.*;

public class Ventana extends JFrame {

    private final Modelo modelo;
    private Controlador controlador;

    public Ventana(Modelo m) {
        modelo = m;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public Controlador getControl() {
        if (controlador == null) {
            controlador = new Controlador(this);
        }
        return controlador;
    }
}
