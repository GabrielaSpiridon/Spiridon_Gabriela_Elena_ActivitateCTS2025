package ClaseAdapterDeObiecte;

public class MedicamentSpital {

    private String nume;
    private float pret;

    public String getNume() {
        return nume;
    }

    public float getPret() {
        return pret;
    }

    public MedicamentSpital(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public void achizitioneazaMdicament(){
        prezintaReteta();
        System.out.println("Pacientul a achizitionat medicamentul " + this.nume + " cu pretul de  " + this.pret);
    }

    public void prezintaReteta(){
        System.out.println("Pacientul a prezentat reteta pentru medicamentul: "+ this.nume);
    }
}
