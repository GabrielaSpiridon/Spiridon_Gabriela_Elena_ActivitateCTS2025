package Clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactoryRezervare {
    private Map<String, IFlyweight> clienti;

    public FlyweightFactoryRezervare() {
        this.clienti = new HashMap<>();
    }

    public IFlyweight getClient(String nume,String nrTelefon){
        if(!clienti.containsKey(nume)){
            clienti.put(nume,new Client(nume,nrTelefon));
        }
        return clienti.get(nume);
    }

    public IFlyweight getClient(String nume) throws Exception{
        if(clienti.containsKey(nume)){
            return clienti.get(nume);
        }
        else {
            throw new Exception("Nu exista clientul");
        }
    }
}
