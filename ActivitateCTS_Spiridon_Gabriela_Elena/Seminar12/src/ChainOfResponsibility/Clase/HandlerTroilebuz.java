package ChainOfResponsibility.Clase;

public class HandlerTroilebuz extends ARecomandaTransport{
    @Override
    public void recomanda(int distanta) {
        if(distanta<0){
            System.out.println("Parametru introdus incorect.");
        }
        if(distanta<=3){
            System.out.println("Se recomanda sa iei Troilebuzul.");
        }
        else if(urmator!=null){
            urmator.recomanda(distanta);
        }
    }
}
