package mjSistemaANTDRON2K25.mjRecoleccionDatos;

public class mjMolinaJhanavi_csv {

    private String mjDatos;

    public mjMolinaJhanavi_csv() {}

    public void mjCargarDatos(String datos) {
        this.mjDatos = datos;
        System.out.println("Datos cargados: " + mjDatos);
    }

    public void mjLeerDatos(String datos) {
        System.out.println("Leyendo datos: " + datos);
    }

    public void mjProcesarDatos() {
        System.out.println("Procesando datos...");
    }
}
