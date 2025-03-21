package ro.cts.main;

import ro.cts.clase.Supa;
import ro.cts.factory.Factory;
import ro.cts.factory.TipSupa;
import ro.cts.rezervare.ARezervare;
import ro.cts.rezervare.Rezervare;

public class MainPrototype {
    public static void main(String[] args) {
        ARezervare rezervare = new Rezervare("Ana",10,"21.10.2025","08:40");

        ARezervare rezervare2 = rezervare.copiaza();

        ARezervare rezervare3=rezervare.copiaza();

        System.out.println(rezervare);
        System.out.println(rezervare2);
        System.out.println(rezervare3);
    }
}