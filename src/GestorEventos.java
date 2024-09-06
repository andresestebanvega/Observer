import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Clase que gestiona los eventos y notifica a los observadores suscritos.
public class GestorEventos {
    Map<String, List<EscuchadorEvento>> escuchadores = new HashMap<>();

    // Constructor que inicializa los tipos de eventos que se pueden gestionar.
    public GestorEventos(String... operaciones) {
        for (String operacion : operaciones) {
            this.escuchadores.put(operacion, new ArrayList<>());
        }
    }

    // Método para suscribir un observador a un tipo de evento.
    public void suscribir(String tipoEvento, EscuchadorEvento escuchador) {
        List<EscuchadorEvento> usuarios = escuchadores.get(tipoEvento);
        usuarios.add(escuchador);
    }

    // Método para cancelar la suscripción de un observador.
    public void cancelarSuscripcion(String tipoEvento, EscuchadorEvento escuchador) {
        List<EscuchadorEvento> usuarios = escuchadores.get(tipoEvento);
        usuarios.remove(escuchador);
    }

    // Método para notificar a todos los observadores suscritos cuando ocurre un evento.
    public void notificar(String tipoEvento, File archivo) {
        List<EscuchadorEvento> usuarios = escuchadores.get(tipoEvento);
        for (EscuchadorEvento escuchador : usuarios) {
            escuchador.actualizar(tipoEvento, archivo);
        }
    }
}

