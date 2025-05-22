package Main;


import Clase.DetaliiRezervare;
import Clase.FlyweightFactoryRezervare;

public class Main {
    public static void main(String[] args) {
        FlyweightFactoryRezervare rezervare = new FlyweightFactoryRezervare();
        rezervare.getClient("Ana","0786754542");
        rezervare.getClient("Mara","0732456742");
        rezervare.getClient("Gigel","0712345552");

        DetaliiRezervare rez1 = new DetaliiRezervare(3,"12.03.2025");
        DetaliiRezervare rez2 = new DetaliiRezervare(2,"26.03.2025");
        DetaliiRezervare rez3 = new DetaliiRezervare(1,"20.2.2025");

        try{
            rezervare.getClient("Ana").opereaza(rez2);
            System.out.println();
            rezervare.getClient("Gigel").opereaza(rez2);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}