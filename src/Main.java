//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Se crea un objeto Editor.
        Editor editor = new Editor();

        // Se suscriben observadores al evento de abrir y guardar archivos.
        editor.gestor.suscribir("abrir", new RegistroLog("C:/JAVA 2024/PPVI/PatronObserver/archivo.txt"));
        editor.gestor.suscribir("guardar", new NotificadorCorreo("avega@fie.undef.edu.ar"));

        try {
            // Se simulan las operaciones de abrir y guardar un archivo.
            editor.abrirArchivo("prueba.txt");  // Abre un archivo y notifica a los observadores.
            editor.guardarArchivo();  // Guarda un archivo y notifica a los observadores.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}