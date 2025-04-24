package Clase_Facade;

public class Secretar extends Angajat{
    private int vechime;

    public Secretar(String nume, double salariu, int vechime) {
        super(nume, salariu);
        this.vechime = vechime;
    }

    @Override
    public String toString() {
        return "Secretar{" +
                "vechime=" + vechime +
                super.toString() +
                '}';
    }
}
