package ro.cts.pachet.seminar3.clase;

public class AgentieImobiliaraLazy {
    private String nume;
    private int nrAnunturi;
    private String site;
    private float cifraAfaceri;
    private static AgentieImobiliaraLazy agentieImobiliara = null;

    private AgentieImobiliaraLazy(String nume, int nrAnunturi, String site, float cifraAfaceri) {
        this.nume = nume;
        this.nrAnunturi = nrAnunturi;
        this.site = site;
        this.cifraAfaceri = cifraAfaceri;
    }

    public synchronized static AgentieImobiliaraLazy getAgentieImobiliaraLazy(String nume, int nrAnunturi, String site, float cifraAfaceri) {
        if(agentieImobiliara==null){
            agentieImobiliara = new AgentieImobiliaraLazy(nume,nrAnunturi,site,cifraAfaceri);
        }
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
