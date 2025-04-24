package Facade.ClaseFacade;

public class Receptionist {
    public String poateLuaLocLaMasa(Masa masa){
        Ospatar ospatar1 = new Ospatar();
        Picolo picolo = new Picolo();

        if(masa.isEsteLibera()){
            if(picolo.esteDebarasata(masa)){
                if(ospatar1.esteAranjataMasa(masa)){
                    return "Luati loc la masa "+ masa.getNumarMasa();
                }
                else{
                    return "Masa "+ masa.getNumarMasa() + " nu este aranjata. Asteptati putin.";
                }
            }
            else{
                return "Masa "+masa.getNumarMasa() +" nu este debarasata. Asteptati putin, tocmai s-a ridicat cineva.";
            }
        }
        else{
            return "Masa "+masa.getNumarMasa() +" nu este disponibila.";
        }
    }
}
