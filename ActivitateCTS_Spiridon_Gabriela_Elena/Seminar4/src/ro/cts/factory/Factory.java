package ro.cts.factory;

import ro.cts.clase.Supa;
import ro.cts.clase.SupaCiuperci;
import ro.cts.clase.SupaLegume;
import ro.cts.clase.SupaVita;

public class Factory {
    private int gramaj;
    private double pretPerSutaGr;

    public Factory(int gramaj, double pretPerSutaGr) {
        this.gramaj = gramaj;
        this.pretPerSutaGr = pretPerSutaGr;
    }

    public Supa getSupa(TipSupa supe, String ingrediente, double extraSupa){
        switch (supe){
            case LEGUME:
                SupaLegume supaLegume = new SupaLegume(this.gramaj,this.pretPerSutaGr,ingrediente,extraSupa);
                return supaLegume;
            case VITA:
                SupaVita supaVita = new SupaVita(this.gramaj,this.pretPerSutaGr,ingrediente,extraSupa);
                return supaVita;
            case CIUPERCI:
                SupaCiuperci supaCiuperci=new SupaCiuperci(this.gramaj,this.pretPerSutaGr,ingrediente,extraSupa);
                return supaCiuperci;
            default:
                return null;
        }
    }
}
