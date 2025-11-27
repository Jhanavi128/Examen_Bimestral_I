package mjSistemaANTDRON2K25;

import mjSistemaANTDRON2K25.mjComida.mjAlimento;

public class mjHZangano extends mjAlimento implements mjHormiga {
    
    public mjHZangano(){
        this.mjTipoAlimento = "Omnivoro";
    }

    @Override
    public boolean mjComer(String alimento){  //Refactorizacion
        if(alimento.equalsIgnoreCase(mjTipoAlimento)){
            mjEstado = "VIVA";
            return true;
        }else{
            mjEstado = "MUERTA";
            return false;
        }
    }

    public void mjMostrarEstado(){
        System.out.println("Estado de la hormiga: " + mjEstado);
    }
}
