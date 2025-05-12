package Strategy.Clase;

public class CardCalatorie implements IMetodaPlata{
    private int nrCalatoriiRamase;

    public CardCalatorie(int nrCalatoriiRamase) {
        this.nrCalatoriiRamase = nrCalatoriiRamase;
    }

    @Override
    public void plateste(float pretBilet) {
        if(this.nrCalatoriiRamase>0)
        {
            System.out.println("Ai platit cu cardul de calatorii.");
            this.nrCalatoriiRamase--;
        }
        else{
            System.out.println("Fara calatorii ramase.");
        }
    }
}
