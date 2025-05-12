package Observer.Clase;

public interface ISubiect {
    void adaugaObservator(IObserver observer);
    void stergeObservator(IObserver observer);
    void trimiteMesaj(String mesaj);
}
