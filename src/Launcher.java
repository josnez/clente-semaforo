import presentacion.Modelo;

public class Launcher {

    private Modelo app;

    public Launcher() {
        app = new Modelo();
        app.iniciar();
    }

    public static void main(String[] args) {
        new Launcher();
    }
}