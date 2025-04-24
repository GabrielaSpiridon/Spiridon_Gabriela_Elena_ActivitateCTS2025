package Fabrici;

import Clase_Facade.*;

import static Fabrici.TipPersonalNonMedical.PORTAR;
import static Fabrici.TipPersonalNonMedical.SECRETAR;

public class FactoryPersonalNonMedical implements FactoryPersonal{
    private int vechime;

    public FactoryPersonalNonMedical(int vechime) {
        this.vechime = vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    public Angajat creeareAngajat(TipPersonal tipPersonal, String nume, double salariu){
        return switch (tipPersonal){
            case PORTAR -> new Portar(nume,salariu,vechime);
            case SECRETAR ->new Secretar(nume,salariu,vechime);
            default -> new Angajat(nume,salariu);
        };
    }
}
