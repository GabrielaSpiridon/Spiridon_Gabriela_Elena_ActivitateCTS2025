package Main;


import Clase.AdapterProdus;
import Clase.ProdusBar;
import Clase.ProdusBucatarie;

public class Main {
    public static void vindeProdus(ProdusBucatarie produsBucatarie){
        produsBucatarie.achizitieBucatarie();
    }

    public static void main(String[] args) {
        ProdusBucatarie produsBucatarie = new ProdusBucatarie("Supa",20,true);
        ProdusBar produsBar = new ProdusBar("Cocktail", 30);

        vindeProdus(produsBucatarie);

        AdapterProdus adapterProdus = new AdapterProdus(produsBar);

        vindeProdus(adapterProdus);

    }
}