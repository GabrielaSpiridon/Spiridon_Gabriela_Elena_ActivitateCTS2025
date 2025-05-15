package ChainOfResponsibility.Main;

import ChainOfResponsibility.Clase.*;


public class MainChainOfResponsibility {
    public static void main(String[] args) {

        ARecomandaTransport troilebuz = new HandlerTroilebuz();
        ARecomandaTransport autobuz = new HandlerAutobuz();
        ARecomandaTransport tramvai = new HandlerTramvai();
        ARecomandaTransport metrou = new HandlerMetrou();

        troilebuz.setUrmator(autobuz);
        autobuz.setUrmator(tramvai);
        tramvai.setUrmator(metrou);

        troilebuz.recomanda(2);

        troilebuz.recomanda(15);

        troilebuz.recomanda(7);

        troilebuz.recomanda(5);
    }
}