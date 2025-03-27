package Main;

import Clase.Pacient;
import Clase.PacientBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder();
        pacientBuilder.setNumeInsotitor("Marcel").setAreHalatDeInterior(true).setArePapuciDeCamera(true);

        Pacient pacient1 = pacientBuilder.build("Costel");
        System.out.println(pacient1.toString());

        Pacient pacient2 =  pacientBuilder.setNumeInsotitor("Ana").build("Maria");
        System.out.println(pacient2.toString());

        Pacient pacient3 =  pacientBuilder.setNumeInsotitor("Ioana").build("Viorica");
        System.out.println(pacient3.toString());
    }
}