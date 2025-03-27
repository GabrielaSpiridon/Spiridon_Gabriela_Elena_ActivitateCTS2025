package Fabrici;

import Clase.Angajat;

public interface FactoryPersonal {
    Angajat creeareAngajat(TipPersonal tipPersonal, String nume, double salariu);
}
