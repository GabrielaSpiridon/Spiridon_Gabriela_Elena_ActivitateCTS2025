package Observer.Clase;

public class Autobuz extends MijlocTransport{
    public Autobuz(int numarLinie) {
        super(numarLinie);
    }

    @Override
    public void pleacaDeLaCapat() {
        trimiteMesaj("Autobuzul cu numarul: "+this.getNumarLinie() + " pleaca de la capatul liniei.");
    }

    public void schimbaTraseul(){
        trimiteMesaj("Autobuzul cu numarul: "+this.getNumarLinie() + " va circula astazi prin bulevardul Balcescu si nu va mai opri la statia Piata Romana.");
    }
}
