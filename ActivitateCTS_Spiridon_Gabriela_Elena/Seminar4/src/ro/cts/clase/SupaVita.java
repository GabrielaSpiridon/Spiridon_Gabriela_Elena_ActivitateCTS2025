package ro.cts.clase;

public class SupaVita extends Supa{
    private double pretSmantana;

    public SupaVita(int gramaj, double pretPerSutaGr, String ingrediente, double pretSmantana) {
        super(gramaj, pretPerSutaGr, ingrediente);
        this.pretSmantana = pretSmantana;
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret()+this.pretSmantana;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de vita poate fi servita cu smantana la pretul de "+this.pretSmantana+" ron.");
    }
}
