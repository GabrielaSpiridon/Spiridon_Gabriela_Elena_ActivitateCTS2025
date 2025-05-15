package Template.Main;

import Template.Clase.AMetrou;
import Template.Clase.Metrou;
import Template.Clase.MetrouSpecial;

public class MainTemplate {
    public static void main(String[] args) {
        AMetrou metrou = new Metrou(210);
        AMetrou metrouSpecial = new MetrouSpecial();

        metrou.circulaTur();
        System.out.println(" ");
        metrou.circulaRetur();

        System.out.println(" ");
        System.out.println(" ");

        metrouSpecial.circulaTur();

        System.out.println(" ");
        metrouSpecial.circulaRetur();
        System.out.println(" ");

    }
}