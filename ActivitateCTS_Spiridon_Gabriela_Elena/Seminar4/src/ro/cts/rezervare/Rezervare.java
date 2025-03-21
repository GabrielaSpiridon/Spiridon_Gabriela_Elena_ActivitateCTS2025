package ro.cts.rezervare;

public class Rezervare extends ARezervare{

    @Override
    public void descriere() {
        System.out.println("Aceasta este o rezervare");
    }

    public Rezervare(String numeClient, int nrPersoane, String dataRezervare, String oraRezervare) {
        super(numeClient, nrPersoane, dataRezervare, oraRezervare);
    }

    public Rezervare() {
    }

    @Override
    public ARezervare copiaza() {
        Rezervare rezervareNoua = new Rezervare();

        rezervareNoua.numeClient =this.numeClient;
        rezervareNoua.nrPersoane = this.nrPersoane;
        rezervareNoua.dataRezervare=this.dataRezervare;
        rezervareNoua.oraRezervare=this.oraRezervare;

        return  rezervareNoua;
    }

}
