package Observer.Main;

import Observer.Clase.Autobuz;
import Observer.Clase.Calator;
import Observer.Clase.IObserver;
import Observer.Clase.MijlocTransport;

public class MainObserver {
    public static void main(String[] args) {
        IObserver calator1 = new Calator("Gigel");
        IObserver calator2 = new Calator("Ana");
        IObserver calator3 = new Calator("Ion");

        MijlocTransport autobuz = new Autobuz(100);
        autobuz.adaugaObservator(calator1);
        autobuz.adaugaObservator(calator2);
        autobuz.adaugaObservator(calator3);

        autobuz.pleacaDeLaCapat();

        autobuz.stergeObservator(calator2);

        ((Autobuz)autobuz).schimbaTraseul();
    }
}