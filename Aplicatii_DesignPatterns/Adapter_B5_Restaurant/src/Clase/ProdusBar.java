package Clase;

import static java.lang.Boolean.TRUE;

public class ProdusBar {
    private String nume;
    private float pret;

    public ProdusBar(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public float getPret() {
        return pret;
    }
    public void achizitieBar()
    {
            System.out.println("Produsul "+ this.nume + " are pretul "+ this.pret);

    }

}
