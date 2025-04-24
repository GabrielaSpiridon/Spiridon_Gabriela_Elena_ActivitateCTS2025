package Proxy.Main;


import Proxy.ClaseProxy.IRezervare;
import Proxy.ClaseProxy.ProxyNumarPersoane;
import Proxy.ClaseProxy.ProxyOra;
import Proxy.ClaseProxy.Rezervare;

public class MainProxy {
    public static void main(String[] args) {

        IRezervare rezervare = new Rezervare();
        rezervare.rezerva("Popescu",5,15);

        IRezervare proxy = new ProxyNumarPersoane(rezervare);
        proxy.rezerva("Ana",3,12);

        IRezervare proxyOra = new ProxyOra(proxy);
        proxyOra.rezerva("Gheorghe",6,19);
    }
}