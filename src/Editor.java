import java.io.File;

// Clase Editor que genera eventos cuando un archivo es abierto o guardado.
public class Editor {
    public GestorEventos gestor;  // Gestor de eventos
    private File archivo;

    // Constructor que inicializa los tipos de eventos: abrir y guardar.
    public Editor() {
        this.gestor = new GestorEventos("abrir", "guardar");
    }

    // Método para abrir un archivo y notificar a los observadores.
    public void abrirArchivo(String rutaArchivo) {
        this.archivo = new File(rutaArchivo);
        gestor.notificar("abrir", archivo); // Notifica a los observadores que se abrió un archivo.
    }

    // Método para guardar un archivo y notificar a los observadores.
    public void guardarArchivo() throws Exception {
        if (this.archivo != null) {
            gestor.notificar("guardar", archivo); // Notifica a los observadores que se guardó un archivo.
        } else {
            throw new Exception("Primero abra un archivo."); // Lanza excepción si no hay archivo.
        }
    }
}

