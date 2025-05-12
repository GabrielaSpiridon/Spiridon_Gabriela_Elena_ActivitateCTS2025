package Strategy.Clase;

public class Calator {
    private String numeCalator;
    private IMetodaPlata metodaPlata;

    public Calator(String numeCalator) {
        this.numeCalator = numeCalator;
        this.metodaPlata = new CardBancar(10);
    }

    public Calator(String numeCalator, IMetodaPlata metodaPlata) {
        this.numeCalator = numeCalator;
        this.metodaPlata = metodaPlata;
    }

    public void platesteBilet(float pretBilet){
        metodaPlata.plateste(pretBilet);
    }

    public void setMetodaPlata(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }
}
