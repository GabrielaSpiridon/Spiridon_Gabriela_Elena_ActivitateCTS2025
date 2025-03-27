package Clase;

public class Pacient {
    private String numePacient;
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuciDeCamera;
    private boolean areHalatDeInterior;
    private String numeInsotitor;

    protected Pacient(String numePacient, boolean arePatRabatabil, boolean areMicDejun, boolean arePapuciDeCamera, boolean areHalatDeInterior, String numeInsotitor) {
        this.numePacient = numePacient;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejun = areMicDejun;
        this.arePapuciDeCamera = arePapuciDeCamera;
        this.areHalatDeInterior = areHalatDeInterior;
        this.numeInsotitor = numeInsotitor;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    public void setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
    }

    public void setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.arePapuciDeCamera = arePapuciDeCamera;
    }

    public void setAreHalatDeInterior(boolean areHalatDeInterior) {
        this.areHalatDeInterior = areHalatDeInterior;
    }

    public void setNumeInsotitor(String numeInsotitor) {
        this.numeInsotitor = numeInsotitor;
    }

    @Override
    public String toString() {
        return "Pacient { " +
                " numePacient= " + numePacient +
                ", arePatRabatabil= " + arePatRabatabil +
                ", areMicDejun= " + areMicDejun +
                ", arePapuciDeCamera= " + arePapuciDeCamera +
                ", areHalatDeInterior= " + areHalatDeInterior +
                ", numeInsotitor= " + numeInsotitor  +
                " }";
    }
}
