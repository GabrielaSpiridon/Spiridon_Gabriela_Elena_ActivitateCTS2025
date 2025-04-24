package Main;

import Clase_Facade.Pacient;
import Clase_Facade.PacientBuilder;

public class MainBuilder {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder("Gigel");
        Pacient pacient1 = pacientBuilder.setNumeInsotitor("George").setAreHalatDeInterior(true).getPacient();

        System.out.println(pacient1.toString());

        Pacient pacient2 = pacientBuilder.setNumeInsotitor("Avram").setAreMicDejun(true).getPacient();

        System.out.println(pacient1.toString());
        System.out.println(pacient2.toString());
    }
}