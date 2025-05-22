package Clase;

public class Client implements IFlyweight{
    private String numeClient;
    private String nrTelefon;

    public Client(String numeClient, String nrTelefon) {
        this.numeClient = numeClient;
        this.nrTelefon = nrTelefon;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    @Override
    public String toString() {
        return "Client{" +
                "numeClient='" + numeClient + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                '}';
    }

    @Override
    public void opereaza(DetaliiRezervare detaliiRezervare) {
        System.out.println(this.toString());
        System.out.println(detaliiRezervare.toString());
    }
}
