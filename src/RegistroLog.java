import java.io.File;

// Observador concreto que guarda el evento en un archivo de log.
public class RegistroLog implements EscuchadorEvento {
    private File log;

    // Constructor que recibe el archivo donde se escribirá el log.
    public RegistroLog(String nombreArchivo) {
        this.log = new File(nombreArchivo);
    }

    // Implementación del método actualizar que escribe en el archivo de log.
    @Override
    public void actualizar(String tipoEvento, File archivo) {
        System.out.println("Guardado en log " + log.getPath() + ": Se ha realizado la operación "
                + tipoEvento + " con el archivo: " + archivo.getName());
    }
}
