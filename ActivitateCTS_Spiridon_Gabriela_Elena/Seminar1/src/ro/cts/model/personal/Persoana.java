package ro.cts.model.personal;

public abstract class Persoana implements IPersoana {
    protected String nume;
    protected int varsta;

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
    public Persoana() {
        this.nume = "";
        this.varsta = 0;
    }

    public abstract void afiseazaModInvatare();
}
