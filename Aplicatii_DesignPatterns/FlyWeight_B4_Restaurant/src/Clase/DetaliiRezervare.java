package Clase;

public class DetaliiRezervare {
    private int nrMasa;
    private String data;

    public DetaliiRezervare(int nrMasa, String data) {
        this.nrMasa = nrMasa;
        this.data = data;
    }

    @Override
    public String toString() {
        return "DetaliiRezervare{" +
                "nrMasa=" + nrMasa +
                ", data='" + data + '\'' +
                '}';
    }
}
