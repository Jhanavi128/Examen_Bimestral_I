package mjSistemaANTDRON2K25;
import java.io.BufferedReader;
import java.io.FileReader;

public class mjSistema {
    private String nombre = "Jhanavi Molina";
    private String cedula = "1755161948";

    public void iniciarSistema(){
        System.out.println("[+] INFORMACION:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cédula: " + cedula);
        System.out.println();
        System.out.println("[+] COORDENADAS UCRANIANAS:");
        System.out.println();
        leerCSV("MolinaJhanavi.csv");
        imprimirCoordenadasDestruir("MolinaJhanavi.csv");


    }

    private void leerCSV(String archivo){
        try(BufferedReader br = new BufferedReader(new FileReader("MolinaJhanavi.csv"))){
            String linea;
            br.readLine();
            while((linea = br.readLine()) != null){
                imprimirLoading();
                String [] datos = linea.split(";");
                String geop = datos [0];
                String lunes = datos [1];
                String martes = datos [2];
                String miercoles = datos [3];
                String jueves = datos [4];
                String viernes = datos [5];
                String tipo = datos [6];
                System.out.printf("%-10s | %-10s | %-8s | %-8s | %-10s | %-8s | %-12s%n", geop, lunes, martes, miercoles, jueves, viernes, tipo);
            }
        }
        catch (Exception e){
            System.out.println("ERROR al leer CSV: " + e.getMessage());
        }
    }

    private void imprimirLoading(){
        String simbolo = "oOo";
        for(int i = 0; i <= 100; i +=10){
            System.out.println(simbolo + " " + i + "%");

        }
        System.out.println();
    }

    public void imprimirCoordenadasDestruir(String archivoCSV) {

    System.out.println();
    System.out.println("COORDENADAS UCRANIANAS A DESTRUIR:");
    System.out.println("Geoposición | Tipo Arsenal | Acción");

    try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {

        String linea = br.readLine(); // saltar encabezado

        while ((linea = br.readLine()) != null) {

            String[] datos = linea.split(";");

            String geop = datos[0];
            String tipoArsenal = datos[6];

            String coordNumero = geop.substring(geop.length() - 2);
            if (!coordNumero.equals("04") && !coordNumero.equals("08")) {
                continue;  
            }
            

            mjHZangano hormiga = new mjHZangano();

            // IA correcta con tus tipos reales
            mjInteligenciaIA ia = tipo ->
                    tipo.equals("abcdttt") ||
                    tipo.equals("abcdtt")  ||
                    tipo.equals("abcdd")   ||
                    tipo.equals("abc")     ||
                    tipo.equals("abb")     ||
                    tipo.equals("abcd")    ||
                    tipo.equals("ab");

            mjAntCiberDron dron = new mjAntCiberDron(geop, tipoArsenal, ia, hormiga);

            boolean explota = dron.mjEvaluarBomba();

            if (explota) {
                System.out.printf("%-11s | %-11s | %s%n", geop, tipoArsenal, explota);
            }
        }
    }
    catch (Exception e) {
        System.out.println("ERROR al evaluar explosión: " + e.getMessage());
    }
}

}
