package mjSistemaANTDRON2K25;

public class mjAntCiberDron implements mjInteligenciaIA{
    private String mjCoord;
    private String mjTipoArsenal;
    private mjInteligenciaIA mjIA;
    private mjHZangano mjHormiga;

    public mjAntCiberDron(String coord, String tipoArsenal, mjInteligenciaIA ia, mjHZangano hormiga){
        this.mjCoord = coord;
        this.mjTipoArsenal = tipoArsenal;
        this.mjIA = ia;
        this.mjHormiga = hormiga;
    }

    @Override
    public boolean mjBuscar(String tipoArsenal){
        return tipoArsenal.equals("abcdttt") ||
               tipoArsenal.equals("abcdtt")  ||
               tipoArsenal.equals("abc")     ||
               tipoArsenal.equals("abb")     ||
               tipoArsenal.equals("abcdd")   ||
               tipoArsenal.equals("ab")      ||
               tipoArsenal.equals("abcd");
    }

    public boolean mjEvaluarBomba(){
        return mjBuscar(this.mjTipoArsenal);
    }

    public String getMjCoord() {
        return mjCoord;
    }

    public void setMjCoord(String mjCoord) {
        this.mjCoord = mjCoord;
    }

    public String getMjTipoArsenal() {
        return mjTipoArsenal;
    }

    public void setMjTipoArsenal(String mjTipoArsenal) {
        this.mjTipoArsenal = mjTipoArsenal;
    }

    public mjInteligenciaIA getMjIA() {
        return mjIA;
    }

    public void setMjIA(mjInteligenciaIA mjIA) {
        this.mjIA = mjIA;
    }

    public mjHZangano getMjHormiga() {
        return mjHormiga;
    }

    public void setMjHormiga(mjHZangano mjHormiga) {
        this.mjHormiga = mjHormiga;
    }
}
