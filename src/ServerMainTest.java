import logica.ServidorTest;

import java.io.IOException;

public class ServerMainTest {

    public static void main(String[] args) {
        try {
            new ServidorTest().conectar();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}