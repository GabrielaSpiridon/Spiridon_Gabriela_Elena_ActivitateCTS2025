package Clase;

public class AdapterProdus extends ProdusBucatarie{
    private ProdusBar produsBar;


    public AdapterProdus(ProdusBar produsBar) {
        super(produsBar.getNume(), produsBar.getPret(), true);
        this.produsBar = produsBar;
    }

    @Override
    public void achizitieBucatarie() {
        produsBar.achizitieBar();
    }
}
