package Clase;

import static java.lang.Boolean.TRUE;

public class ProdusBucatarie {
    private String nume;
    private float pret;
    private boolean esteInStoc;

    public ProdusBucatarie(String nume, float pret,boolean esteInStoc) {
        this.nume = nume;
        this.pret = pret;
        this.esteInStoc = esteInStoc;
    }

    public String getNume() {
        return nume;
    }

    public float getPret() {
        return pret;
    }
    public boolean isEsteInStoc() {
        return esteInStoc;
    }

    public void achizitieBucatarie()
    {
        if(this.esteInStoc==TRUE)
        {
            System.out.println("Produsul "+ this.nume + " are pretul "+ this.pret);
        }
        else{
            System.out.println("Produsul nu este in stoc si nu poate fi cumparat.");
        }
    }

}
