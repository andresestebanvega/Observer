import java.io.File;

// Interfaz Observador. Define el método que será implementado por los observadores.
public interface EscuchadorEvento {
    // Método que será llamado cuando un evento ocurra.
    void actualizar(String tipoEvento, File archivo);
}
