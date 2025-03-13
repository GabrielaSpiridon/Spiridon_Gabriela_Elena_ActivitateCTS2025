package ro.cts.pachet.seminar3.main;

import ro.cts.pachet.seminar3.anunturi.AgentieImobiliaraThreadSafe;
import ro.cts.pachet.seminar3.anunturi.Anunt;

public class MainThreadSafe {
    public static void main(String[] args){
        AgentieImobiliaraThreadSafe agentieImobiliaraThreadSafe=new AgentieImobiliaraThreadSafe("Imobiliare.ro",152000);
        Anunt anuntRomana = agentieImobiliaraThreadSafe.posteazaAnunt("Romana, nr.4, bl.A, ap. 20","Popescu",3);
        Anunt anuntUniversitate = agentieImobiliaraThreadSafe.posteazaAnunt("Universitate, nr.15, bl.F, ap. 58","Ionescu",2);
        Anunt anuntRomanaDublat = agentieImobiliaraThreadSafe.posteazaAnunt("Romana, nr.4, bl.A, ap. 20","Popescu",1);

        System.out.println(anuntRomanaDublat.toString());
    }
}
