package ro.cts.rezervare;

public abstract class ARezervare {
    protected String numeClient;
    protected int nrPersoane;
    protected String dataRezervare;
    protected String oraRezervare;

    public ARezervare() {
        this.numeClient = "Necunoscut";
        this.nrPersoane = 2;
        this.dataRezervare="10.10.2025";
        this.oraRezervare="08:30";
    }

    public ARezervare(String numeClient, int nrPersoane, String dataRezervare, String oraRezervare) {
        if(numeClient.length()>3) {
            this.numeClient = numeClient;
        }
        else{
            this.numeClient = "Necunoscut";
        }
        if(nrPersoane>=2){
            this.nrPersoane = nrPersoane;
        }
        else {
            this.nrPersoane = 10;
        }
        if(dataRezervare.length()==8){
            this.dataRezervare = dataRezervare;
        }
        else {
            this.dataRezervare = "10.10.2025";
        }
        if(oraRezervare.length()==5){
            this.oraRezervare = oraRezervare;
        }
        else{
            this.oraRezervare = "08:30";
        }

    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "numeClient='" + numeClient + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", dataRezervare='" + dataRezervare + '\'' +
                ", oraRezervare='" + oraRezervare + '\'' +
                '}';
    }

    public abstract void descriere();
    public abstract ARezervare copiaza();
}
