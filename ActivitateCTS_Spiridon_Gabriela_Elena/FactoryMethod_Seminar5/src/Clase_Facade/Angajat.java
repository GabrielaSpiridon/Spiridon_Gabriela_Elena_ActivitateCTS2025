package Clase_Facade;

public class Angajat {
    private String nume;
    private double salariu;

    public Angajat(String nume, double salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "Angajat { " +
                "nume=' " + nume + '\'' +
                ", salariu= "  + salariu +
                '}';
    }
}
