package ClaseAdapterDeObiecte;

import static java.lang.Boolean.TRUE;

public class MedicamentFarmacie {
    private String nume;
    private float pret;
    private boolean esteInStoc;
    private String dataExpirare;

    public String getNume() {
        return nume;
    }

    public float getPret() {
        return pret;
    }

    public boolean isEsteInStoc() {
        return esteInStoc;
    }

    public String getDataExpirare() {
        return dataExpirare;
    }

    public MedicamentFarmacie(String nume, float pret, boolean esteInStoc, String dataExpirare ) {
        this.nume = nume;
        this.pret = pret;
        this.esteInStoc = esteInStoc;
        this.dataExpirare = dataExpirare;
    }

    public void cumparaMedicament(){
        if(this.esteInStoc == TRUE)
        {
            System.out.println("Medicamentul "+this.nume+" are pretul " + this.pret + " si expira " + this.dataExpirare + " a fost cumparat");
        }
        else{
            System.out.println("Medicamentul nu este in stoc si nu poate fi cumparat.");
        }
    }


}
