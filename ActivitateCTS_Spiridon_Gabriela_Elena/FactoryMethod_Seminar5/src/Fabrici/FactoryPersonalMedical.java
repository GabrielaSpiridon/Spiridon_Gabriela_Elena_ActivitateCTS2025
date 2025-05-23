package Fabrici;

import Clase_Facade.Angajat;
import Clase_Facade.Asistent;
import Clase_Facade.Medic;

import static Fabrici.TipPersonalMedical.ASISTENT;
import static Fabrici.TipPersonalMedical.MEDIC;

public class FactoryPersonalMedical implements FactoryPersonal{

    private double spor;

    public FactoryPersonalMedical(double spor) {
        this.spor = spor;
    }

    public void setSpor(double spor) {
        this.spor = spor;
    }

    public Angajat creeareAngajat(TipPersonal tipPersonal, String nume, double salariu){
        return switch (tipPersonal){
            case ASISTENT -> new Asistent(nume,salariu,spor);
            case MEDIC ->new Medic(nume,salariu,spor);
            default -> new Angajat(nume,salariu);
        };
    }
}
