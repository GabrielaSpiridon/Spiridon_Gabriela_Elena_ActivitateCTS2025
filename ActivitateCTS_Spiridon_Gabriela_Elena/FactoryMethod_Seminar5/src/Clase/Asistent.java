package Clase;

public class Asistent extends Angajat{
    private double spor;

    public Asistent(String nume, double salariu, double spor) {
        super(nume, salariu);
        this.spor = spor;
    }

    @Override
    public String toString() {
        return "Asistent{" +
                "spor=" + spor +
                super.toString() +
                '}';
    }
}
