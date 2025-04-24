package Proxy.ClaseProxy;

public class ProxyNumarPersoane implements IRezervare{

    private IRezervare rezervare;

    public ProxyNumarPersoane(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(String numeClient, int numarPersoane, int ora) {
        if(numarPersoane > 4){
            this.rezervare.rezerva(numeClient,numarPersoane,ora);
        }
        else{
            System.out.println("Va asteptam la restaurant!");
        }
    }
}
