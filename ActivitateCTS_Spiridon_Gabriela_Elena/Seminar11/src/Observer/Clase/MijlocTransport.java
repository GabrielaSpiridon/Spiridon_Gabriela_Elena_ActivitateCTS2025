package Observer.Clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport implements ISubiect {
    private int numarLinie;
    private List<IObserver> calatori;

    public int getNumarLinie() {
        return numarLinie;
    }

    public List<IObserver> getCalatori() {
        return calatori;
    }

    public MijlocTransport(int numarLinie) {
        this.numarLinie = numarLinie;
        this.calatori = new ArrayList<IObserver>();
    }

    @Override
    public void adaugaObservator(IObserver observer) {
        this.calatori.add(observer);
    }

    @Override
    public void stergeObservator(IObserver observer) {
        this.calatori.remove(observer);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(IObserver calator: calatori){
            calator.primesteMesaj(mesaj);
        }
    }

    public abstract void pleacaDeLaCapat();
}
