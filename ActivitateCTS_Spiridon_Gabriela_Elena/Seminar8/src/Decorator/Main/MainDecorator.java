package Decorator.Main;

import Decorator.ClaseDecorator.Nota;
import Decorator.ClaseDecorator.NotaDePlata;
import Decorator.ClaseDecorator.NotaPlataCraciun;
import Decorator.ClaseDecorator.NotaPlataRevelion;


public class MainDecorator {
    public static void main(String[] args) {

        NotaDePlata notaDePlata = new NotaDePlata(500.5f);
        notaDePlata.printare();

        Nota notaDecorata = new NotaPlataRevelion(notaDePlata);
        notaDecorata.printare();


        Nota notaDecorataCraciun =new NotaPlataCraciun(notaDePlata);

        Nota nota2 = new NotaPlataCraciun(notaDecorata);
        nota2.printare();

        notaDecorataCraciun.printare();
    }
}