package ChainOfResponsibility.Clase;

public abstract class ARecomandaTransport {
    protected ARecomandaTransport urmator;  //succesor

    public void setUrmator(ARecomandaTransport urmator) {
        this.urmator = urmator;
    }

    public abstract void recomanda(int distanta);
}
