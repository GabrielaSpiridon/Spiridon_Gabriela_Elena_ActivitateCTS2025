package Observer.Clase;

public class Calator implements IObserver{
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(this.nume + ", ai primit urmatorul mesaj: "+mesaj);
    }
}
