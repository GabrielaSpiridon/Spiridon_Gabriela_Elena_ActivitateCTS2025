package Decorator.ClaseDecorator;

public class NotaPlataCraciun extends PrinterFelicitare{
    public NotaPlataCraciun(Nota notaDePlata) {
        super(notaDePlata);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("Craciun fericit!");
    }
}
