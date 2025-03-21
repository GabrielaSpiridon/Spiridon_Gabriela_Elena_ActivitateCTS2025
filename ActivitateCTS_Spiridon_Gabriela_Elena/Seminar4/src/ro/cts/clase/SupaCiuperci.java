package ro.cts.clase;

public class SupaCiuperci extends Supa{
    private double cantitateCiuperci;

    public SupaCiuperci(int gramaj, double pretPerSutaGr, String ingrediente, double cantitateCiuperci) {
        super(gramaj, pretPerSutaGr, ingrediente);
        this.cantitateCiuperci = cantitateCiuperci;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de ciuperci " + cantitateCiuperci + " grame ciuperci este preparata.");
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret() + (this.cantitateCiuperci/100)*getPretPerSutaGr();
    }
}
