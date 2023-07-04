import Servicio.PeliculaServicio;

public class App {
    public static void main(String[] args) throws Exception {
        
        PeliculaServicio peliculaServicio = new PeliculaServicio();
        peliculaServicio.crearPeli();
        peliculaServicio.crearPeli();
        peliculaServicio.crearPeli();
        peliculaServicio.mostrarListado();
        // peliculaServicio.damePeli();
    }
}
