package ro.cts.pachet.seminar3.main;


import ro.cts.pachet.seminar3.clase.AgentieImobiliaraEager;
import ro.cts.pachet.seminar3.clase.AgentieImobiliaraLazy;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n---------------------------------- EAGER IMPLEMENTATION ----------------------------------\n");
        AgentieImobiliaraEager agentieImobiliara = AgentieImobiliaraEager.getAgentieImobiliaraEager();

        System.out.println(agentieImobiliara.toString());

        //METODA 2 AgentieImobiliara agentieImobiliara = null;
        //agentieImobiliara.getAgentieImobiliara();


        AgentieImobiliaraEager agentieImobiliaraNoua = AgentieImobiliaraEager.getAgentieImobiliaraEager();
        System.out.println(agentieImobiliaraNoua.toString());

        agentieImobiliaraNoua.setSite("blabla.ro");
        System.out.println(agentieImobiliara.toString());

        agentieImobiliaraNoua.posteazaAnunt("anunt nou");

        agentieImobiliara.posteazaAnunt("anunt nou nou");

        System.out.println(agentieImobiliaraNoua.toString());
        System.out.println(agentieImobiliara.toString());


        System.out.println("\n---------------------------------- LAZY IMPLEMENTATION ----------------------------------\n");

        AgentieImobiliaraLazy agentieLazy = AgentieImobiliaraLazy.getAgentieImobiliaraLazy("Max",10,"max.com",50000);
        AgentieImobiliaraLazy agentieLazyNoua = AgentieImobiliaraLazy.getAgentieImobiliaraLazy("Petru",23,"petru.com",80000);

        System.out.println(agentieLazyNoua.toString());

        System.out.println("\n---------------------------------- THREAD SAFE ----------------------------------\n");

    }
}