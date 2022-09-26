import presentacion.Modelo;

public class Launcher {

    private Modelo app;

    public Launcher() {
        app = new Modelo();
        app.iniciar();
    }

    public static void main(String[] args) {
        System.out.printf("HOlaaaa");
        new Launcher();
    }
}