package ChainOfResponsibility.Clase;

public class HandlerMetrou extends ARecomandaTransport{

    @Override
    public void recomanda(int distanta) {
        if(distanta>10){
            System.out.println("Se recomanda sa iei Metroul.");
        }
        else if(urmator!=null){
            urmator.recomanda(distanta);
        }
    }
}
