package pl.projects.bartek.exercises.dziedziczenie;

public class Main {

    public static void main(String[] args) {

        Pies pies1 = new Pies("Burek");

        System.out.println("imie zwierzaka: " + pies1.getImie());
        pies1.badzMilutki();
        pies1.halasuj();


        Kot kot1 = new Kot();

        kot1.mrucz();

        System.out.println("Kot1 - ");
        kot1.mrucz();
        kot1.halasuj();


        Pies mojPies = new Pies(4);

        mojPies.biegnij(5);


    }
}