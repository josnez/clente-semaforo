package logica;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TestSistemaCliente implements Runnable {
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

    @Override
    public void run() {
        // Para almacenar lo que llegue del servidor
        byte buffer[];

        while(lecturaActiva){
            try {
                // leo lo que envía el server
                System.out.println("Esperando mensaje...");
                buffer = new byte[500];
                datosEntrada.read(buffer); // Se queda acá, hasta que el servidor envíe algo
                System.out.print("El servidor envía: ");

                // decodificar el mensaje
                String mensaje = new String(buffer).trim();

                System.out.println(mensaje);

                System.out.println(mensaje.length());

                if(mensaje.toString().equals("ADIOS")){
                    System.out.println("entra");
                    this.lecturaActiva = false;
                    break;
                }else{
                    System.out.println("Diferentes");
                }

            } catch (IOException ex) {
                System.out.println("error en la comunicación");
            }
        }
    }
}
