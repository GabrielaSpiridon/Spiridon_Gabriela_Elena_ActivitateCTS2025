package Decorator.ClaseDecorator;

public class NotaPlataRevelion extends PrinterFelicitare{
    public NotaPlataRevelion(Nota notaDePlata) {
        super(notaDePlata);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("La multi ani!");
    }
}
