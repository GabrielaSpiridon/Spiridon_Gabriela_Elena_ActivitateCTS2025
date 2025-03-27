package Clase;

public class PacientBuilder extends AbstractBuilder {
    private String numePacient;
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuciDeCamera;
    private boolean areHalatDeInterior;
    private String numeInsotitor;

    public PacientBuilder() {
        this.arePatRabatabil = false;
        this.areMicDejun = false;
        this.arePapuciDeCamera = false;
        this.areHalatDeInterior = false;
        this.numeInsotitor = "Alt pacient";
    }

    public PacientBuilder setNumePacient(String numePacient) {
        this.numePacient = numePacient;
        return this;
    }

    public PacientBuilder setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
        return this;
    }

    public PacientBuilder setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
        return this;
    }

    public PacientBuilder setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.arePapuciDeCamera = arePapuciDeCamera;
        return this;
    }

    public PacientBuilder setAreHalatDeInterior(boolean areHalatDeInterior) {
        this.areHalatDeInterior = areHalatDeInterior;
        return this;
    }

    public PacientBuilder setNumeInsotitor(String numeInsotitor) {
        this.numeInsotitor = numeInsotitor;
        return this;
    }

    public Pacient build(String numePacient){
        return new Pacient(numePacient,this.arePatRabatabil,this.areMicDejun,this.arePapuciDeCamera,this.areHalatDeInterior,this.numeInsotitor);
    }
}
