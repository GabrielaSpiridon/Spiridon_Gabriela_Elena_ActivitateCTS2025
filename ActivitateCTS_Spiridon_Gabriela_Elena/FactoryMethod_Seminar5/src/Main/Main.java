package Main;


import Clase.Angajat;
import Fabrici.FactoryPersonalMedical;
import Fabrici.FactoryPersonalNonMedical;
import Fabrici.TipPersonalMedical;
import Fabrici.TipPersonalNonMedical;

public class Main {
    public static void main(String[] args) {
        FactoryPersonalMedical fabricaPersonalMedical = new FactoryPersonalMedical(10.5);
        FactoryPersonalNonMedical fabricaPersonalNonMedical = new FactoryPersonalNonMedical(5);

        Angajat medic = fabricaPersonalMedical.creeareAngajat(TipPersonalMedical.MEDIC,"Ion",5000);
        fabricaPersonalMedical.setSpor(15);

        Angajat asistent = fabricaPersonalMedical.creeareAngajat(TipPersonalMedical.ASISTENT,"Gigel",2000);
        fabricaPersonalMedical.setSpor(10);


        Angajat portar = fabricaPersonalNonMedical.creeareAngajat(TipPersonalNonMedical.PORTAR,"Viorel",1000);
        fabricaPersonalNonMedical.setVechime(5);

        Angajat secretar = fabricaPersonalNonMedical.creeareAngajat(TipPersonalNonMedical.SECRETAR,"Gheorghe",1500);
        fabricaPersonalNonMedical.setVechime(2);


        System.out.println(medic);
        System.out.println(asistent);
        System.out.println(portar);
        System.out.println(secretar);
    }
}