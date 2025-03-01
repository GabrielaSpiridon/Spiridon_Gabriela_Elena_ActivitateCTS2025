package ro.cts.model.personal;

public class Profesor extends Persoana implements IPredabil {

    private int id;
    private int aniVechime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAniVechime() {
        return aniVechime;
    }

    public void setAniVechime(int aniVechime) {
        this.aniVechime = aniVechime;
    }

    public Profesor(String nume, int varsta, int id, int aniVechime) {
        super(nume, varsta);
        this.id = id;
        this.aniVechime = aniVechime;
    }

    @Override
    public void afiseazaModInvatare() {
        StringBuilder sb = new StringBuilder("Profesorul invata, prin predare, de ");
        sb.append(this.aniVechime);
        sb.append(" ani");
        System.out.println(sb);
    }

    @Override
    public void preda() {
        StringBuilder sb = new StringBuilder("Profesorul ");
        sb.append(super.nume).append(" preda, de obicei, la curs");
        System.out.println(sb);
    }
}
