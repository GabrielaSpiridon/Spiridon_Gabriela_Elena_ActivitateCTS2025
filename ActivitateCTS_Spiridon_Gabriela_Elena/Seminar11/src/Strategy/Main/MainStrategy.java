package Strategy.Main;

import Strategy.Clase.*;

public class MainStrategy {
    public static void main(String[] args) {
        IMetodaPlata metodaPlataCardCalatorie = new CardCalatorie(1);

        Calator gigel = new Calator("Gigel",metodaPlataCardCalatorie);
        gigel.platesteBilet(5);
        gigel.setMetodaPlata(new PlataSms());
        gigel.platesteBilet(5);

        gigel.setMetodaPlata(metodaPlataCardCalatorie);
        gigel.platesteBilet(5);

    }
}