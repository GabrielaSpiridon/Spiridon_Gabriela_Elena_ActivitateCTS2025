package ro.cts.pachet.seminar3.clase;

public class AgentieImobiliaraEager {
    private String nume;
    private int nrAnunturi;
    private String site;
    private float cifraAfaceri;
    private static AgentieImobiliaraEager agentieImobiliara = new AgentieImobiliaraEager("Agentie",4,"www.agentie.com",10000);

    private AgentieImobiliaraEager(String nume, int nrAnunturi, String site, float cifraAfaceri) {
        this.nume = nume;
        this.nrAnunturi = nrAnunturi;
        this.site = site;
        this.cifraAfaceri = cifraAfaceri;
    }

    public static AgentieImobiliaraEager getAgentieImobiliaraEager() {
        return agentieImobiliara;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void posteazaAnunt(String anuntNou){
        this.nrAnunturi++;
    }

    @Override
    public String toString() {
        return "AgentieImobiliara{" +
                "nume='" + nume + '\'' +
                ", nrAnunturi=" + nrAnunturi +
                ", site='" + site + '\'' +
                ", cifraAfaceri=" + cifraAfaceri +
                '}';
    }
}
