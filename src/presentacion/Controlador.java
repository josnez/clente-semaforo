package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    private Modelo modelo;

    public Controlador(Ventana vista) {
        this.modelo = vista.getModelo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
