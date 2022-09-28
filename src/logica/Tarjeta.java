package logica;

import java.util.ArrayList;

public class Tarjeta {

    private ArrayList<Semaforo> gprSemaforico1;
    private ArrayList<Semaforo> gprSemaforico2;
    private int identificador;

    // Todo gestion de semaforos
    private String host = "localhost"; //127.0.0.1  , IP del servidor
    private int puerto = 5000;
    private Socket sock;

    private DataInputStream datosEntrada;
    private DataOutputStream datosSalida;

    private volatile boolean lecturaActiva;
    private Thread hiloLectura;

    public TestSistemaCliente() {
        lecturaActiva = true;
        hiloLectura = new Thread(this);
    }

    public void conectar() throws IOException {


        //establecer conexion
        sock = new Socket(host, puerto);

        //capturar los flujos
        datosEntrada = new DataInputStream(sock.getInputStream());

        // COMUNICACION
        hiloLectura.start();
        do{
        }while(this.lecturaActiva);
        System.out.println("Me despido!");

        // Finalizar
        datosEntrada.close();
        sock.close();

    }
}
