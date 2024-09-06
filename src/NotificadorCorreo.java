import java.io.File;

// Observador concreto que envía notificaciones por correo cuando ocurre un evento.
public class NotificadorCorreo implements EscuchadorEvento {
    private String correo;

    // Constructor que recibe el email al cual se enviarán las notificaciones.
    public NotificadorCorreo(String correo) {
        this.correo = correo;
    }

    // Implementación del método actualizar que envía un mensaje al email.
    @Override
    public void actualizar(String tipoEvento, File archivo) {
        System.out.println("Correo a " + correo + ": Se ha realizado la operación "
                + tipoEvento + " con el archivo: " + archivo.getName());
    }
}

