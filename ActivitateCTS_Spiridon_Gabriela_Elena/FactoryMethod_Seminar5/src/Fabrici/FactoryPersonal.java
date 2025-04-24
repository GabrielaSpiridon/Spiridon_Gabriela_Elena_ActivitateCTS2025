package Fabrici;

import Clase_Facade.Angajat;

public interface FactoryPersonal {
    Angajat creeareAngajat(TipPersonal tipPersonal, String nume, double salariu);
}
