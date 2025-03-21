package ro.cts.main;

import ro.cts.clase.Supa;
import ro.cts.factory.Factory;
import ro.cts.factory.TipSupa;

public class MainFactory {
    public static void main(String[] args) {
        Factory factory = new Factory(200,15.6);
        Supa supaCiuperci = factory.getSupa(TipSupa.CIUPERCI,"Apa, Ciuperci, Sare",100);
        supaCiuperci.preparareSupa();
        Supa supaVita = factory.getSupa(TipSupa.VITA,"Apa, Vita, Sare",250);
        supaVita.preparareSupa();
        Supa supaLegume = factory.getSupa(TipSupa.LEGUME,"Apa, Legume, Sare",90);
        supaLegume.preparareSupa();
    }
}