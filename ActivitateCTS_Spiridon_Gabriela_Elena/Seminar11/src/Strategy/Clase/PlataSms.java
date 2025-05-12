package Strategy.Clase;

public class PlataSms implements IMetodaPlata{

    public PlataSms() {
    }

    @Override
    public void plateste(float pretBilet) {
        System.out.println("Ai platit prin SMS.");
    }
}
