package presentacion;

import logica.TestSistemaCliente;

import java.io.IOException;

public class Modelo {

    private TestSistemaCliente tsc;
    public void iniciar() {

        // Todo arrancar conexion
        try {
            tsc.conectar();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
