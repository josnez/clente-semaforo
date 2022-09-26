package logica;

import java.util.ArrayList;

public class Semaforo {

    private ArrayList<Led> leds;
    private int estado;

    public Semaforo() {
        estado = 0;
    }

    public ArrayList<Led> getLeds() {
        return leds;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
