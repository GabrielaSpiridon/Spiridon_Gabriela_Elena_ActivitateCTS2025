package ro.cts.clase;

public class SupaLegume extends Supa{
    private double gramajCrutoane;

    public SupaLegume(int gramaj, double pretPerSutaGr, String ingrediente, double gramajCrutoane) {
        super(gramaj, pretPerSutaGr, ingrediente);
        this.gramajCrutoane = gramajCrutoane;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de legume cu " + gramajCrutoane + " grame crutoane este preparata.");
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret() + (this.gramajCrutoane/100)*getPretPerSutaGr()*2;
    }
}
